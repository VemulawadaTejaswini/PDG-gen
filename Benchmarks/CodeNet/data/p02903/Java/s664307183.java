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
 * @author cunbidun
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        A01Matrix solver = new A01Matrix();
        solver.solve(1, in, out);
        out.close();
    }

    static class A01Matrix {
        private InputReader in;
        private OutputWriter out;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            this.in = in;
            this.out = out;
            int h = in.nextInt();
            int w = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int[][] ans = new int[h + 1][w + 1];

            if (a == 0) {
                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= w; j++) {
                        ans[i][j] = 1;
                    }
                }
            } else if (b == 0) {
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= a; j++) {
                        ans[i][j] = 1;
                    }
                }
            } else {
                for (int i = 1; i <= b; i++) {
                    for (int j = 1; j <= a; j++) {
                        ans[i][j] = 1;
                        ans[i + b][j + a] = 1;
                    }
                }
                for (int i = 2 * b + 1; i <= h; i++) {
                    for (int j = 2 * a + 1; j <= w; j++) {
                        ans[i][j] = 1;
                    }
                }

                for (int i = 1; i <= b; i++) {
                    for (int j = 2 * a + 1; j <= w; j++) {
                        ans[i][j] = 1;
                    }
                }

                for (int i = 2 * b + 1; i <= h; i++) {
                    for (int j = 1; j <= a; j++) {
                        ans[i][j] = 1;
                    }
                }
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    out.print(ans[i][j]);
                }
                out.println("");
            }
        }

    }

    static class OutputWriter {
        private final PrintWriter out;

        public OutputWriter(OutputStream outputStream) {
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.out = new PrintWriter(writer);
        }

        public void close() {
            out.close();
        }

        public void print(int i) {
            out.print(i);
        }

        public void println(String i) {
            out.println(i);
        }

    }

    static class InputReader extends InputStream {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

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
            while (isSpaceChar(c))
                c = read();
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

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

