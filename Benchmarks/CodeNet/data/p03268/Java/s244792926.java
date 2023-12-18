
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long num1 = 0;
        long num2 = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % k == 0) {
                ++num1;
            }
            if (i % k == (k / 2)) {
                ++num2;
            }
        }
        if (k % 2 == 1) {
            System.out.println(num1 * num1 * num1);
        } else {
            long result = num1 * num1 * num1 + num2 * num2 * num2;
            System.out.println(result);
        }
    }
}
