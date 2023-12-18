import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBlueAndRedBalls solver = new DBlueAndRedBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBlueAndRedBalls {
        final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            for (int i = 1; i <= k; i++) {
                long a = combo(n - k + 1, i, MOD);
                long b = combo(k - 1, i - 1, MOD);
                out.println((a * b) % MOD);
            }
        }

        static int combo(int n, int k, int mod) {
            long top = 1;
            long bot = 1;
            for (int i = 1; i <= k; i++) {
                top *= (n + 1 - i);
                top %= mod;
                bot *= i;
                bot %= mod;
            }
            return (int) (top * modInv(bot, mod) % mod);
        }

        static long[] extended(long a, long b) {
            if (b == 0) {
                return new long[]{a, 1, 0};
            }

            long[] temp = extended(b, a % b);
            long s1 = temp[1];
            long t1 = temp[2];
            long s = t1;
            long t = s1 - a / b * t1;
            return new long[]{temp[0], s, t};
        }

        static long modInv(long a, long m) {
            long[] res = extended(a, m);
            if (res[0] != 1) {
                throw new IllegalArgumentException(("gcd != 1"));
            }
            return ((res[1] + m) % m);
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

