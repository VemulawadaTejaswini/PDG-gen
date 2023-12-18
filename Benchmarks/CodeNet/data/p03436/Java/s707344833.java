import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Collection;
import java.io.IOException;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author palayutm
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            int[][] a = new int[h][w];
            int sum = 0;
            for (int i = 0; i < h; i++) {
                String s = in.next();
                for (int j = 0; j < w; j++) {
                    a[i][j] = (s.charAt(j) == '.' ? 1 : 0);
                    sum += a[i][j];
                }
            }
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{0, 0});
            int[][] dis = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    dis[i][j] = (int) 1e9;
                }
            }
            dis[0][0] = 1;
            boolean[][] vis = new boolean[h][w];
            int[] dx = {-1, 0, 0, 1};
            int[] dy = {0, -1, 1, 0};
            while (!q.isEmpty()) {
                int[] u = q.poll();
                int x = u[0], y = u[1];
                vis[x][y] = false;
                for (int i = 0; i < 4; i++) {
                    int tx = x + dx[i], ty = y + dy[i];
                    if (tx >= 0 && tx < h && ty >= 0 && ty < w && a[tx][ty] > 0) {
                        if (dis[tx][ty] > dis[x][y] + 1) {
                            dis[tx][ty] = dis[x][y] + 1;
                            if (!vis[tx][ty]) {
                                vis[tx][ty] = true;
                                q.add(new int[]{tx, ty});
                            }
                        }
                    }
                }
            }
            if (dis[h - 1][w - 1] == 1e9) {
                out.println(-1);
            } else {
                out.println(sum - dis[h - 1][w - 1]);
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

