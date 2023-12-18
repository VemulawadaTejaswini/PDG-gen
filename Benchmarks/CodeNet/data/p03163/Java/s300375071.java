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
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            int n = in.ni();
            int w = in.ni();
            long temp[][] = new long[n][2];
            for (i = 0; i < n; i++) {
                temp[i][0] = in.nl();
                temp[i][1] = in.nl();
            }
            //for(i=0;i<n;i++)
            //    out.println(temp[i][0]+" "+temp[i][1]);
            long ans[][] = new long[n][w + 1];
            for (i = 0; i < n; i++) {
                for (j = 1; j <= w; j++) {
                    ans[i][j] = ans[i][j - 1];
                    if (i != 0)
                        ans[i][j] = Math.max(ans[i - 1][j], ans[i][j]);
                    if (j - temp[i][0] >= 0) {
                        if (i == 0)
                            ans[0][j] = Math.max(ans[0][j - 1], temp[0][1]);
                        else
                            ans[i][j] = Math.max(ans[i - 1][j - (int) temp[i][0]] + temp[i][1], Math.max(ans[i - 1][j], ans[i][j - 1]));
                    }
                }
                //for(j=1;j<=w;j++)
                //    out.print(ans[i][j]+" ");
                //out.println();
                //out.println(ans);
            }
            out.println(ans[n - 1][w]);

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

        public int ni() {
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

        public long nl() {
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

