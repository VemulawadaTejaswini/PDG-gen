import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
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
        ECoinsRespawn solver = new ECoinsRespawn();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoinsRespawn {
        ArrayList<Integer>[] adj;
        Edge[] edge;

        public void solve(int testNumber, InputReader s, PrintWriter w) {
            int n = s.nextInt(), m = s.nextInt();
            long p = s.nextLong();
            edge = new Edge[m];
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                edge[i] = new Edge(s.nextInt() - 1, s.nextInt() - 1, s.nextLong());
                adj[edge[i].u].add(i);
            }
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            long[][] dp = new long[n][2 * m + 1];
            for (int i = 1; i <= 2 * m; i++) {
                Queue<Integer> temp = new LinkedList<>();
                boolean[] vis = new boolean[n];
                while (!q.isEmpty()) {
                    int x = q.poll();
                    for (int k : adj[x]) {
                        Edge e = edge[k];
                        dp[e.v][i] = Math.max(dp[e.v][i], dp[e.u][i - 1] + e.w);
                        if (!vis[e.v]) {
                            temp.add(e.v);
                            vis[e.v] = true;
                        }
                    }
                }
                q = temp;
            }

            long res1 = 0;
            long res2 = 0;
            for (int i = 1; i <= m; i++)
                res1 = Math.max(res1, dp[n - 1][i] - p * i);
            for (int i = 1; i <= 2 * m; i++)
                res2 = Math.max(res2, dp[n - 1][i] - p * i);

            if (res2 > res1)
                w.println(-1);
            else
                w.println(res1);
        }

        class Edge {
            int u;
            int v;
            long w;

            Edge(int u, int v, long w) {
                this.u = u;
                this.v = v;
                this.w = w;
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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

