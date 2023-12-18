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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        char d = 'D';
        char m = 'M';
        char c = 'C';

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            String s = in.next();

            long[] dpre = new long[n];

            long[] csuf = new long[n];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == d) {
                    dpre[i] = 1;
                }
                if (s.charAt(i) == c) {
                    csuf[i] = 1;
                }
            }

            dpre = in.calculatePrefixSum(dpre);

            for (int i = n - 2; i >= 0; i--) {
                csuf[i] = csuf[i] + csuf[i + 1];
            }

            long tot = 0;
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i) == m) {
                    tot += dpre[i - 1] * csuf[i + 1];
                }
            }

            long[] mfa = new long[n];

            int mf = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == m) {
                    mf++;
                }

                if (s.charAt(i) == c)
                    mfa[i] = mf;
            }

            for (int i = n - 2; i >= 0; i--) {
                mfa[i] = mfa[i] + mfa[i + 1];
            }

            int q = in.nextInt();

            o:
            while (q-- > 0) {
                int k = in.nextInt();

                long minus = 0;

                mf = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == m) {
                        mf++;
                    } else if (s.charAt(i) == d) {
                        int j = i + k;

                        if (j >= n)
                            continue;

                        minus += mfa[j] - mf * csuf[j];
                    }
                }

                out.println(tot - minus);
            }

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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public String next() {
            return nextString();
        }

        public long[] calculatePrefixSum(long[] a) {
            int n = a.length;

            long[] prefixSum = new long[n];

            prefixSum[0] = a[0];

            for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i - 1] + a[i];
            }

            return prefixSum;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

