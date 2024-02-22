import java.util.Scanner;

public class FlowerShop {
    private Flower[] inventory;
    private Scanner scanner;

    public FlowerShop() {
        inventory = new Flower[10]; // Inventory size of 10
        scanner = new Scanner(System.in);
    }

    // Method to populate the inventory with Flower objects
    public void enterFlowerData() {
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter details for flower " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            inventory[i] = new Flower(name, color, price, quantity);
        }
    }

    // Method to display all flowers in the inventory
    public void displayAllFlowers() {
        for (Flower flower : inventory) {
            System.out.println(flower);
        }
    }

    // Method to calculate and display the total value of the inventory
    public void displayTotalValue() {
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("Total inventory value: " + totalValue);
    }

    // Main method to drive the program
    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();

        // Populate the inventory with flower data
        shop.enterFlowerData();

        // Display all flower details
        shop.displayAllFlowers();

        // Display total value of the inventory
        shop.displayTotalValue();
    }
}

// You can keep the Flower class the same as before.
