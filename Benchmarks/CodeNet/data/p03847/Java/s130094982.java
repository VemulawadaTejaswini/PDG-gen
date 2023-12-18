import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static final int INF = Integer.MAX_VALUE / 2;

    private static final long MOD = 1_000_000_007;

    private void solve(Scanner sc) {
        long N = sc.nextLong();

        _out.println((dfs(N, N) % MOD));
    }
    private Map<String, Long> memo = new HashMap<>();
    private long dfs(long s, long x) {
        if (s == 0) {
            return 1;
        }

        String key = s + "/" + x;
        Long tmp = memo.get(key);
        if (tmp != null) {
            return tmp;
        }

        long res = 0;

        res = (res + dfs(s >>> 1, x >>> 1)) % MOD;

        if (s >= 2) {
            res = (res + dfs((s - 2) >>> 1, x >>> 1)) % MOD;
        }

        res = (res + dfs((s - 1) >>> 1, (x - 1) >>> 1)) % MOD;

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