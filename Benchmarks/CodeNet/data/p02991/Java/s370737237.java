import java.awt.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> edge = new HashMap<>();
        for (int i = 0; i < n; i++) {
            edge.put(i, new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            edge.get(scanner.nextInt() - 1).add(scanner.nextInt() - 1);
        }
        int[][] can = new int[n][3];
        int s = scanner.nextInt() - 1;
        int t = scanner.nextInt() - 1;
        can[s][0] = 1;
        Deque<Point> deque = new ArrayDeque<>();
        deque.add(new Point(s, 0));
        while (!deque.isEmpty()) {
            Point point = deque.poll();
            for (int v : edge.get(point.x)) {
                if (can[v][(point.y + 1) % 3] == 0) {
                    can[v][(point.y + 1) % 3] = can[point.x][point.y] + 1;
                    deque.add(new Point(v, (point.y + 1) % 3));
                } else {
                    can[v][(point.y + 1) % 3] = Math.min(can[v][(point.y + 1) % 3], can[point.x][point.y] + 1);
                }
            }
        }
        if (can[t][0] == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(can[t][0] / 3);
    }
}