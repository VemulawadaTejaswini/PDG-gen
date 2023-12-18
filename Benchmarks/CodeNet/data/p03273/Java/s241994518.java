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
        BGridCompression solver = new BGridCompression();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGridCompression {
        private int sizeI;
        private int sizeJ;
        private char[][] a;

        private boolean onlyWhiteRow(int i) {
            for (int j = 0; j < sizeJ; j++) {
                if (a[i][j] == '#') {
                    return false;
                }
            }
            return true;
        }

        private boolean onlyWhiteCol(int j) {
            for (int i = 0; i < sizeI; i++) {
                if (a[i][j] == '#') {
                    return false;
                }
            }
            return true;
        }

        private void removeRow(int delI) {
            char[][] newA = new char[sizeI - 1][sizeJ];
            int curI = 0;
            for (int i = 0; i < sizeI; i++) {
                if (i == delI) {
                    continue;
                }
                System.arraycopy(a[i], 0, newA[curI++], 0, sizeJ);
            }
            sizeI--;
            a = newA;
        }

        private void removeCol(int delJ) {
            char[][] newA = new char[sizeI][sizeJ - 1];
            int curJ = 0;
            for (int j = 0; j < sizeJ; j++) {
                if (j == delJ) {
                    continue;
                }
                for (int i = 0; i < sizeI; i++) {
                    newA[i][curJ] = a[i][j];
                }
                curJ++;
            }
            sizeJ--;
            a = newA;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            sizeI = in.nextInt();
            sizeJ = in.nextInt();
            a = new char[sizeI][sizeJ];
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    a[i][j] = in.nextCharacter();
                }
            }

            boolean changed = true;
            while (changed) {
                changed = false;
                for (int i = 0; i < sizeI; i++) {
                    if (onlyWhiteRow(i)) {
                        removeRow(i);
                        changed = true;
                    }
                }
                for (int j = 0; j < sizeJ; j++) {
                    if (onlyWhiteCol(j)) {
                        removeCol(j);
                        changed = true;
                    }
                }
            }

            for (char[] row : a) {
                out.println(row);
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

        public void println(char[] array) {
            writer.println(array);
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
}

