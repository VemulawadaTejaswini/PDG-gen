import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            char[][] a = in.readTable(n, n);
            long answer = 0;
            boolean[][] reachable = new boolean[n][n];
            int[] rowQueue = new int[n * n];
            int[] colQueue = new int[n * n];
            for (int i = 0; i < n; i++) {
                ArrayUtils.fill(reachable, false);
                int sum = 0;
                for (int j = n - 1; j >= 0; j--) {
                    if (a[i][j] == '#') {
                        ArrayUtils.fill(reachable, false);
                        sum = 0;
                        continue;
                    }
                    rowQueue[0] = i;
                    colQueue[0] = j;
                    reachable[i][j] = true;
                    int current = a[i][j] - '0';
                    sum += current;
                    int size = 1;
                    for (int k = 0; k < size; k++) {
                        int row = rowQueue[k];
                        int col = colQueue[k];
                        if (row + 1 < n && a[row + 1][col] != '#' && !reachable[row + 1][col]) {
                            reachable[row + 1][col] = true;
                            sum += a[row + 1][col] - '0';
                            rowQueue[size] = row + 1;
                            colQueue[size++] = col;
                        }
                        if (col + 1 < n && a[row][col + 1] != '#' && !reachable[row][col + 1]) {
                            reachable[row][col + 1] = true;
                            sum += a[row][col + 1] - '0';
                            rowQueue[size] = row;
                            colQueue[size++] = col + 1;
                        }
                    }
                    answer += (sum - current) * current;
                }
            }
            out.printLine(answer);
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

    static class ArrayUtils {
        public static void fill(boolean[][] array, boolean value) {
            for (boolean[] row : array) {
                Arrays.fill(row, value);
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

        public char[] readCharArray(int size) {
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = readCharacter();
            }
            return array;
        }

        public char[][] readTable(int rowCount, int columnCount) {
            char[][] table = new char[rowCount][];
            for (int i = 0; i < rowCount; i++) {
                table[i] = this.readCharArray(columnCount);
            }
            return table;
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

