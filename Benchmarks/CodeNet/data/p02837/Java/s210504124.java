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
        CHonestOrUnkind2 solver = new CHonestOrUnkind2();
        solver.solve(1, in, out);
        out.close();
    }

    static class CHonestOrUnkind2 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[][][] te = new int[n][][];

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();

                te[i] = new int[a][2];
                for (int j = 0; j < a; j++) {
                    int x = in.nextInt();
                    int y = in.nextInt();

                    te[i][j][0] = x - 1;
                    te[i][j][1] = y;
                }
            }

            int ans = 0;
            for (int i = 0; i < (1 << n); i++) {

                boolean poss = true;
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        for (int k = 0; k < te[j].length; k++) {
                            int x = te[j][k][0];
                            int y = te[j][k][1];

                            if (y == 0) {
                                if ((i & (1 << x)) != 0) {
                                    poss = false;
                                }
                            } else {
                                if ((i & (1 << x)) == 0) {
                                    poss = false;
                                }
                            }
                        }
                    }
                }

                if (poss) {
                    int max = 0;
                    for (int j = 0; j < n; j++) {
                        if ((i & (1 << j)) != 0) {
                            max++;
                        }
                    }

                    ans = Math.max(ans, max);
                }
            }

            out.println(ans);
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
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

        public void println(int i) {
            writer.println(i);
        }

    }
}

