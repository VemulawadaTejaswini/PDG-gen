import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String next = scanner.next();
        scanner.close();

        if (next.substring(0, input.length()).equals(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}