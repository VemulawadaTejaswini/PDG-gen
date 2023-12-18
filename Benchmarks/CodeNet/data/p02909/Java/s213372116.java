import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String today = scanner.nextLine();

        switch (today) {
            case "Sunny":
                System.out.println("Cloudy");
                return;
            case "Cloudy":
                System.out.println("Rainy");
                return;
            case "Rainy":
                System.out.println("Sunny");
                return;
        }
    }
}