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

    private void solve(Scanner sc) {
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        E = sc.nextInt();
        F = sc.nextInt();

        double max = 0;
        int ans1 = 0, ans2 = 0;
        for (int x = 100; x <= F; x += 100) {
            for (int y = 0; y <= F; ++y) {
                if (x + y > F) {
                    continue;
                }
                if (100 * y > x * E) {
                    continue;
                }
                if (okW(x, A, B) && okS(y, C, D) && 100.0 * y / (x + y) > max) {
                    max = 100.0 * y / (x + y);
                    ans1 = x;
                    ans2 = y;
                }
            }
        }

        _out.println((ans1 + ans2) + " " + ans2);
    }
    private boolean okW(int a, int A, int B) {
        for (int i = 0; 100 * A * i <= a; ++i) {
            for (int j = 0; 100 * B * j <= a; ++j) {
                if (a == 100 * A * i + 100 * B * j) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean okS(int b, int C, int D) {
        for (int i = 0; C * i <= b; ++i) {
            for (int j = 0; D * j <= b; ++j) {
                if (b == C * i + D * j) {
                    return true;
                }
            }
        }
        return false;
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