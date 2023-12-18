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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DGridColoring solver = new DGridColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridColoring {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int H = in.readInt();
            int W = in.readInt();
            int N = in.readInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) a[i] = in.readInt();

            int field[][] = new int[H][W];
            int nowH = 0;
            int nowW = 0;
            int color = 1;
            boolean goRight = true;
            for (int t : a) {
                for (int i = 0; i < t; i++) {
                    field[nowH][nowW] = color;

                    if (goRight) {
                        if (nowW < W - 1) nowW++;
                        else {
                            nowH++;
                            goRight = false;
                        }
                    } else {
                        if (nowW > 0) nowW--;
                        else {
                            nowH++;
                            goRight = true;
                        }
                    }

                }
                color++;
            }

            //output
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    sb.append(field[i][j] + " ");
                }
                sb.append("\n");
            }
            out.printLine(sb.toString());
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
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
}

