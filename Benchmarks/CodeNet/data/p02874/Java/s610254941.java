import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        BTwoContests solver = new BTwoContests();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoContests {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            BTwoContests.Interval[] its = new BTwoContests.Interval[n];
            for (int i = 0; i < n; i++) {
                its[i] = new BTwoContests.Interval(in.nextInt(), in.nextInt());
            }
            Arrays.sort(its, Comparator.comparingInt(x -> x.l));
            int[] prefixr = new int[n + 1];
            prefixr[0] = 1 << 29;
            for (int i = 1; i <= n; i++) {
                prefixr[i] = Math.min(prefixr[i - 1], its[i - 1].r);
            }
            long ans = 0;
            int r2 = its[n - 1].r;
            for (int other = n - 2; other >= 0; other--) {
                int r1 = its[other].r;
                int r3 = prefixr[other];

                int l2 = its[n - 1].l;
                int l1 = its[other].l;

                ans = Math.max(ans, Math.max(0, Math.min(r3, r2) - l2 + 1) + Math.max(0, r1 - l1 + 1));
                ans = Math.max(ans, Math.max(0, r2 - l2 + 1) + Math.max(0, Math.min(r3, r1) - l1 + 1));
                r2 = Math.min(r2, its[other].r);
            }
            out.println(ans);
        }

        static class Interval {
            public int l;
            public int r;

            public Interval(int l, int r) {
                this.l = l;
                this.r = r;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

