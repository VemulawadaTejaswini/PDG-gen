
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong() / 2;
        }

        long base = array[0] * array[1] / computeGCD(array[0], array[1]);
        for (int i = 2; i < n; i++) {
            if (base > m) {
                System.out.println(0);
                return;
            }

            base = base * array[i] / computeGCD(base, array[i]);
        }

        System.out.println((m / base + 1) / 2);
    }

    private static long computeGCD(final long a, final long b) {
        if (b > a) {
            return computeGCD(b, a);
        }

        if (b == 0) {
            return a;
        }

        return computeGCD(b, a % b);
    }
}
