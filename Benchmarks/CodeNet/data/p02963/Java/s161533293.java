
import java.util.Scanner;

public class Main {
    private static long MAX = 1000000000;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long s = scanner.nextLong();
        if (s < MAX) {
            System.out.println("0 0  " + s + " 0 0 1");
            return;
        }

        final long s2 = s * 2;

        final long x3 = intSqrt(s2) + 1;

        final long diff = x3 * x3 - s2;
        System.out.println(diff);
        long x1 = 0;
        long y2 = 0;
        for (int i = intSqrt(diff); i >= 1; i--) {
            if (diff % i == 0) {
                x1 = x3- diff / i;
                y2 = x3 - i;
            }
        }

        System.out.println(x1 + " 0 0 " + y2 + " " + x3 + " " + x3);
    }

    private static int intSqrt(long a) {
        return (int) Math.sqrt(a);
    }
}
