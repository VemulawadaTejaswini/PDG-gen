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
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EPickingGoods solver = new EPickingGoods();
        solver.solve(1, in, out);
        out.close();
    }

    static class EPickingGoods {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
//    	w.print("Case #"+testNumber+": ");
            int R = c.readInt(), C = c.readInt(), k = c.readInt();
            int[][] mat = new int[R][C];
            while (k-- > 0) {
                int u = c.readInt() - 1, v = c.readInt() - 1, val = c.readInt();
                mat[u][v] = val;
            }

            long[][][] dp = new long[R][C][4];
            dp[0][0][1] = mat[0][0];

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (i > 0) {
                        dp[i][j][0] = Utils.max(dp[i - 1][j]);
                        dp[i][j][1] = Utils.max(dp[i - 1][j]) + mat[i][j];
                    }
                    if (j > 0) {
                        dp[i][j][0] = Math.max(dp[i][j][0], dp[i][j - 1][0]);
                        for (int mv = 0; mv < 3; mv++) {
                            dp[i][j][mv + 1] =
                                    Utils.max(dp[i][j][mv + 1], dp[i][j - 1][mv + 1], dp[i][j - 1][mv] + mat[i][j]);
                        }
                    }
                }
            }

//		tr(dp);
            w.printLine(Utils.max(dp[R - 1][C - 1]));


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

    }

    static class Utils {
        public static long max(long... objects) {
            long max = objects[0];
            for (int i = 1; i < objects.length; i++) {
                max = Math.max(max, objects[i]);
            }
            return max;
        }

    }
}

