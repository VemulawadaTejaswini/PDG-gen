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
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        static final int[] dx = {0, 1, 0, -1};
        static final int[] dy = {1, 0, -1, 0};

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            char[][] a = IOUtils.readTable(in, n, m);

            final int diagCount = n + m - 1;
            long ans = 0;
            for (int dist = 2; dist <= n + m - 2; dist += 2) {
                int[][] d1 = new int[diagCount][diagCount];
                int[][] d2 = new int[diagCount][diagCount];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (a[i][j] == '#') {
                            int z1 = i + j;
                            int z2 = i + (m - j - 1);
                            d1[z1][z2]++;
                            d2[z2][z1]++;
                        }
                    }
                }
                for (int z1 = 0; z1 < diagCount; z1++) {
                    for (int z2 = 0; z2 < diagCount; z2++) {
                        if (d1[z1][z2] > 1) {
                            throw new AssertionError();
                        }
                        if (d2[z2][z1] > 1) {
                            throw new AssertionError();
                        }
                    }
                }

                int[][] p1 = new int[diagCount][diagCount];
                int[][] p2 = new int[diagCount][diagCount];
                for (int z1 = 0; z1 < diagCount; z1++) {
                    for (int z2 = 0; z2 < diagCount; z2++) {
                        if (d1[z1][z2] == 1 && z2 + dist < diagCount && d1[z1][z2 + dist] == 1) {
                            p1[z1][z2] = 1;
                        }
                        if (d2[z2][z1] == 1 && z1 + dist < diagCount && d2[z2][z1 + dist] == 1) {
                            p2[z2][z1] = 1;
                        }
                    }
                }
                for (int[] arr : p1) makePrefixSum(arr);
                for (int[] arr : p2) makePrefixSum(arr);

                long curDistAns = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (a[i][j] == '#') {
                            int cellAns = 0;
                            for (int k = 0; k < 4; k++) {
                                int xs = i + dist * dx[k];
                                int ys = j + dist * dy[k];
                                int xf = i + dist * dx[(k + 1) & 3];
                                int yf = j + dist * dy[(k + 1) & 3];
                                int z1s = xs + ys;
                                int z2s = xs + (m - ys - 1);
                                int z1f = xf + yf;
                                int z2f = xf + (m - yf - 1);
                                if (z1s == z1f) {
                                    if (0 <= z1s && z1s < diagCount) {
                                        int add = prefSum(p1[z1s], z2s, z2f, dist);
//                                    if (add > 0) {
//                                        System.err.println("dist = " + dist + ", cell = (" + i + "," + j + "), z = " + z1s + ", [s,f] = " + z2s + " " + z2f + ", p = " + Arrays.toString(p1[z1s]));
//                                    }
                                        cellAns += add;
                                    }
                                } else if (z2s == z2f) {
                                    if (0 <= z2s && z2s < diagCount) {
                                        int add = prefSum(p2[z2s], z1s, z1f, dist);
//                                    if (add > 0) {
//                                        System.err.println("dist = " + dist + ", cell = (" + i + "," + j + "), z = " + z2s + ", [s,f] = " + z1s + " " + z1f + ", p = " + Arrays.toString(p2[z2s]));
//                                    }
                                        cellAns += add;
                                    }
                                } else {
                                    throw new AssertionError();
                                }
                                int xm = (xs + xf) / 2;
                                int ym = (ys + yf) / 2;
                                if (ok(xs, ys, n, m) && ok(xm, ym, n, m)) {
                                    if (a[xs][ys] == '#' && a[xm][ym] == '#') {
                                        cellAns--;
                                    }
                                }
//                            if (ok(xf, yf, n, m) && ok(xm, ym, n, m)) {
//                                if (a[xf][yf] == '#' && a[xm][ym] == '#') {
//                                    cellAns--;
//                                }
//                            }
//                            if (ok(xs, ys, n, m) && ok(xf, yf, n, m) && ok(xm, ym, n, m)) {
//                                if (a[xf][yf] == '#' && a[xf][yf] == '#' && a[xm][ym] == '#') {
//                                    cellAns++;
//                                }
//                            }
                            }
//                        if (cellAns > 0) {
//                            System.err.println("dist = " + dist + ", cell = (" + i + "," + j + "), ans = " + cellAns);
//                        }
                            curDistAns += cellAns;
                        }
                    }
                }

                ans += curDistAns;
            }

            out.printLine(ans);
        }

        private boolean ok(int x, int y, int n, int m) {
            return (0 <= x && x < n) && (0 <= y && y < m);
        }

        private void makePrefixSum(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                arr[i] += arr[i - 1];
            }
        }

        private int prefSum(int[] p, int a, int b, int dist) {
            if (a > b) {
                int t = a;
                a = b;
                b = t;
            }
            if (b >= p.length) {
                b = p.length - 1;
            }
            if (a < 0) {
                a = 0;
            }

            b -= dist;
            if (a > b) return 0;

            int res = p[b];
            if (a > 0) res -= p[a - 1];
            return res;
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
}

