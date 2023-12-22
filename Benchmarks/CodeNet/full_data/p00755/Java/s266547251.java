import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CIdenticallyColoredPanelsConnection solver = new CIdenticallyColoredPanelsConnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class CIdenticallyColoredPanelsConnection {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), c = in.nextInt();
            while (h != 0 || w != 0 || c != 0) {
                int[][] p = new int[h][w];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        p[i][j] = in.nextInt();
                    }
                }

                int ans = 0;
                for (int i = 0; i < 6 * 6 * 6 * 6; i++) {
                    CIdenticallyColoredPanelsConnection.Board board = new CIdenticallyColoredPanelsConnection.Board(h, w, p);
                    int t = i;
                    for (int j = 0; j < 4; j++) {
                        int color = (t % 6) + 1;
                        t /= 6;
                        board.dfs(color);
                    }
                    board.dfs(c);
                    ans = Math.max(ans, board.dfs(-1));
                }
                out.println(ans);

                h = in.nextInt();
                w = in.nextInt();
                c = in.nextInt();
            }
        }

        private static class Board {
            private static final int[] DX = {0, 1, 0, -1};
            private static final int[] DY = {1, 0, -1, 0};
            int h;
            int w;
            int[][] p;
            boolean[][] visited;

            Board(int h, int w, int[][] p) {
                this.h = h;
                this.w = w;
                this.p = new int[h][w];
                this.visited = new boolean[h][w];
                for (int i = 0; i < h; i++) {
                    System.arraycopy(p[i], 0, this.p[i], 0, w);
                }
            }

            int dfs(int to) {
                for (int i = 0; i < h; i++) {
                    Arrays.fill(visited[i], false);
                }
                return dfs(0, 0, p[0][0], to);
            }

            int dfs(int y, int x, int from, int to) {
                int cnt = 1;
                visited[y][x] = true;
                p[y][x] = to;
                for (int i = 0; i < 4; i++) {
                    int nx = x + DX[i], ny = y + DY[i];
                    if (nx < 0 || ny < 0 || nx == w || ny == h || visited[ny][nx]) {
                        continue;
                    }
                    if (from == p[ny][nx]) {
                        cnt += dfs(ny, nx, from, to);
                    }
                }
                return cnt;
            }

        }

    }
}


