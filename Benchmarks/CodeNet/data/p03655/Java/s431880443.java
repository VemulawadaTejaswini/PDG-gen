import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public int mod = 1000000007;
        public long[] fact;
        public long[] ifact;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int x1 = in.nextInt(), x2 = in.nextInt(), x3 = in.nextInt(), x4 = in.nextInt(), x5 = in.nextInt(), x6 = in.nextInt();
            int y1 = in.nextInt(), y2 = in.nextInt(), y3 = in.nextInt(), y4 = in.nextInt(), y5 = in.nextInt(), y6 = in.nextInt();
            x1--;
            y1--;
            x6++;
            y6++;

            long[][] x = Factorials.getFIF(2000010, mod);
            fact = x[0];
            ifact = x[1];

            int[] p1 = {x1, x2}, p2 = {y1, y2}, q1 = {x5, x6}, q2 = {y5, y6};
            int res = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        for (int m = 0; m < 2; m++) {
                            int sign = i ^ j ^ k ^ m;
                            int s = solve(p1[i], p2[j], q1[k], q2[m], x3, x4, y3, y4);
                            if (sign == 1) {
                                res -= s;
                                if (res < 0) res += mod;
                            } else {
                                res += s;
                                if (res >= mod) res -= mod;
                            }
                        }
                    }
                }
            }
            out.println(res);
        }

        public int comb(int n, int k) {
            if (k < 0 || k > n) return 0;
            return (int) (fact[n] * ifact[k] % mod * ifact[n - k] % mod);
        }

        public int solve(int x1, int y1, int x2, int y2, int lx, int hx, int ly, int hy) {
            int ret = 0;
            for (int x = lx; x <= hx; x++) {
                for (int y = ly; y <= hy; y++) {
                    ret = (int) ((ret + 1L * comb(x - x1 + y - y1, x - x1) * comb(x2 - x + y2 - y, x2 - x)) % mod);
                }
            }
            return ret;
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }

    static class Factorials {
        public static long[][] getFIF(int max, int mod) {
            long[] fact = new long[max];
            long[] ifact = new long[max];
            long[] inv = new long[max];
            inv[1] = 1;
            for (int i = 2; i < max; i++) {
                inv[i] = (mod - mod / i) * inv[mod % i] % mod;
            }
            fact[0] = 1;
            ifact[0] = 1;
            for (int i = 1; i < max; i++) {
                fact[i] = fact[i - 1] * i % mod;
                ifact[i] = ifact[i - 1] * inv[i] % mod;
            }
            return new long[][]{fact, ifact, inv};
        }

    }
}

