import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {

            int n = in.nextInt(), m = in.nextInt();
            List<int[]> ans = new ArrayList<>();
            int[][] map = in.nextIntMap(n, m);
            for (int r = 0; r < n; ++r) {
                for (int c = 0; c < m - 1; ++c) {
                    if (map[r][c] % 2 == 1) {
                        --map[r][c];
                        ++map[r][c + 1];
                        ans.add(new int[]{r + 1, c + 1, r + 1, c + 2});
                    }
                }
            }
            for (int r = 0; r < n - 1; ++r) {
                if (map[r][m - 1] % 2 == 1) {
                    --map[r][m - 1];
                    ++map[r + 1][m - 1];
                    ans.add(new int[]{r + 1, m, r + 2, m});
                }
            }
            out.println(ans.size());
            for (int[] aa : ans) ArrayUtils.printArray(out, aa);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        public int[][] nextIntMap(int n, int m) {
            int[][] array = new int[n][];
            for (int i = 0; i < n; i++) {
                array[i] = nextIntArray(m);
            }
            return array;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class ArrayUtils {
        public static void printArray(PrintWriter out, int[] array) {
            if (array.length == 0) return;
            for (int i = 0; i < array.length; i++) {
                if (i != 0) out.print(" ");
                out.print(array[i]);
            }
            out.println();
        }

    }
}

