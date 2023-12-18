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
        long dx;
        long dy;
        long MOD = 998244353;
        long[] f;
        long[] fi;

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

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();
            long K = in.nextLong();
            long AB = A + B;

            // G = x*A + y*B;
            initFactorials(N);
            dx = dy = 0;

            long G = gcd(A, B);
            if (K % G != 0) {
                out.println(0);
                return;
            }

            long[] XA = new long[1];
            long[] YY = new long[1];


            gcd(A, B, XA, YY);

            long x1 = XA[0] * (K / G);
            long y1 = YY[0] * (K / G);

            long rs1 = G * (x1 - K) / B;
            long re1 = x1 * G / B;

            long rs2 = -1L * y1 * G / A;
            long re2 = G * (K - y1) / A;

            long rs = Math.max(rs1, rs2);
            long re = Math.min(re1, re2);

            if (rs > re) {
                out.println(0);
                return;
            }

            long ans = 0;

            for (long r = rs; r <= re; r++) {
                long x = x1 - r * B / G;
                long y = y1 + r * A / G;

                ans = add(ans, ways(N, K, A, B, x, y));
            }

            out.println(ans);

        }

        private long C(int n, int k) {
            return f[n] * fi[n - k] % MOD * fi[k] % MOD;
        }

        private long ways(int N, long K, int A, int B, long X, long Y) {
            long ans = 0;

            for (long c = 0; c <= N && c <= X && c <= Y; c++) {
                long a = X - c;
                long b = Y - c;

                if (a >= 0 && b >= 0) {
                    long w = ways(N, a) * ways(N - a, b) % MOD * ways(N - a - b, c) % MOD;
                    ans = add(ans, w);
                }
            }
            return ans;
        }

        private long ways(long N, long K) {
            if (N < K) return 0L;
            return C((int) N, (int) K);
        }

        private long add(long A, long B) {
            return (A + B) % MOD;
        }

        private long gcd(long a, long b) {
            if (b == 0) return a;
            return gcd(b, a % b);
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

