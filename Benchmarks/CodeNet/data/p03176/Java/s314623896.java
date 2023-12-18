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
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        QFlowers solver = new QFlowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class QFlowers {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[] h = new int[n];
            in.readArray(h, n, 1);

            long[] a = in.nextLongArray(n);

            SegmentTree st = new SegmentTree(n);

            long[] dp = new long[n];

            dp[h[0]] = a[0];

            st.build(0, dp, 0, n - 1);

            long ans = a[0];

            for (int i = 1; i < n; i++) {
                int ch = h[i];

                if (ch == 0) {
                    dp[0] = a[i];
                    st.update(0, 0, n - 1, 0, dp[0]);
                    ans = Math.max(ans, dp[ch]);
                    continue;
                }
                long max = st.query(0, 0, n - 1, 0, ch - 1);

                dp[ch] = a[i] + max;

                st.update(0, 0, n - 1, ch, dp[ch]);

                ans = Math.max(ans, dp[ch]);
            }

            out.println(ans);
        }

        class SegmentTree {
            long[] st;
            int n;

            public SegmentTree(int n) {
                st = new long[4 * n];
                this.n = n;
            }

            void build(int i, long[] a, int r1, int r2) {
                if (r1 == r2) {
                    st[i] = a[r1];
                } else {
                    build(i * 2 + 1, a, r1, (r1 + r2) / 2);
                    build(i * 2 + 2, a, (r1 + r2) / 2 + 1, r2);

                    st[i] = Math.max(st[i * 2 + 1], st[i * 2 + 2]);
                }
            }

            long query(int i, int ra, int rb, int r1, int r2) {
                if (ra > r2 || rb < r1) {
                    return 0;
                }

                if (ra >= r1 && rb <= r2) {
                    return st[i];
                }

                long p1 = query(i * 2 + 1, ra, (ra + rb) / 2, r1, r2);
                long p2 = query(i * 2 + 2, (ra + rb) / 2 + 1, rb, r1, r2);

                return Math.max(p1, p2);
            }

            long update(int i, int ra, int rb, int ind, long val) {
                if (ra == rb && rb == ind) {
                    st[i] = val;
                    return st[i];
                }

                if (ra > ind || rb < ind) {
                    return st[i];
                }

                long p1 = update(i * 2 + 1, ra, (ra + rb) / 2, ind, val);
                long p2 = update(i * 2 + 2, (ra + rb) / 2 + 1, rb, ind, val);

                return st[i] = Math.max(p1, p2);
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; ++i) array[i] = nextLong();
            return array;
        }

        public void readArray(int[] a, int n, int offset) {
            for (int i = 0; i < n; i++) {
                a[i] = nextInt() - offset;
            }
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

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

