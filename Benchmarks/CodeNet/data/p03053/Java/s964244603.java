import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Collection;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Deque;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ADarkerAndDarker solver = new ADarkerAndDarker();
        solver.solve(1, in, out);
        out.close();
    }

    static class ADarkerAndDarker {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int H = in.ni(), W = in.ni();
            char[][] grid = new char[H][];
            for (int i = 0; i < W; i++) {
                grid[i] = in.ns().toCharArray();
            }
            Deque<Pos> dq = new LinkedList<>();
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (grid[i][j] == '#') {
                        dq.offer(new Pos(i, j, 0));
                    }
                }
            }
            int[] dx = new int[]{1, -1, 0, 0};
            int[] dy = new int[]{0, 0, 1, -1};
            int ans = 0;
            while (!dq.isEmpty()) {
                Pos pos = dq.poll();
                for (int i = 0; i < 4; i++) {
                    int rr = pos.r + dx[i];
                    int cc = pos.c + dy[i];
                    if (rr >= 0 && rr < H && cc >= 0 && cc < W && grid[rr][cc] == '.') {
                        grid[rr][cc] = '#';
                        dq.offer(new Pos(rr, cc, pos.d + 1));
                    }
                }
                ans = pos.d;
            }
            out.println(ans);


        }

        class Pos {
            int r;
            int c;
            int d;

            public Pos(int r, int c, int d) {
                this.r = r;
                this.c = c;
                this.d = d;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String ns() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(ns());
        }

    }
}

