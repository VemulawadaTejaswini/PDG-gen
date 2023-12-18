import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long c = scanner.nextInt();
        scanner.close();

        if (4 * a * b < Math.pow(c - a - b, 2) && c - a - b > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
