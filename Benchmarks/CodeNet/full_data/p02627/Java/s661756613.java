import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        scanner.close();

        if (str.matches("[A-Z]+")) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }

    }
}
