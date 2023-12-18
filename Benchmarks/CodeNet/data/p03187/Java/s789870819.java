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
        BTreeBurning solver = new BTreeBurning();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTreeBurning {
        long l;
        int n;
        long[] a;
        long[][][] dp;
        long[][] sum;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            l = in.nextInt();

            n = in.nextInt();

            a = in.nextLongArray(n);

            dp = new long[n][n][2];
            sum = new long[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j][0] = dp[i][j][1] = -1;
                }
            }

            long a1 = rec(0, n - 1, 0);
            long a2 = l - a[n - 1] + rec(0, n - 1, 1);

            out.println(Math.max(a1, a2));

        }

        private long rec(int st, int en, int forb) {
            if (st > en) {
                return 0;
            }
            if (dp[st][en][forb] != -1) {
                return dp[st][en][forb];
            }

            if (st == en) {
                if (forb == 0) {
                    dp[st][en][forb] = a[en];
                    if (st > 0) {
                        dp[st][en][forb] -= a[st - 1];
                    }
                    return dp[st][en][forb];
                } else {
                    return dp[st][en][forb] = 0;
                }
            }

            sum[st][en] = a[en];

            long low = 0;
            if (st > 0) {
                low = a[st - 1];
                sum[st][en] -= a[st - 1];
            }

            long rem = l - sum[st][en];

            if (forb == 0) {
                long ca = 0;
                long cv = 0;
                for (int i = st; i <= en; i++) {
                    cv = a[i] - low;

                    long val = 0;
                    if (i < en) {
                        val = 2 * cv + rem + rec(i + 1, en, 1);
                    } else {
                        val = cv;
                    }

                    ca = Math.max(ca, val);
                }

                dp[st][en][forb] = ca;
            } else {
                long ca = 0;
                long cv = 0;
                ca = rem + rec(st, en - 1, 0);
                for (int i = en; i > st; i--) {
                    cv = a[en];

                    if (i > 0) {
                        cv -= a[i - 1];
                    }

                    long val = 0;
                    if (i > st + 1) {
                        val = 2 * cv + rem + rec(st, i - 2, 0);
                    } else {
                        val = cv;
                    }

                    ca = Math.max(ca, val);
                }

                dp[st][en][forb] = ca;
            }

            return dp[st][en][forb];
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

