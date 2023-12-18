import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
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
        BEvenDegrees solver = new BEvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class BEvenDegrees {
        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            TreeSet<Integer>[] hs = new TreeSet[2];
            Edge[] edge = new Edge[m];
            int[] dir = new int[m];
            HashSet<Integer>[] adj = new HashSet[n];
            for (int i = 0; i < n; i++)
                adj[i] = new HashSet<>();
            for (int i = 0; i < m; i++) {
                edge[i] = new Edge(s.nextInt() - 1, s.nextInt() - 1);
                adj[edge[i].u].add(i);
                adj[edge[i].v].add(i);
            }
            if (m % 2 == 1) {
                w.println(-1);
                return;
            }
            hs[0] = new TreeSet<>();
            hs[1] = new TreeSet<>();
            for (int i = 0; i < n; i++)
                hs[adj[i].size() % 2].add(i);

            for (int j = 0; j < n; j++) {
                int x = -1;
                if (!hs[0].isEmpty()) {
                    x = hs[0].first();
                    hs[0].remove(x);
                } else {
                    x = hs[1].first();
                    hs[1].remove(x);
                }
                for (int i : adj[x]) {
                    Edge e = edge[i];
                    if (edge[i].v == x)
                        dir[i] = 1;
                    int y = edge[i].other(x);
                    hs[adj[y].size() % 2].remove(y);
                    adj[y].remove(i);
                    hs[adj[y].size() % 2].add(y);
                }
            }

            for (int i = 0; i < m; i++) {
                if (dir[i] == 0) {
                    w.println((edge[i].u + 1) + " " + (edge[i].v + 1));
                } else
                    w.println((edge[i].v + 1) + " " + (edge[i].u + 1));
            }
        }

        class Edge {
            int u;
            int v;

            Edge(int u, int v) {
                this.u = u;
                this.v = v;
            }

            int other(int x) {
                return (x == u) ? v : u;
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

