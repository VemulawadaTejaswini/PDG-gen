import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

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
        top:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                // 始点が壁
                if (list[i][j].equals("#")) {
                    continue;
                }
                for (int k = i; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        // 探索済み
                        if (k == i && j <= l) {
                            continue;
                        }
                        // 終点が壁
                        if (list[k][l].equals("#")) {
                            continue;
                        }
                        String original = list[k][l];
                        list[k][l] = "e";
                        int[][] searched = new int[h][w];
                        Deque<Point> stack = new ArrayDeque<>();
                        stack.addFirst(new Point(j, i));
                        int count = 0;
                        syori : while (!stack.isEmpty()) {
                            Point p = stack.removeFirst(); // 先頭の座標を取得後、削除
                            for (int m = 0; m < 4; m++) {
                                int x = p.x + dx[m];
                                int y = p.y + dy[m];
                                // 分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
                                if (x >= 0 && x < w && y >= 0 && y < h) {
                                    if (list[y][x].equals(".") && searched[y][x] == 0) {
                                        count++;
                                        stack.add(new Point(x, y));
                                        searched[y][x] = searched[p.y][p.x] + 1; // 追加した座標を探索済みにする
                                    } else if (list[y][x].equals("e")) {
                                        count = searched[p.y][p.x] + 1;
                                        break syori;
                                    }
                                }
                            }
                        }
                        list[k][l] = original;
                        ans = Math.max(ans, count);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}