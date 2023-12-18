import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String[][] meiro = new String[h][];
        Queue<Point> queue = new ArrayDeque<>();

        int white = 0;
        for (int i = 0; i < h; i++) {
            meiro[i] = sc.next().split("");
            for (int j = 0; j < w; j++) {
                if (meiro[i][j].equals("#")) {
                    queue.add(new Point(i, j));
                }
            }
        }

        // 上下左右（分岐先）の座標を配列に入れておくと、forループで回して処理できるので便利
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int[][] searched = new int[h][w];
        int ans = 0;
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            ans = Math.max(ans, searched[p.y][p.x]);
            for (int k = 0; k < 4; k++) {
                int x = p.x + dx[k];
                int y = p.y + dy[k];
                // 分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
                if (x >= 0 && x < w && y >= 0 && y < h) {
                    if (meiro[y][x].equals(".") && searched[y][x] == 0) {
                        searched[y][x] = searched[p.y][p.x] + 1;
                        queue.add(new Point(x, y));
                    }
                }
            }
        }

        System.out.println(ans);
    }
}