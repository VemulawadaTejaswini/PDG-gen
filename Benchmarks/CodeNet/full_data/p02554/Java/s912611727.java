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
        CUbiquity solver = new CUbiquity();
        solver.solve(1, in, out);
        out.close();
    }

    static class CUbiquity {
        private static final int mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            long ans = 0;

            if (n == 1) {
                ans = 0;
            } else {
                ans = (powAndMod(10, n) - powAndMod(9, n) - powAndMod(9, n) + powAndMod(8, n)) % mod;
            }
            // 出力
            out.println((ans + mod) % mod);

        }

        private static long powAndMod(long a, long b) {
            long x = 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    x = (x * a) % mod;
                    b--;
                } else {
                    a = (a * a) % mod;
                    b /= 2;
                }
            }
            return x;
        }

    }
}

