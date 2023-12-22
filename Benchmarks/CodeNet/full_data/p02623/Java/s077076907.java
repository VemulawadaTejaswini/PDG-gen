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
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CTsundoku solver = new CTsundoku();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTsundoku {
        int testNumber;
        InputReader in;
        OutputWriter out;

        public void solve() {
            int n = in.readInt();
            int m = in.readInt();
            long k = in.readInt();

            int[] a = in.readInts(n);
            int[] b = in.readInts(m);
            SumCounterLong sc = new SumCounterLong(m);
            for (int i = 0; i < b.length; i++) {
                sc.next(b[i]);
            }


            long timeAcc = 0;
            int maxRes = 0;

            int lastPos = m;
            for (int i = 0; i <= n; i++) {

                long rem = k - timeAcc;
                if (rem < 0) break;

                while (lastPos >= 0 && sc.getSum(0, lastPos) > rem) {
                    lastPos--;
                }

                maxRes = Math.max(maxRes, i + Math.max(0, lastPos));

                if (i < n) {
                    timeAcc += a[i];
                }
            }
            out.println(maxRes);
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            this.testNumber = testNumber;
            this.in = in;
            this.out = out;

            solve();
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

    static class SumCounterLong {
        private int n;
        private int pos;
        private long[] sums;
        private boolean fixRanges;

        public SumCounterLong(int n) {
            this(n, true);
        }

        public SumCounterLong(int n, boolean fixRanges) {
            this.n = n;
            this.pos = 1;
            this.sums = new long[n + 1];
            this.fixRanges = fixRanges;
        }

        public void next(long value) {
            sums[pos] = sums[pos - 1] + value;
            pos++;
        }

        public long getSum(int from, int to) {
            if (fixRanges) {
                to = MathUtils.constrain(to, 0, n);
                from = MathUtils.constrain(from, 0, n - 1);

                if (from >= to) {
                    return 0;
                }
            }

            return sums[to] - sums[from];
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

        private int read() {
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

        public int readInt() {
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

        public int[] readInts(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = readInt();
            }
            return res;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static final class MathUtils {
        private MathUtils() {
        }

        public static int constrain(int value, int min, int max) {
            return Math.min(Math.max(value, min), max);
        }

    }
}

