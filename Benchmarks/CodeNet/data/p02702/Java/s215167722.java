import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String s = in.next();
            int n = s.length();
            int[] mod = new int[n + 1];
            long res = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                long p = Arith.pow(10, s.length() - 1 - i, 2019);
                mod[i] = (mod[i + 1] + (s.charAt(i) - '0') * (int) p) % 2019;
            }

            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i <= n; i++) {
                hm.merge(mod[i], 1, Integer::sum);
            }

            for (long x : hm.values()) {
                res += x * (x - 1) / 2;
            }

            out.println(res);


        }

    }

    static class Arith {
        public static long pow(long a, long n, long MOD) {
            return n == 0 ? 1 : (pow(a * a % MOD, n / 2, MOD) * (n % 2 == 1 ? a : 1)) % MOD;
        }

    }
}

