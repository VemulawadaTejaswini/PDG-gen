import java.util.Scanner;

public class Main {

    private static long calcRec(long shorter, long longer) {
        long leftover = longer % shorter;
        long len = (longer / shorter) * 2 * shorter;

        if (leftover == 0) {
            return len - shorter;

        } else {
            return len + calcRec(leftover, shorter);
        }
    }

    private static long calcLen(long n, long x) {

        long len = n; // first two bounces == x + (n - x)

        if (2 * x == n) {
            return len + x;

        } else if (2 * x < n) {
            return len + calcRec(x, n - x);

        } else {
            return len + calcRec(n - x, x);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();

        System.out.println(calcLen(n, x));
    }
}
