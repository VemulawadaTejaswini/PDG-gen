import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();

        int[][] cost = new int[10][10];
        for (int i = 0; i < 10; i++) {
            Arrays.setAll(cost[i], i1 -> scanner.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                continue;
            }
            int standard = cost[i][1];
            Deque<Point> stack = new ArrayDeque<>();
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    continue;
                }
                if (cost[i][j] < cost[i][1]) {
                    stack.addFirst(new Point(j, cost[i][j]));
                }
            }
            while (!stack.isEmpty()) {
                Point p = stack.removeFirst(); // 先頭の座標を取得後、削除
                for (int k = 0; k < 10; k++) {
                    if (p.x == k) {
                        continue;
                    }
                    int v = p.y + cost[p.x][k];
                    if (v < standard) {
                        if (k == 1) {
                            standard = v;
                        } else {
                            stack.add(new Point(k, v));
                        }
                    }
                }
            }
            cost[i][1] = standard;
        }
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int v = scanner.nextInt();
                if (v > - 1) {
                    ans += cost[v][1];
                }
            }
        }
        System.out.println(ans);
    }
}