import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int map[][] = new int[h][w];
        int white = 0;
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                if (str.charAt(j) == '#') {
                    map[i][j] = -1;
                } else {
                    white++;
                }
            }
        }

        int minTern = solveMaze(h, w, map);
        System.out.println(minTern != -1 ? white - minTern : minTern);
    }

    private int solveMaze(int h, int w, int map[][]) {
        int dx[] = { 1, 0, -1, 0 };
        int dy[] = { 0, 1, 0, -1 };
        Queue<Point> queue = new ArrayDeque<>();

        map[0][0] = 1;
        queue.add(new Point(0, 0));

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int now = map[p.y][p.x];
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (nx < 0 || nx >= w || ny < 0 || ny >= h || map[ny][nx] != 0) {
                    continue;
                }

                map[ny][nx] = now + 1;
                if ((nx == w - 1) && (ny == h - 1)) {
                    queue.clear();
                    return map[ny][nx];
                }
                queue.add(new Point(nx, ny));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
