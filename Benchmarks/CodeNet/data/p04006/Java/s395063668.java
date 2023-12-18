import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = sc.nextInt();
        }

        long[][] b = new long[N][N];
        long ans = 0;
        for (int i = 0; i < N; ++i) {
            b[0][i] = a[i];
            ans += a[i];
        }
        for (int k = 1; k < N; ++k) {
            long sum = 0;
            for (int i = 0; i < N; ++i) {
                int idx = (i > 0 ? i - 1 : N - 1);
                b[k][i] = Math.min(b[k - 1][idx], a[i]);
                sum += b[k][i];
            }
            ans = Math.min(ans, (long)k * x + sum);
        }
        _out.println(ans);
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