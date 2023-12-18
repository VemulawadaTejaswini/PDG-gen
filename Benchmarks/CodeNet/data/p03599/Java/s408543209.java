import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static final int INF = Integer.MAX_VALUE / 2;

    private int A, B, C, D, E, F;

    private int ans1, ans2;
    private double max = 0;

    private void solve(Scanner sc) {
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        E = sc.nextInt();
        F = sc.nextInt();

        search(0, 0, 0, 0);

        _out.println((ans1 + ans2) + " " + ans2);
    }
    private void search(int ka, int kb, int kc, int kd) {
        int a = (ka * 100 * A + kb * 100 * B);
        int b = (kc * C + kd * D);
        if (a + b >= F || 100 * b >= a * E) {
            if (100.0 * b / (a + b) > max) {
                max = 100.0 * b / (a + b);
                ans1 = a;
                ans2 = b;
            }
            return;
        }

        search(ka + 1, kb, kc, kd);
        search(ka, kb + 1, kc, kd);
        search(ka, kb, kc + 1, kd);
        search(ka, kb, kc, kd + 1);
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}