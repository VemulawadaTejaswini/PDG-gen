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
        int K = sc.nextInt();
        int[] l = new int[N];
        for (int i = 0; i < N; ++i) {
            l[i] = sc.nextInt();
        }

        _out.println(search(0, K, l));
    }
    private Map<String, Long> memo = new HashMap<>();
    private long search(int d, int k, int[] l) {
        String key = d + ":" + k;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (d == l.length) {
            return 0;
        }

        long res1 = search(d + 1, k, l);
        long res2 = 0;
        if (k - 1 >= 0) {
            res2 = search(d + 1, k - 1, l) + l[d];
        }

        long res = Math.max(res1, res2);
        memo.put(key, res);
        return res;
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