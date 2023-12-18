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
        DAnInvisibleHand solver = new DAnInvisibleHand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DAnInvisibleHand {
        private int[] log2;
        private int[][] sparseTable;

        private int maxOnInterval(int left, int right) {
            int len = right - left + 1;
            int level = log2[len];
            return Math.max(sparseTable[level][left], sparseTable[level][right - (1 << level) + 1]);
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int maxCount = in.nextInt();
            int[] cost = in.nextIntArray(n);

            log2 = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                log2[i] = log2[i >> 1] + 1;
            }
            int levels = log2[n] + 1;
            sparseTable = new int[levels + 1][n];
            System.arraycopy(cost, 0, sparseTable[0], 0, n);
            int prevLen = 1;
            for (int level = 1; level <= levels; ++level) {
                for (int i = 0; i + prevLen < n; ++i) {
                    sparseTable[level][i] = Math.max(sparseTable[level - 1][i], sparseTable[level - 1][i + prevLen]);
                }
                prevLen <<= 1;
            }

            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i + 1 < n; i++) {
                minDiff = Math.min(minDiff, cost[i] - maxOnInterval(i, n - 1));
            }

            if (minDiff >= 0) {
                out.println(0);
                return;
            }

            int count = 0;
            for (int i = 0; i + 1 < n; i++) {
                int diff = cost[i] - maxOnInterval(i, n - 1);
                if (diff == minDiff) {
                    count++;
                }
            }

            out.println(count);
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

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

