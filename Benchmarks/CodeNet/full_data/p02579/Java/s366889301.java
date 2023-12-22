import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int sh = scan.nextInt()-1;
        int sw = scan.nextInt()-1;
        int gh = scan.nextInt()-1;
        int gw = scan.nextInt()-1;
        boolean[][] map = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            char[] d = scan.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if (d[j] == '.') {
                    map[i][j] = true;
                } else {
                    map[i][j] = false;
                }
            }
        }
        long[][] ans = new long[H][W];
        for (int i = 0; i < H; i++) {
            Arrays.fill(ans[i], Long.MAX_VALUE);
        }
        PriorityQueue<Position> queue = new PriorityQueue<>(new PositionComparator());
        ans[sh][sw] = 0;
        queue.add(new Position(sw, sh, 0));
        int[][] move = new int[4][2];
        move[0][0] = -1;
        move[0][1] = 0;
        move[1][0] = 1;
        move[1][1] = 0;
        move[2][0] = 0;
        move[2][1] = -1;
        move[3][0] = 0;
        move[3][1] = 1;
        while(!queue.isEmpty()) {
            Position p = queue.poll();
            for (int i = 0; i < 4; i++) {
                if (p.x + move[i][0] < 0 || W <= p.x + move[i][0]) {
                    continue;
                }
                if (p.y + move[i][1] < 0 || H <= p.y + move[i][1]) {
                    continue;
                }
                if (!map[p.y + move[i][1]][p.x + move[i][0]]) {
                    continue;
                }
                if (ans[p.y][p.x] < ans[p.y + move[i][1]][p.x + move[i][0]]) {
                    ans[p.y + move[i][1]][p.x + move[i][0]] = ans[p.y][p.x];
                    queue.add(new Position(p.x + move[i][0], p.y + move[i][1], ans[p.y][p.x]));
                }
            }
            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    if (p.x + i < 0 || W <= p.x + i) {
                        continue;
                    }
                    if (p.y + j < 0 || H <= p.y + j) {
                        continue;
                    }
                    if (!map[p.y + j][p.x + i]) {
                        continue;
                    }
                    if (ans[p.y][p.x] == Long.MAX_VALUE) {
                        continue;
                    }
                    if (ans[p.y][p.x] + 1 < ans[p.y + j][p.x + i]) {
                        ans[p.y + j][p.x + i] = ans[p.y][p.x] + 1;
                        queue.add(new Position(p.x + i, p.y + j, ans[p.y][p.x] + 1));
                    }
                }
            }
        }
        if (ans[gh][gw] == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans[gh][gw]);
        }
    }
    class Position {
        int x;
        int y;
        long distance;
        Position(int x, int y, long distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    class PositionComparator implements Comparator<Position> {
        @Override
        public int compare(Position o1, Position o2) {
            if (o1.distance != o2.distance) {
                return Long.compare(o1.distance, o2.distance);
            }
            if (o1.x != o2.x) {
                return Long.compare(o1.x, o2.x);
            }
            return Long.compare(o1.y, o2.y);
        }
    }
}
