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
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EGetEverything solver = new EGetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGetEverything {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), m = c.readInt();
            ArrayList<Integer>[] a = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                a[i] = new ArrayList<>();
            }
            int mt[] = new int[m];
            for (int i = 0; i < m; i++) {
                int cost = c.readInt(), b = c.readInt();
                mt[i] = cost;
                for (int j = 0; j < b; j++) {
                    int l = c.readInt() - 1;
                    a[l].add(i);
                }
            }


            for (int i = 0; i < n; i++) {
                if (a[i].size() == 0) {
                    w.printLine(-1);
                    return;
                }
            }
            long dp[][] = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            long min = Integer.MAX_VALUE;
            for (int i : a[0]) {
                dp[0][i] = mt[i];
                min = Math.min(min, mt[i]);
            }

            for (int i = 1; i < n; i++) {
                long hj = Integer.MAX_VALUE;
                for (int j : a[i]) {
                    dp[i][j] = Math.min(mt[j] + min, dp[i - 1][j]);
                    hj = Math.min(hj, dp[i][j]);
                }
                min = hj;
            }
            w.printLine(min);


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

        public void printLine(long i) {
            writer.println(i);
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }
}

