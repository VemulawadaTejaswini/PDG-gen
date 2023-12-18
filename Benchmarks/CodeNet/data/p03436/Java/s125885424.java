import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    private static int[][] DXDY = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().split("");
        }
        long black = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ("#".equals(s[i][j])) {
                    black++;
                }
            }
        }
        boolean[][] visited = new boolean[h][w];
        long dis = 1;
        Deque<Point> queue = new ArrayDeque<>();
        queue.add(new Point(0, 0));
        while (!queue.isEmpty()) {
            int size = queue.size();
            dis++;
            for (int i = 0; i < size; i++) {
                Point p = queue.poll();
                int posx = p.x;
                int posy = p.y;
                visited[posx][posy] = true;
                for (int j = 0; j < DXDY.length; j++) {
                    int x = posx + DXDY[j][0];
                    int y = posy + DXDY[j][1];
                    if (x == h - 1 && y == w - 1) {
                        System.out.println(w * h - black - dis);
                        return;
                    }
                    if (x < 0 || x >= s.length || y < 0 || y >= s[0].length || "#".equals(s[x][y]) || visited[x][y]) {
                        continue;
                    }
                    queue.add(new Point(x, y));
                }
            }
        }
        System.out.println(-1);
    }

}
