import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

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
        GridRepainting solver = new GridRepainting();
        solver.solve(1, in, out);
        out.close();
    }

    static class GridRepainting {
        int[] route;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            int masu = h * w;
            int block = 0;
            int[][] map = new int[h][w];

            route = new int[h * w];
            for (int i = 0; i < h; i++) {
                String s = in.next();
                char[] chars = s.toCharArray();
                for (int j = 0; j < w; j++) {
                    if (chars[j] == '.') {
                        map[i][j] = 1;
                    } else {
                        block++;
                    }
                }
            }
            int[] ret = dijkstra(0, 0, map);
            int minus = 0;

            if (ret[ret.length - 1] == Integer.MAX_VALUE) {
                out.println(-1);
                return;
            }
            out.println(masu - block - ret[ret.length - 1] - 1);
        }

        int[] dijkstra(int x, int y, int[][] map) {
            if (map[y][x] == 0) {
                return new int[0];
            }
            int h = map.length;
            int w = map[0].length;

            int[] distance = new int[h * w];
            Arrays.fill(distance, Integer.MAX_VALUE);

            distance[y * w + x] = 0;

            Queue<Pair> pq = new ArrayDeque<>();
            pq.add(new Pair(x, y));

            int[] nx = {-1, 1, 0, 0};
            int[] ny = {0, 0, -1, 1};

            while (!pq.isEmpty()) {
                Pair p = pq.poll();
                for (int i = 0; i < nx.length; i++) {
                    int xx = p.x + nx[i];
                    int yy = p.y + ny[i];
                    if (canMove(xx, yy, map)) {
                        if (distance[yy * w + xx] > distance[p.y * w + p.x] + map[yy][xx]) {
                            distance[yy * w + xx] = distance[p.y * w + p.x] + map[yy][xx];
                            // from: p.y * w + p.x
                            // to: yy * w + xx
                            // を保持しておく
                            route[yy * w + xx] = p.y * w + p.x;
                            pq.add(new Pair(xx, yy));
                        }
                    }
                }
            }
            return distance;
        }

        public boolean canMove(int x, int y, int[][] map) {
            return isInside(x, y, map) && map[y][x] != 0;
        }

        public boolean isInside(int x, int y, int[][] map) {
            int h = map.length;
            if (h <= 0) {
                return false;
            }
            int w = map[0].length;
            if (w <= 0) {
                return false;
            }

            if (x < 0 || y < 0) {
                return false;
            }
            return h > y && w > x;
        }

        public class Pair {
            public final Integer x;
            public final Integer y;

            public Pair(Integer x, Integer y) {
                this.x = x;
                this.y = y;
            }

        }

    }
}

