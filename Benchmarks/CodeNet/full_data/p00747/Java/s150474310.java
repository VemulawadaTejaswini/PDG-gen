import java.awt.Point;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	final int INF = 1 << 29;
	Scanner sc = new Scanner(System.in);
	int dx[] = { 0, 1, 0, -1 };
	int dy[] = { 1, 0, -1, 0 };

	void run() {
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			boolean wall[][] = new boolean[2 * h][w];
			if ((w | h) == 0)
				break;
			for (int i = 0; i < 2 * h - 1; i++) {
				for (int j = 0; j < (i % 2 == 0 ? w - 1 : w); j++) {
					wall[i][j] = sc.nextInt() == 1;
				}
			}
			Queue<Point> q = new LinkedList<Point>();
			int visited[][] = new int[h][w];
			for (int i = 0; i < h; i++) {
				Arrays.fill(visited[i], -1);
			}
			visited[0][0] = 1;
			q.add(new Point(0, 0));
			boolean goal = false;
			while (!q.isEmpty()) {
				Point p = q.poll();
				int x = p.x;
				int y = p.y;
				// System.out.println(x+" "+y);
				if (x == w - 1 && y == h - 1) {
					goal = true;
					break;
				}

				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx < 0 || ny < 0 || nx >= w || ny >= h)
						continue;
					if (y == ny && wall[y * 2][(x + nx) / 2]) {
						continue;
					}
					if (x == nx && wall[y + ny][x]) {
						continue;
					}
					if (visited[ny][nx] != -1) {
						continue;
					}
					visited[ny][nx] = visited[y][x] + 1;
					q.add(new Point(nx, ny));
				}
			}
			if (goal) {
				System.out.println(visited[h - 1][w - 1]);
			} else {
				System.out.println(0);
			}
		}

	}

	public static void main(String[] args) {
		new Main().run();

	}
}