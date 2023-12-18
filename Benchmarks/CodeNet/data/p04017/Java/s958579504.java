import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        ETakAndHotels solver = new ETakAndHotels();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETakAndHotels {
        void dfs(int x, int p, ArrayList<Integer>[] adj, int[][] anc) {
            anc[x][0] = p;
            for (int i = 1; i < anc[x].length; i++)
                anc[x][i] = anc[anc[x][i - 1]][i - 1];
            for (int y : adj[x])
                dfs(y, x, adj, anc);
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++)
                x[i] = s.nextInt();
            int l = s.nextInt();
            int h = (int) Math.log(n) + 1;
            ArrayList<Integer>[] adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            int r = 0;
            for (int i = 0; i < n - 1; i++) {
                while (r < n && x[i] + l >= x[r])
                    r++;
                adj[r - 1].add(i);
            }
            int[][] ltr = new int[n][h];
            dfs(n - 1, n - 1, adj, ltr);
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            r = n - 1;
            for (int i = n - 1; i > 0; i--) {
                while (r >= 0 && x[i] - l <= x[r])
                    r--;
                adj[r + 1].add(i);
            }
            int[][] rtl = new int[n][h];
            dfs(0, 0, adj, rtl);
            int q = s.nextInt();
            while (q-- > 0) {
                int a = s.nextInt() - 1, b = s.nextInt() - 1;
                int ans = 0;
                if (a < b) {
                    for (int i = h - 1; i >= 0; i--) {
                        if (ltr[a][i] < b) {
                            a = ltr[a][i];
                            ans += 1 << i;
                        }
                    }
                } else {
                    for (int i = h - 1; i >= 0; i--) {
                        if (rtl[a][i] > b) {
                            a = rtl[a][i];
                            ans += 1 << i;
                        }
                    }
                }
                w.println(ans + 1);
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

