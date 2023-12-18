import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private int N;
    private int W;
    private long[] w;
    private long[] v;

    private long ans;

    private void solve(Scanner sc) {
        N = sc.nextInt();
        W = sc.nextInt();
        w = new long[N];
        v = new long[N];
        for (int i = 0; i < N; ++i) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        search(0, 0, 0);

        _out.println(ans);
    }
    private void search(int d, long weight, long value) {
        if (d == N) {
            if (value > ans) {
                ans = value;
            }
            return;
        }

        if (weight + w[d] <= W) {
            search(d + 1, weight + w[d], value + v[d]);
        }
        search(d + 1, weight, value);
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