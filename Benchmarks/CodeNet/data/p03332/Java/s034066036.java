import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        long MOD = 998244353;
        long[] f;
        long[] fi;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            long K = in.nextLong();
            long ans = 0;
            initFactorials(N);

            // K = x*A + y*B

            for (long x = 0; x <= N && x * A <= K; x++) {
                long y = (K - x * A) / B;
                if (K == x * A + y * B && y <= N) {
                    ans = add(ans, C(N, (int) x) * C(N, (int) y) % MOD);
                }
            }

            out.println(ans);
        }

        private long C(int n, int k) {
            return f[n] * fi[n - k] % MOD * fi[k] % MOD;
        }

        private long add(long A, long B) {
            return (A + B) % MOD;
        }

        private long gcd(long a, long b, long x[], long y[]) {
            if (a == 0) {
                x[0] = 0;
                y[0] = 1;
                return b;
            }
            long x1[] = new long[1];
            long y1[] = new long[1];

            long d = gcd(b % a, a, x1, y1);
            x[0] = y1[0] - (b / a) * x1[0];
            y[0] = x1[0];
            return d;
        }

        private void initFactorials(int N) {
            int MAX = N;
            f = new long[MAX + 1];
            f[0] = 1;
            for (int i = 1; i <= MAX; i++) {
                f[i] = (f[i - 1] * i) % MOD;
            }

            //lets find fi[p]
            //p*X === 1 % MOD;
            fi = new long[MAX + 1];

            long x[] = new long[1];
            long y[] = new long[1];
            long g = gcd(f[MAX], MOD, x, y);
            if (g != 1) {
                throw new RuntimeException("Impossible");
            }
            fi[MAX] = (x[0] % MOD + MOD) % MOD;
            for (int i = MAX - 1; i >= 0; i--) {
                fi[i] = (fi[i + 1] * (i + 1)) % MOD; // (i-1)!^-1 == i!^-1 * i
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

