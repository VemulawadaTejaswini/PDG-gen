import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        if (input.equals("ABC")) {
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}
