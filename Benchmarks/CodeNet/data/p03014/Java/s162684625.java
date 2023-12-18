import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        // abc 129

        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] list = new String[h][];

        for (int i = 0; i < h; i++) {
            list[i] = sc.next().split("");
        }

        // 上下左右（分岐先）の座標を配列に入れておくと、forループで回して処理できるので便利
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int ans = 0;

        // 縦
        for (int i = 0; i < h; i++) {
            // 横
            for (int j = 0; j < w; j++) {
                if (list[i][j].equals("#")) {
                    continue;
                }
                Deque<Point> stack = new ArrayDeque<>();
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    stack.addFirst(new Point(j, i));
                    while (!stack.isEmpty()) {
                        Point p = stack.removeFirst();
                        int x = p.x + dx[k];
                        int y = p.y + dy[k];
                        // 分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
                        if (x >= 0 && x < w && y >= 0 && y < h) {
                            if (list[y][x].equals(".")) {
                                count++;
                                stack.addFirst(new Point(x, y));
                            }
                        }
                    }
                }
                ans = Math.max(ans, count);
            }
        }
        System.out.println(++ans);
    }
}