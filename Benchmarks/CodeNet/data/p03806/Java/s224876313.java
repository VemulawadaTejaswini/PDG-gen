import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private int N;
    private int Ma;
    private int Mb;
    private int[] a;
    private int[] b;
    private int[] c;

    private Map<String, Integer> memo = new HashMap<>();

    private void solve(Scanner sc) {
        N = sc.nextInt();
        Ma = sc.nextInt();
        Mb = sc.nextInt();
        a = new int[N];
        b = new int[N];
        c = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int r = calc(0, 0, 0);
        if (r == Integer.MAX_VALUE) {
            _out.println(-1);
        } else {
            _out.println(r);
        }
    }
    private int calc(int d, int ma, int mb) {
        String key = ma + "/" + mb;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (d >= N) {
            if (d == N && ma > 0 && mb > 0 && ma % Ma == 0 && mb % Mb == 0 && ma / Ma == mb / Mb) {
                return 0;
            }
            return Integer.MAX_VALUE;
        }

        int r1 = calc(d + 1, ma, mb);
        int r2 = calc(d + 1, ma + a[d], mb + b[d]);
        if (r2 != Integer.MAX_VALUE) {
            r2 = r2 + c[d];
        }
        int r = Math.min(r1, r2);
        memo.put(key, r);
        return r;
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