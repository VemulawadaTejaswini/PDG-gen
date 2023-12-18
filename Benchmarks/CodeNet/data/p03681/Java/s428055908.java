import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Reconciled solver = new Reconciled();
        solver.solve(1, in, out);
        out.close();
    }

    static class Reconciled {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            boolean is_double = n == m;

            if (1 < Math.abs(n - m)) {
                out.println(0);
                return;
            }

            long result = 1;
            while (0 < n) {
                result *= n;
                result %= MOD;
                n--;
            }
            while (0 < m) {
                result *= m;
                result %= MOD;
                m--;
            }
            if (is_double) {
                result *= 2;
                result %= MOD;
            }
            out.println(result % MOD);
        }

    }
}

