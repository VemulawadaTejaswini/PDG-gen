import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CAlternatingPath solver = new CAlternatingPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAlternatingPath {
        int h;
        int w;
        char[][] c;
        boolean[][] used;
        int ans = 0;
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            h = in.nextInt();
            w = in.nextInt();
            c = new char[h][w];
            used = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                c[i] = in.next().toCharArray();
                Arrays.fill(used[i], false);
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    Pair p = new Pair(0, 0);
                    dfs(i, j, p);
                    ans += p.x * p.y;
                }
            }
            out.println(ans);
        }

        void dfs(int x, int y, Pair p) {
            if (used[x][y]) {
                return;
            }

            used[x][y] = true;

            if (c[x][y] == '.') {
                p.y++;
            } else {
                p.x++;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx < h && 0 <= ny && ny < w) {
                    if (c[x][y] != c[nx][ny] && !used[nx][ny]) {
                        dfs(nx, ny, p);
                    }
                }
            }
        }

    }

    static class Pair {
        public long x;
        public long y;

        public Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    }
}

