import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int t = sc.nextInt();
            int n = sc.nextInt();
            if ((t | n) == 0)
                break;
            int[][] map = new int[61][61];
            boolean[][] visited = new boolean[61][61];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y + 30][x + 30] = -1;
            }
            Queue<Point> q = new LinkedList<Point>();
            int sx = sc.nextInt() + 30;
            int ans = 0;
            int sy = sc.nextInt() + 30;
            q.add(new Point(sx, sy));
            visited[sy][sx] = true;
            while (!q.isEmpty()) {
                Point p = q.poll();
                int x = p.x;
                int y = p.y;
                if (map[y][x] > t)
                    continue;
                ans++;
                int dx[] = { 0, 1, 1, 0, -1, -1 };
                int dy[] = { 1, 1, 0, -1, -1, 0 };
                for (int i = 0; i < 6; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 0 && ny >= 0 && ny < 61 && nx < 61
                            && map[ny][nx] != -1) {
                        if (visited[ny][nx]) {
                            continue;
                        }
                        visited[ny][nx] = true;
                        map[ny][nx] = map[y][x] + 1;
                        q.add(new Point(nx, ny));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}