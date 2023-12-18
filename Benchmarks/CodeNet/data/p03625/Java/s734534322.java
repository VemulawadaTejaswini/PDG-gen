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
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            long A = sc.nextLong();
            list.add(A);
        }
        Collections.sort(list, Comparator.reverseOrder());
        long a = -1;
        long b = -1;
        for (int i = 0; i < N - 1; ++i) {
            if (list.get(i).equals(list.get(i + 1))) {
                if (a == -1) {
                    a = list.get(i);
                    ++i;
                } else if (b == -1) {
                    b = list.get(i);
                    break;
                }
            }
        }
        if (a > 0 && b > 0) {
            _out.println(a * b);
        } else {
            _out.println(0);
        }
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