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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        int H;
        int W;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            H = in.readInt();
            W = in.readInt();
            Character[][] S = new Character[H][W];
            int[][] L = new int[H][W];
            int[][] R = new int[H][W];
            int[][] U = new int[H][W];
            int[][] D = new int[H][W];
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    S[i][j] = in.readCharacter();
                    L[i][j] = -1;
                    R[i][j] = -1;
                    U[i][j] = -1;
                    D[i][j] = -1;
                }
            }

            int result = Integer.MIN_VALUE;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    result = Math.max(result, getRight(i, j, R, S) + getLeft(i, j, L, S) + getDown(i, j, D, S) + getUp(i, j, U, S) - 3);
                }
            }

            out.printLine(result);
        }

        int getLeft(int i, int j, int[][] L, Character[][] S) {
            if (S[i][j] == '#') {
                L[i][j] = 0;
                return L[i][j];
            }
            if (L[i][j] != -1) {
                return L[i][j];
            }
            if (j == 0) {
                L[i][j] = 1;
                return L[i][j];
            }
            L[i][j] = getLeft(i, j - 1, L, S) + 1;
            return L[i][j];
        }

        int getRight(int i, int j, int[][] R, Character[][] S) {
            if (S[i][j] == '#') {
                R[i][j] = 0;
                return R[i][j];
            }
            if (R[i][j] != -1) {
                return R[i][j];
            }
            if (j == W - 1) {
                R[i][j] = 1;
                return R[i][j];
            }
            R[i][j] = getRight(i, j + 1, R, S) + 1;
            return R[i][j];
        }

        int getUp(int i, int j, int[][] U, Character[][] S) {
            if (S[i][j] == '#') {
                U[i][j] = 0;
                return U[i][j];
            }
            if (U[i][j] != -1) {
                return U[i][j];
            }
            if (i == 0) {
                U[i][j] = 1;
                return U[i][j];
            }
            U[i][j] = getUp(i - 1, j, U, S) + 1;
            return U[i][j];
        }

        int getDown(int i, int j, int[][] D, Character[][] S) {
            if (S[i][j] == '#') {
                D[i][j] = 0;
                return D[i][j];
            }
            if (D[i][j] != -1) {
                return D[i][j];
            }
            if (i == H - 1) {
                D[i][j] = 1;
                return D[i][j];
            }
            D[i][j] = getDown(i + 1, j, D, S) + 1;
            return D[i][j];
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

        public void printLine(int i) {
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

        public char readCharacter() {
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

