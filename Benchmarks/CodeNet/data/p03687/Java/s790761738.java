import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(Scanner sc) {
        String s = sc.nextLine();

        int min = Integer.MAX_VALUE;
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            int cnt = 0;
            String ss = s;
            while (!check(ss)) {
                ss = operate(ss, ch);
                ++cnt;
            }
            if (cnt < min) {
                min = cnt;
            }
        }
        _out.println(min);
    }
    private String operate(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; ++i) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if (ch2 == ch) {
                sb.append(ch2);
            } else {
                sb.append(ch1);
            }
        }
        return sb.toString();
    }
    private boolean check(String s) {
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
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