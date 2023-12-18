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
 * @author Stierliz
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        int h;
        int w;
        char[][] arr;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            arr = new char[h][w];

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    arr[i][j] = in.nextCharacter();
                }
            }

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (arr[i][j] == '#') {
                        if (!checkAdhj(arr[i][j], i, j)) {
                            out.print("No");
                            return;
                        }
                    }
                }
            }

            out.print("Yes");
        }

        private boolean checkAdhj(char a, int i, int j) {
            if (i == 0) {
                if (j == 0) {
                    if (arr[i][j + 1] == '#' || arr[i + 1][j] == '#')
                        return true;
                    return false;
                } else if (j == w - 1) {
                    if (arr[i][j - 1] == '#' || arr[i + 1][j] == '#')
                        return true;
                    return false;
                } else {
                    if (arr[i][j + 1] == '#' || arr[i + 1][j] == '#' || arr[i][j - 1] == '#')
                        return true;
                    return false;
                }
            } else if (i == h - 1) {
                if (j == 0) {
                    if (arr[i][j + 1] == '#' || arr[i - 1][j] == '#')
                        return true;
                    return false;
                } else if (j == w - 1) {
                    if (arr[i][j - 1] == '#' || arr[i - 1][j] == '#')
                        return true;
                    return false;
                } else {
                    if (arr[i][j + 1] == '#' || arr[i - 1][j] == '#' || arr[i][j - 1] == '#')
                        return true;
                    return false;
                }
            } else if (j == 0) {
                if (arr[i][j + 1] == '#' || arr[i - 1][j] == '#' || arr[i + 1][j] == '#')
                    return true;
                return false;
            } else if (j == w - 1) {
                if (arr[i][j - 1] == '#' || arr[i - 1][j] == '#' || arr[i + 1][j] == '#')
                    return true;
                return false;
            } else {
                if (arr[i][j - 1] == '#' || arr[i][j + 1] == '#'
                        || arr[i - 1][j] == '#' || arr[i + 1][j] == '#') {
                    return true;
                }
                return false;
            }
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

        public char nextCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void close() {
            writer.close();
        }

    }
}

