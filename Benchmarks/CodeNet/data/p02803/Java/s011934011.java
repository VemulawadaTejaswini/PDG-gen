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
        MazeMaster solver = new MazeMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class MazeMaster {
        int[][] map;
        int h;
        int w;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();

            map = new int[h][w];

            for (int i = 0; i < h; i++) {
                String s = in.next();
                char[] chars = s.toCharArray();
                for (int j = 0; j < w; j++) {
                    if (chars[j] == '.') {
                        map[i][j] = 1;
                    }
                }
            }
            int result = 0;
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    int[] d = dijkstra(i, j, map);
                    for (int k = 0; k < d.length; k++) {
                        int x = k % w;
                        int y = k / w;
                        if (map[y][x] == 1) {
                            result = Math.max(result, d[k]);
                        }
                    }
                }
            }

            out.println(result);
        }

        int[] dijkstra(int x, int y, int[][] map) {
            if (map[y][x] == 0) {
                return new int[0];
            }

            MazeMaster.Color[] colors = new MazeMaster.Color[h * w];
            int[] distance = new int[h * w];

            Arrays.fill(colors, MazeMaster.Color.WHITE);
            Arrays.fill(distance, Integer.MAX_VALUE);

            distance[y * w + x] = 0;
            colors[y * w + x] = MazeMaster.Color.GRAY;
            int minv;

            while (true) {
                int u = -1;
                minv = Integer.MAX_VALUE;
                for (int i = 0; i < distance.length; i++) {
                    if (minv > distance[i] && colors[i] != MazeMaster.Color.BLACK) {
                        u = i;
                        minv = distance[i];
                    }
                }
                if (u == -1) {
                    break;
                }
                colors[u] = MazeMaster.Color.BLACK;
                int nx = u % w;
                int ny = u / w;
                if (arrayCheck(nx + 1, ny) && colors[ny * w + nx + 1] == MazeMaster.Color.WHITE && map[ny][nx + 1] > 0) {
                    if (distance[ny * w + nx + 1] > distance[u] + map[ny][nx + 1]) {
                        distance[ny * w + nx + 1] = distance[u] + map[ny][nx + 1];
                        colors[ny * w + nx + 1] = MazeMaster.Color.GRAY;
                    }
                }
                if (arrayCheck(nx - 1, ny) && colors[ny * w + nx - 1] == MazeMaster.Color.WHITE && map[ny][nx - 1] > 0) {
                    if (distance[ny * w + nx - 1] > distance[u] + map[ny][nx - 1]) {
                        distance[ny * w + nx - 1] = distance[u] + map[ny][nx - 1];
                        colors[ny * w + nx - 1] = MazeMaster.Color.GRAY;
                    }
                }
                if (arrayCheck(nx, ny + 1) && colors[(ny + 1) * w + nx] == MazeMaster.Color.WHITE && map[ny + 1][nx] > 0) {
                    if (distance[(ny + 1) * w + nx] > distance[u] + map[ny + 1][nx]) {
                        distance[(ny + 1) * w + nx] = distance[u] + map[ny + 1][nx];
                        colors[(ny + 1) * w + nx] = MazeMaster.Color.GRAY;
                    }
                }
                if (arrayCheck(nx, ny + -1) && colors[(ny - 1) * w + nx] == MazeMaster.Color.WHITE && map[ny - 1][nx] > 0) {
                    if (distance[(ny - 1) * w + nx] > distance[u] + map[ny - 1][nx]) {
                        distance[(ny - 1) * w + nx] = distance[u] + map[ny - 1][nx];
                        colors[(ny - 1) * w + nx] = MazeMaster.Color.GRAY;
                    }
                }
            }
            return distance;
        }

        public boolean arrayCheck(int x, int y) {
            if (x < 0 || y < 0) {
                return false;
            }
            if (h <= y || w <= x) {
                return false;
            }
            return true;
        }

        public enum Color {
            WHITE,
            GRAY,
            BLACK,
            ;
        }

    }
}

