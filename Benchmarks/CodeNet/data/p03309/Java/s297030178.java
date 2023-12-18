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
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CLinearApproximation solver = new CLinearApproximation();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLinearApproximation {
        private long arithmeticProgressionSum(long n, int a) {
            return (n * (2 * a + (n - 1))) / 2;
        }

        private long sumRange(int left, int right, long[] a) {
            return a[right + 1] - a[left];
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            a[n] = (int) 2e9;

            long[] psums = new long[n + 1];
            for (int i = 1; i <= n; i++) psums[i] = psums[i - 1] + a[i - 1];

            long ret = Long.MAX_VALUE;
            int count = 1;
            for (int i = 1; i <= n; i++) {
                if (a[i] == a[i - 1] + 1) {
                    count++;
                } else if (a[i] != a[i - 1] + 1) {
                    long val = 0;
                    int left = i - count;
                    if (left > 0) {
                        val += Math.abs(sumRange(0, left - 1, psums) - arithmeticProgressionSum(left, a[left] - left));
                    }
                    val += Math.abs(sumRange(i, n - 1, psums) - arithmeticProgressionSum(n - i, a[i - 1] + 1));
                    ret = Math.min(ret, val);
                    count = 1;
                }
            }

            out.println(ret);
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

