import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskD {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            NumberTheory.Modular mod = new NumberTheory.Modular(924844033);
            NumberTheory.Factorial fact = new NumberTheory.Factorial(2000, mod);

            int n = in.readInt();
            int k = in.readInt();

            //is last selected
            //which row
            //how many elements selected
            int[][][][] f = new int[2][2][n + 1][n + 1];
            f[1][0][0][1] = 0;
            f[1][0][0][0] = 1;
            f[0][0][0][1] = 0;
            f[0][0][0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    f[1][0][i][j] = mod.plus(f[1][1][i - 1][j], f[1][0][i - 1][j]);
                    if (j > 0) {
                        f[1][1][i][j] = mod.plus(f[1][1][i - 1][j - 1], f[1][0][i - 1][j - 1]);
                    }
                    f[0][0][i][j] = mod.plus(f[0][1][i - 1][j], f[0][0][i - 1][j]);
                    if (j > 0) {
                        f[0][1][i][j] = mod.plus(f[0][1][i - 1][j - 1], f[0][0][i - 1][j - 1]);
                    }
                    if (j > 0) {
                        f[1][0][i][j] = mod.plus(f[1][0][i][j], f[1][0][i - 1][j - 1]);
                        if (i > 1) {
                            f[0][0][i][j] = mod.plus(f[0][0][i][j], f[0][0][i - 1][j - 1]);
                        }
                    }
                }
            }

            int limit = Math.min(2 * k, n);
            int[][] dp = new int[limit + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 1; i <= limit; i++) {
                int m = (n - i) / (2 * k) + 1;
                int last = i + 2 * k * (m - 1);
                int type = 0;
                if (i - k >= 1) {
                    type = 1;
                }
                for (int j = 0; j <= m; j++) {
                    int cnt;
                    if (last + k <= n) {
                        cnt = mod.plus(f[type][0][m][j], f[type][1][m][j]);
                    } else {
                        cnt = f[type][0][m][j];
                    }

                    for (int t = 0; t + j <= n; t++) {
                        dp[i][t + j] = mod.plus(dp[i][t + j], mod.mul(dp[i - 1][t], cnt));
                    }
                }
            }

            int ans = 0;
            //inclusive-exclusive
            for (int i = 0; i <= n; i++) {
                int cnt = 1;
                if (i % 2 == 1) {
                    cnt = mod.valueOf(-1);
                }
                cnt = mod.mul(cnt, fact.fact(n - i));
                cnt = mod.mul(cnt, dp[limit][i]);

                ans = mod.plus(ans, cnt);
            }

            out.print(ans);
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

        public static class InverseNumber {
            int[] inv;

            public InverseNumber(int[] inv, int limit, NumberTheory.Modular modular) {
                this.inv = inv;
                inv[1] = 1;
                int p = modular.m;
                for (int i = 2; i <= limit; i++) {
                    int k = p / i;
                    int r = p % i;
                    inv[i] = modular.mul(-k, inv[r]);
                }
            }

            public InverseNumber(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], limit, modular);
            }

        }

        public static class Factorial {
            int[] fact;
            int[] inv;

            public Factorial(int[] fact, int[] inv, NumberTheory.InverseNumber in, int limit, NumberTheory.Modular modular) {
                this.fact = fact;
                this.inv = inv;
                fact[0] = inv[0] = 1;
                for (int i = 1; i <= limit; i++) {
                    fact[i] = modular.mul(fact[i - 1], i);
                    inv[i] = modular.mul(inv[i - 1], in.inv[i]);
                }
            }

            public Factorial(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], new int[limit + 1], new NumberTheory.InverseNumber(limit, modular), limit, modular);
            }

            public int fact(int n) {
                return fact[n];
            }

        }

    }
}

