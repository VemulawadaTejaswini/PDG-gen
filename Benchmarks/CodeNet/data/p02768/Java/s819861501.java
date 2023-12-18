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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        static final long mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            long n = Long.parseLong(in.next());
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            out.println((mod + mod + mod + powAndMod(2, n) - 1 - combinationAndMod(n, a) - combinationAndMod(n, b)) % mod);

        }

        static long combinationAndMod(long n, long r) {
            r = Math.min(r, n - r);
            long x = 1, y = 1;
            for (long i = 1; i <= r; i++) {
                x = x * (n - r + i) % mod;
                y = y * i % mod;
            }
            return x * powAndMod(y, mod - 2) % mod;
        }

        static long powAndMod(long a, long b) {
            long x = 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    x = x * a % mod;
                    b--;
                } else {
                    a = a * a % mod;
                    b /= 2;
                }
            }
            return x;
        }

    }
}

