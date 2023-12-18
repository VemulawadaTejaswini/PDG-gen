import java.util.*;

public class Main {

    static class Pair {
        int h, w, cnt;

        public Pair(int h, int w, int cnt) {
            this.h = h;
            this.w = w;
            this.cnt = cnt;
        }
    }

    static int bfs() {
        visited = new boolean[H][W];
        visited[0][0] = true;
        prev = new Pair[H][W];
        prev[0][0] = new Pair(-1, -1, -1);

        Deque<Pair> que = new ArrayDeque<>();
        que.offer(new Pair(0, 0, 0));

        while (!que.isEmpty()) {
            Pair pair = que.poll();
            if (pair.h == H-1 && pair.w == W-1) return pair.cnt;

            for (int dir = 0; dir < 4; ++dir) {
                int nh = pair.h + dy[dir];
                int nw = pair.w + dx[dir];

                if (nh < 0 || nh >= H || nw < 0 || nw >= W) continue;
                if (visited[nh][nw]) continue;
                if (grid[nh][nw] == '#') continue;

                prev[nh][nw] = pair;
                visited[nh][nw] = true;
                que.offer(new Pair(nh, nw, pair.cnt + 1));
            }
        }

        return 0;
    }

    static int H;
    static int W;
    static boolean[][] visited;
    static char[][] grid;
    static Pair[][] prev;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = Integer.parseInt(sc.next());
        W = Integer.parseInt(sc.next());
        grid = new char[H][W];
        for (int i = 0; i < H; ++i) grid[i] = sc.next().toCharArray();
        int black = 0;
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                if (grid[i][j] == '#') ++black;
            }
        }

        int cnt = bfs();

        if (cnt != 0)
            System.out.println(H * W - black - cnt - 1);
        else
            System.out.println(-1);
    }
}
