import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
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
        CClosedRooms solver = new CClosedRooms();
        solver.solve(1, in, out);
        out.close();
    }

    static class CClosedRooms {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int h = in.readInt();
            int w = in.readInt();
            int k = in.readInt();
            String[] a = in.readStringArray(h);

            int si = 0;
            int sj = 0;
            boolean[][] b = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    b[i][j] = a[i].charAt(j) == '#';
                    if (a[i].charAt(j) == 'S') {
                        si = i;
                        sj = j;
                    }
                }
            }

            ArrayDeque<IntIntPair> q = new ArrayDeque<>();
            q.add(new IntIntPair(si, sj));
            int[][] dist = new int[h][w];
            ArrayUtils.fill(dist, Constants.INF);
            dist[si][sj] = 0;
            while (!q.isEmpty()) {
                IntIntPair ii = q.poll();
                for (int i = 0; i < 4; i++) {
                    int ti = ii.first + MiscUtils.DY4[i];
                    int tj = ii.second + MiscUtils.DX4[i];
                    if (ti < 0 || ti > h - 1 || tj < 0 || tj > w - 1 || b[ti][tj]) continue;
                    if (dist[ti][tj] == Constants.INF) {
                        dist[ti][tj] = dist[ii.first][ii.second] + 1;
                        q.add(new IntIntPair(ti, tj));
                    }
                }
            }

            int ans = Constants.INF;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (dist[i][j] > k) continue;
                    int d = Math.min(Math.min(i, h - 1 - i), Math.min(j, w - 1 - j));
                    ans = Math.min(ans, 1 + (d + k - 1) / k);
                }
            }
            out.printLine(ans);
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

        public String[] readStringArray(int size) {
            String[] array = new String[size];
            for (int i = 0; i < size; i++) {
                array[i] = readString();
            }
            return array;
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

    static class MiscUtils {
        public static final int[] DX4 = {1, 0, -1, 0};
        public static final int[] DY4 = {0, -1, 0, 1};

    }

    static class Constants {
        public static final int INF = (int) 1e9 + 1;

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
}

