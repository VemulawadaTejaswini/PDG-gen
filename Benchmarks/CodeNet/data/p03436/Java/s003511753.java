import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] s = new String[W];
        for (int i = 0; i < H; i++) {
            s[i] = sc.next();
        }

        // 幅優先探索
        ArrayDeque<Map<Point, Integer>> queue = new ArrayDeque<>();
        addQueue(queue, 0, 0, 1);

        int shortestCnt = -1;
        boolean[][] pathed = new boolean[H][W];

        loop:
        while (!queue.isEmpty()) {
            for (Map.Entry entry : queue.poll().entrySet()) {
                Point point = (Point) entry.getKey();
                int cnt = (int) entry.getValue();

                pathed[point.x][point.y] = true;

                if (point.x == H - 1 && point.y == W - 1) {
                    shortestCnt = cnt;
                    break loop;
                }

                if (point.x + 1 < H && s[point.x + 1].charAt(point.y) != '#'
                        && !pathed[point.x + 1][point.y]) {
                    addQueue(queue, point.x + 1, point.y, cnt + 1);
                }

                if (point.x - 1 >= 0 && s[point.x - 1].charAt(point.y) != '#'
                        && !pathed[point.x - 1][point.y]) {
                    addQueue(queue, point.x - 1, point.y, cnt + 1);
                }

                if (point.y + 1 < W && s[point.x].charAt(point.y + 1) != '#'
                        && !pathed[point.x][point.y + 1]) {
                    addQueue(queue, point.x, point.y + 1, cnt + 1);
                }

                if (point.y - 1 >= 0 && s[point.x].charAt(point.y - 1) != '#'
                        && !pathed[point.x][point.y - 1]) {
                    addQueue(queue, point.x, point.y - 1, cnt + 1);
                }
            }
        }

        if (shortestCnt == -1) {
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
            out.println(W * H - black - shortestCnt);
        }
    }

    static void addQueue(ArrayDeque<Map<Point, Integer>> queue, int x, int y, int cnt) {
        queue.add(new HashMap<Point, Integer>() {
            {
                put(new Point(x, y), cnt);
            }
        });
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}