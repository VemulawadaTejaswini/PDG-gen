import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.ArrayDeque;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            int k = in.readInt();
            char[][] map = IOUtils.readTable(in, h, w);
            int si = -1;
            int sj = -1;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 'S') {
                        si = i;
                        sj = j;
                    }
                }
            }
            int[][] distance = new int[h][w];
            ArrayUtils.fill(distance, -1);
            distance[si][sj] = 0;
            Queue<IntIntPair> queue = new ArrayDeque<>();
            queue.add(new IntIntPair(si, sj));
            while (!queue.isEmpty()) {
                int row = queue.peek().first;
                int col = queue.poll().second;
                for (int i = 0; i < 4; i++) {
                    int nrow = row + MiscUtils.DX4[i];
                    int ncol = col + MiscUtils.DY4[i];
                    if (MiscUtils.isValidCell(nrow, ncol, h, w) && map[nrow][ncol] != '#' &&
                            distance[nrow][ncol] == -1) {
                        distance[nrow][ncol] = distance[row][col] + 1;
                        queue.add(new IntIntPair(nrow, ncol));
                    }
                }
            }
            int answer = Integer.MAX_VALUE;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (distance[i][j] != -1 && distance[i][j] <= k) {
                        answer = Math.min(answer, 1 + Math.min(Math.min((i + k - 1) / k, (j + k - 1) / k),
                                Math.min((h - i + k - 2) / k, (w - j
                                        + k - 2) / k)));
                    }
                }
            }
            out.printLine(answer);
        }

    }

    static class IntIntPair implements Comparable<IntIntPair> {
        public final int first;
        public final int second;

        public IntIntPair(int first, int second) {
            this.first = first;
            this.second = second;
        }


        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            IntIntPair pair = (IntIntPair) o;

            return first == pair.first && second == pair.second;
        }


        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }


        public String toString() {
            return "(" + first + "," + second + ")";
        }

        @SuppressWarnings({"unchecked"})
        public int compareTo(IntIntPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }

    static class ArrayUtils {
        public static void fill(int[][] array, int value) {
            for (int[] row : array) {
                Arrays.fill(row, value);
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

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class MiscUtils {
        public static final int[] DX4 = {1, 0, -1, 0};
        public static final int[] DY4 = {0, -1, 0, 1};

        public static boolean isValidCell(int row, int column, int rowCount, int columnCount) {
            return row >= 0 && row < rowCount && column >= 0 && column < columnCount;
        }

    }

    static class IOUtils {
        public static char[] readCharArray(InputReader in, int size) {
            char[] array = new char[size];
            for (int i = 0; i < size; i++) {
                array[i] = in.readCharacter();
            }
            return array;
        }

        public static char[][] readTable(InputReader in, int rowCount, int columnCount) {
            char[][] table = new char[rowCount][];
            for (int i = 0; i < rowCount; i++) {
                table[i] = readCharArray(in, columnCount);
            }
            return table;
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

