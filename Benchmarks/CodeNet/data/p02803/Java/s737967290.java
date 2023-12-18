import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Sparsh Sanchorawala
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMazeMaster solver = new DMazeMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMazeMaster {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            int[] di = {-1, 1, 0, 0};
            int[] dj = {0, 0, -1, 1};
            char[][] a = new char[n][];
            for (int i = 0; i < n; i++)
                a[i] = s.next().toCharArray();
            int ans = 0;
            for (int x_i = 0; x_i < n; x_i++) {
                for (int x_j = 0; x_j < m; x_j++) {
                    if (a[x_i][x_j] == '#')
                        continue;
                    int[][] level = new int[n][m];
                    for (int i = 0; i < n; i++)
                        Arrays.fill(level[i], -1);
                    level[x_i][x_j] = 0;
                    Queue<Pair> q = new LinkedList<>();
                    q.add(new Pair(x_i, x_j));
                    while (!q.isEmpty()) {
                        Pair p = q.poll();
                        ans = Math.max(level[p.i][p.j], ans);
                        for (int k = 0; k < 4; k++) {
                            if (p.i + di[k] >= 0 && p.i + di[k] < n && p.j + dj[k] >= 0 && p.j + dj[k] < m && level[p.i + di[k]][p.j + dj[k]] == -1 && a[p.i + di[k]][p.j + dj[k]] == '.') {
                                level[p.i + di[k]][p.j + dj[k]] = level[p.i][p.j] + 1;
                                q.add(new Pair(p.i + di[k], p.j + dj[k]));
                            }
                        }
                    }
                }
            }
            w.println(ans);
        }

        class Pair {
            int i;
            int j;

            Pair(int i, int j) {
                this.i = i;
                this.j = j;
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

        public String nextString() {
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

