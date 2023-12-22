
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    private static class Point {
        public int x, y;

        Point() {
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void getInfo() {
            System.out.println(x + "," + y);
        }

    }

    private static char[][] map;
    private static int[][] d;
    private static int row;
    private static int col;
    private static final Scanner SC = new Scanner(System.in);
    private static final int[] DX = {0, 0, -1, 1};
    private static final int[] DY = {-1, 1, 0, 0};

    public static void main(String[] args) {
        row = SC.nextInt();
        col = SC.nextInt();
        int fNum = SC.nextInt();
        Point[] factories = new Point[fNum + 1];
        SC.nextLine();
        map = new char[row][];
        d = new int[row][col];
        for (int i = 0; i < row; i++) {
            map[i] = SC.nextLine().toCharArray();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int f = 1; f <= fNum; f++) {
                    if (map[i][j] == '0' + f) {
                        factories[f] = new Point(i, j);
                    }
                }
                if (map[i][j] == 'S') {

                    factories[0] = new Point(i, j);
                }

            }
        }
//        for (int i = 0; i <= fNum; i++) {
//            factories[i].getInfo();
//        }
        int ans = 0;
        for (int i = 1; i <= fNum; i++) {
            ans += bfs(factories[i - 1].x, factories[i - 1].y, factories[i].x, factories[i].y);
        }
        System.out.println(ans);
    }

    public static int bfs(int sx, int sy, int ex, int ey) {
        Queue<Point> q = new LinkedList<Point>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                d[i][j] = -1;
            }
        }
        q.add(new Point(sx, sy));
        d[sx][sy] = 0;
        while (!q.isEmpty()) {
            Point cur = q.poll();
            if (cur.x == ex && cur.y == ey) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int tr = cur.x + DX[i];
                int tc = cur.y + DY[i];
                if (0 <= tr && tr < row && 0 <= tc && tc < col && d[tr][tc] == -1 && map[tr][tc] != 'X') {
                    d[tr][tc] = d[cur.x][cur.y] + 1;
                    q.add(new Point(tr, tc));
                }

            }
        }
//        System.out.println("[" + sx + "," + sy + "] to [" + ex + "," + ey + "] is " + d[ex][ey]);
        return d[ex][ey];
    }
}

