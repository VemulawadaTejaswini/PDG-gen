import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnight solver = new DKnight();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnight {
        static int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            long res = 0;
            if ((x + y) % 3 != 0) {
                // res == 0
            } else {
                int el = (x + y) / 3;
                x -= el;
                y -= el;
                if (x > 0 && y > 0) {
                    res = ((
                            (modfact(x + y) * modinv(modfact(x))) % MOD)
                            * modinv(modfact(y))) % MOD;
                }
            }
            out.println(res);
        }

        public static long modfact(long n) {
            long res = 1;
            for (int i = 1; i <= n; i++) {
                res = (res * i) % MOD;
            }
            return res;
        }

        public static long modinv(long n) {
            return modpow(n, MOD - 2);
        }

        public static long modpow(long n, long a) {
            long res = 1;
            while (a != 0) {
                if (a % 2 == 1) {
                    res = n * res % MOD;
                }
                a /= 2;
                n = (n * n) % MOD;
            }
            return (int) res;
        }

    }
}

