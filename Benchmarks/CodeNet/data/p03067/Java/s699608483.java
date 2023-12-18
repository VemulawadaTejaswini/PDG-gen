import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        if (c > Math.min(a, b) && c < Math.max(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
