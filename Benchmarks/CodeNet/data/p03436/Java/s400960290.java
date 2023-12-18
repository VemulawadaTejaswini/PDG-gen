import java.awt.*;
import java.util.*;

import static java.lang.System.*;

public class Main {
    private static final int INF = 1000;
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] s = new String[W];
        for (int i = 0; i < H; i++) {
            s[i] = sc.next();
        }

        // 幅優先探索(wfs)
        ArrayDeque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(0, 0));

        int[][] dist = new int[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(dist[i], INF);
        }
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.x;
            int y = p.y;

            if (x == H - 1 && y == W - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < H && 0 <= ny && ny < W && s[nx].charAt(ny) != '#' && dist[nx][ny] == INF) {
                    dist[nx][ny] = dist[x][y] + 1;
                    queue.add(new Point(nx, ny));
                }
            }

        }

        if (dist[H - 1][W - 1] == INF) {
            out.println(-1);
        } else {
            int black = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (s[i].charAt(j) == '#') {
                        black++;
                    }
                }
            }
            out.println(W * H - black - dist[H - 1][W - 1] - 1);
        }
    }
}