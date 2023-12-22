import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static final int[] dx = { -1, 0, 0, 1 };
	static final int[] dy = { 0, -1, 1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();

		char[][] block = new char[h][w];
		Point[] point = new Point[n + 1];

		for (int y = 0; y < h; y++) {
			String s = sc.next();
			for (int x = 0; x < w; x++) {
				char c = s.charAt(x);
				if (c == 'S') {
					point[0] = new Point(x, y);
				} else if ('1' <= c && c <= '9') {
					point[c - '0'] = new Point(x, y);
				}
				block[y][x] = c;
			}
		}

		sc.close();

		int total = 0;
		int[][] time = new int[h][w];
		Deque<Point> q = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					time[y][x] = 0;
				}
			}
			q.clear();
			q.offer(point[i]);
			while (!q.isEmpty()) {
				Point p = q.poll();
				if (p.equals(point[i + 1])) {
					total += time[p.y][p.x];
					break;
				}
				for (int j = 0; j < 4; j++) {
					int _x = p.x + dx[j];
					int _y = p.y + dy[j];
					if (((0 <= _y && _y < h) && (0 <= _x && _x < w)) && time[_y][_x] == 0 && block[_y][_x] != 'X') {
						time[_y][_x] = time[p.y][p.x] + 1;
						q.offer(new Point(_x, _y));
					}
				}
			}
		}

		System.out.println(total);
	}
}