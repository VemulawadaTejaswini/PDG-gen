import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] a = new String[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().split("");
        }
        Deque<Point> queue = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ("#".equals(a[i][j])) {
                    queue.add(new Point(i, j));
                }
            }
        }
        int cnt = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                Point p = queue.poll();
                int posx = p.x;
                int posy = p.y;
                final int[][] DXDY = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
                for (int j = 0; j < DXDY.length; j++) {
                    int x = posx + DXDY[j][0];
                    int y = posy + DXDY[j][1];
                    if (x < 0 || x >= h || y < 0 || y >= w || "#".equals(a[x][y])) {
                        continue;
                    }
                    a[x][y] = "#";
                    queue.add(new Point(x, y));
                }
            }
        }
        System.out.println(cnt);
    }
}
