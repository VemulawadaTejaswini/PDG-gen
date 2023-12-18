import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static long MOD = 1000000007L;

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        _out.println(search(s1, s2, 0, -1, -1));
    }
    private Map<String, Long> memo = new HashMap<>();
    private long search(String s1, String s2, int idx, int c1, int c2) {
        String key = idx + "-" + c1 + "-" + c2;
        Long tmp = memo.get(key);
        if (tmp != null) {
            return tmp;
        }

        if (idx >= s1.length()) {
            memo.put(key, 1L);
            return 1;
        }

        long ans = 0;
        if (s1.charAt(idx) == s2.charAt(idx)) {
            for (int i = 0; i < 3; ++i) {
                if (i == c1 || i == c2) {
                    continue;
                }
                ans = (ans + search(s1, s2, idx + 1, i, i)) % MOD;
            }
        } else {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    if (i == j || c1 == i || c2 == j) {
                        continue;
                    }
                    ans = (ans + search(s1, s2, idx + 2, i, j)) % MOD;
                }
            }
        }
        memo.put(key, ans);
        return ans;
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