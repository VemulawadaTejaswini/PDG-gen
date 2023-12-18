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
        String s = sc.nextLine();
        long[][] dp = new long[s.length() + 1][4];
        dp[s.length()][3] = 1;
        for (int i = s.length() - 1; i >= 0; --i) {
            char ch = s.charAt(i);
            for (int j = 3; j >= 0; --j) {
                if (j == 3) {
                    long m = (ch == '?' ? 3 : 1);
                    dp[i][j] = (m * dp[i + 1][j]) % MOD;
                } else {
                    long m1 = (ch == '?' ? 3 : 1);
                    long m2 = (ch == '?' || j == ch - 'A' ? 1 : 0);
                    dp[i][j] = (m1 * dp[i + 1][j] + m2 * dp[i + 1][j + 1]) % MOD;
                }
            }
        }
        _out.println(dp[0][0]);
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