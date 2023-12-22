import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    static final int[] dx = {0, 1, 0, -1, 1, -1, -1, 1}, dy = {1, 0, -1, 0, 1, 1, -1, -1};
    static int w, h;
    static int[][] board;

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void walk(int x, int y) {
        ArrayDeque<Pair> que = new ArrayDeque<>();

        que.push(new Pair(x, y));
        while (!que.isEmpty()) {
            Pair p = que.poll();
            board[p.y][p.x] = 0;
            for (int i = 0; i < 8; ++i) {
                int nx = p.x + dx[i], ny = p.y + dy[i];
                if (nx < 0 || nx >= w || ny < 0 || ny >= h) continue;

                if (board[ny][nx] == 1) {
                    que.push(new Pair(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            w = scanner.nextInt();
            h = scanner.nextInt();

            if (w == 0 && h == 0) break;

            board = new int[h][w];
            int ans = 0;

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    board[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                    if (board[i][j] == 1) {
                        ++ans;
                        walk(j, i);
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
