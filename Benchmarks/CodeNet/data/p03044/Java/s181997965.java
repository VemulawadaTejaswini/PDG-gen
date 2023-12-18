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
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        int[] col;
        ArrayList<Integer>[] adj;
        ArrayList<Integer>[] wt;

        void dfs(int x, int p) {
            for (int i = 0; i < adj[x].size(); i++) {
                int y = adj[x].get(i);
                int w = wt[x].get(i);
                if (y != p) {
                    if (w % 2 == 0) {
                        col[y] = col[x];
                    } else
                        col[y] = 1 ^ col[x];
                    dfs(y, x);
                }
            }
        }

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt();
            col = new int[n];
            adj = new ArrayList[n];
            wt = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
                wt[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int u = s.nextInt() - 1;
                int v = s.nextInt() - 1;
                int z = s.nextInt();
                adj[u].add(v);
                adj[v].add(u);
                wt[u].add(z);
                wt[v].add(z);
            }
            dfs(0, -1);
            for (int i = 0; i < n; i++)
                w.println(col[i]);
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

