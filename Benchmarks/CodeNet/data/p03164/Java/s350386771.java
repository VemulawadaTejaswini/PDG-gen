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
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            final int MAX = 100000;
            final int INF = 1000000001;

            int n = in.nextInt();
            int weight = in.nextInt();
            Item[] a = new Item[n];
            for (int i = 0; i < n; i++) a[i] = new Item(in.nextInt(), in.nextInt());

            long dp[][] = new long[n + 1][MAX + 1];
            for (int i = 0; i <= n; i++) for (int j = 0; j <= MAX; j++) dp[i][j] = INF;
            dp[0][0] = 0;
            for (int i = 1; i <= n; i++) {
                int w = a[i - 1].weight;
                int v = a[i - 1].val;
                for (int j = 0; j <= MAX; j++) {
                    if (j - v >= 0) {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - v] + w);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            int ret = 0;
            for (int i = 0; i <= n; i++)
                for (int j = 0; j <= MAX; j++) {
                    if (dp[i][j] <= weight && j > ret) {
                        ret = j;
                    }
                }

            out.println(ret);

        }

        private class Item {
            private int weight;
            private int val;

            private Item(int weight, int val) {
                this.weight = weight;
                this.val = val;
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

