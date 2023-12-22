import java.awt.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static int cnt = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int ch = Integer.parseInt(sc.next());
        int cw = Integer.parseInt(sc.next());
        int dh = Integer.parseInt(sc.next());
        int dw = Integer.parseInt(sc.next());
        char[][] hw = new char[h + 2][w + 2];
        Deque<Point> dq = new ArrayDeque<>();
        boolean[][] isReached = new boolean[h + 2][w + 2];
        int[][] d = new int[h + 2][w + 2];
        for (int[] dd : d) {
            Arrays.fill(dd, Integer.MAX_VALUE);
        }
        d[ch][cw] = 0;
//        dq.add(new Point(cw, ch));
        for (char[] a : hw) {
            Arrays.fill(a, '#');
        }
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                hw[i + 1][j + 1] = s.charAt(j);
            }
        }
//        bfs(hw, d, dw, dh, dq, 0, h, w);
        hw[dh][dw] = 'g';
        if (dfs(0, cw, ch, h, w, hw, isReached, dq)) {
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean dfs(int jump, int x, int y, int h, int w, char[][] hw, boolean[][] isReached, Deque<Point> dq) {
        if (hw[y][x] == '#') {
            if (y - 1 >= 1 && !isReached[y - 1][x] && (hw[y - 1][x] == '.' || hw[y - 1][x] == 'g')) {
                dq.addFirst(new Point(x, y - 1));
            }
            if (y + 1 <= h && !isReached[y + 1][x] && (hw[y + 1][x] == '.' || hw[y + 1][x] == 'g')) {
                dq.addFirst(new Point(x, y + 1));
            }
            if (x - 1 >= 1 && !isReached[y][x - 1] && (hw[y][x - 1] == '.' || hw[y][x - 1] == 'g')) {
                dq.addFirst(new Point(x - 1, y));
            }
            if (x + 1 <= w && !isReached[y][x + 1] && (hw[y][x + 1] == '.' || hw[y][x + 1] == 'g')) {
                dq.addFirst(new Point(x + 1, y));
            }
            if (y - 1 >= 1 && x - 1 >= 1 && !isReached[y - 1][x - 1] && (hw[y - 1][x - 1] == '.' || hw[y - 1][x - 1] == 'g')) {
                dq.addFirst(new Point(x - 1, y - 1));
            }
            if (y - 1 >= 1 && x + 1 <= w && !isReached[y - 1][x + 1] && (hw[y - 1][x + 1] == '.' || hw[y - 1][x + 1] == 'g')) {
                dq.addFirst(new Point(x + 1, y - 1));
            }
            if (y + 1 <= h && x - 1 >= 1 && !isReached[y + 1][x - 1] && (hw[y + 1][x - 1] == '.' || hw[y + 1][x - 1] == 'g')) {
                dq.addFirst(new Point(x - 1, y + 1));
            }
            if (y + 1 <= h && x + 1 <= w && !isReached[y + 1][x + 1] && (hw[y + 1][x + 1] == '.' || hw[y + 1][x + 1] == 'g')) {
                dq.addFirst(new Point(x + 1, y + 1));
            }
            return false;
        }
        if (isReached[y][x]) {
            return false;
        }
        if (hw[y][x] == 'g') {
            cnt = Math.min(cnt, jump);
            return true;
        }
        isReached[y][x] = true;
        if (dfs(jump, x + 1, y, h, w, hw, isReached, dq)) {
            return true;
        }
        if (dfs(jump, x - 1, y, h, w, hw, isReached, dq)) {
            return true;
        }
        if (dfs(jump, x, y + 1, h, w, hw, isReached, dq)) {
            return true;
        }
        if (dfs(jump, x, y - 1, h, w, hw, isReached, dq)) {
            return true;
        }
        if (!dq.isEmpty()) {
            Point p = dq.pollLast();
            if (dfs(jump + 1, p.x, p.y, h, w, hw, isReached, dq)) {
                return true;
            }
        }
        isReached[y][x] = false;
        return false;
    }

    private static int bfs(char[][] hw, int[][] d, int gx, int gy, Deque<Point> dq, int jump, int h, int w) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        while (dq.size() > 0) {
            Point p = dq.pollLast();
            if (p.x == gx && p.y == gy) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int x = p.x + dx[i];
                int y = p.y + dy[i];
                if (hw[y][x] != '#' && d[y][x] == Integer.MAX_VALUE) {
                    dq.addFirst(new Point(x, y));
                    d[y][x] = Math.min(d[y][x], d[p.y][p.x] + 1);
                } else if (hw[y][x] == '#') {
                    if (y - 1 >= 1 && (hw[y - 1][x] == '.' || hw[y - 1][x] == 'g')) {
                        dq.addFirst(new Point(x, y - 1));
                    }
                    if (y + 1 <= h && (hw[y + 1][x] == '.' || hw[y + 1][x] == 'g')) {
                        dq.addFirst(new Point(x, y + 1));
                    }
                    if (x - 1 >= 1 && (hw[y][x - 1] == '.' || hw[y][x - 1] == 'g')) {
                        dq.addFirst(new Point(x - 1, y));
                    }
                    if (x + 1 <= w && (hw[y][x + 1] == '.' || hw[y][x + 1] == 'g')) {
                        dq.addFirst(new Point(x + 1, y));
                    }
                    if (y - 1 >= 1 && (hw[y - 1][x - 1] == '.' || hw[y - 1][x - 1] == 'g')) {
                        dq.addFirst(new Point(x - 1, y - 1));
                    }
                    if (y - 1 >= 1 && (hw[y - 1][x + 1] == '.' || hw[y - 1][x + 1] == 'g')) {
                        dq.addFirst(new Point(x + 1, y - 1));
                    }
                    if (y + 1 <= h && (hw[y + 1][x - 1] == '.' || hw[y + 1][x - 1] == 'g')) {
                        dq.addFirst(new Point(x - 1, y + 1));
                    }
                    if (y + 1 <= h && (hw[y + 1][x + 1] == '.' || hw[y + 1][x + 1] == 'g')) {
                        dq.addFirst(new Point(x + 1, y + 1));
                    }
                }
            }
        }
        return d[gy][gx];
    }
}