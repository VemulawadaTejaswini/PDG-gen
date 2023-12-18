import java.io.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _err = new PrintWriter(System.err);

    private long count;

    private void solve(Scanner sc, PrintWriter out) {
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (x < 0 && y < 0) {
            if (x > y) {
                ++count; // B
                count += Math.abs(y) - Math.abs(x); // A
                ++count; // B
            } else {
                count += Math.abs(x) - Math.abs(y); // A
            }
        } else if (x >= 0 && y < 0) {
            if (x > Math.abs(y)) {
                ++count; // B
                count += x - Math.abs(y); // A
            } else {
                count += Math.abs(y) - x; // A
                ++count; // B
            }
        } else if (x < 0 && y > 0) {
            if (Math.abs(x) > y) {
                count += Math.abs(x) - y; // A
                ++count; // B
            } else {
                ++count; // B
                count += y - Math.abs(x); // A
            }
        } else if (x < 0 && y == 0) {
            count += Math.abs(x); // A
        } else {
            if (x > y) {
                ++count; // B
                count += x - y; // A
                ++count; // B
            } else {
                count += y - x; // A
            }
        }

        out.println(count);
    }
    private long C(long n, long r) {
        long res = 1;
        for (long i = n; i > n - r; --i) {
            res *= i;
        }
        for (long i = r; i > 1; --i) {
            res /= i;
        }
        return res;
    }
    private long P(long n, long r) {
        long res = 1;
        for (long i = n; i > n - r; --i) {
            res *= i;
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
        PrintWriter out = new PrintWriter(System.out);
        new Main().solve(sc, out);
        out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}