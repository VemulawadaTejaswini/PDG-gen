import java.awt.Point;
import java.util.Scanner;

public class Main {
	static char[][] map;

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			map = new char[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				String line = sc.next();
				for (int j = 0; j < n; j++) {
					map[i][j] = line.charAt(j);
				}
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Point p = new Point(j, i);
					if (wh(p) > max)
						max = Math.max(max, ss(1, p, p));
				}
			}
			System.out.println(max);
		}
	}

	public static int ss(int n, Point a, Point b) {
		for (int i = 0; i < n; i++) {
			if (map[a.y + i][a.x] != '.' || map[b.y][b.x + i] != '.') {
				return n - 1;
			}
		}
		return ss(n + 1, new Point(a.x + 1, a.y), new Point(b.x, b.y + 1));
	}

	public static int wh(Point a) {
		int x = a.x;
		int y = a.y;
		int w = 0;
		int h = 0;
		while (true) {
			if (map[y][x++] != '.')
				break;
			w++;
		}
		x = a.x;
		while (true) {
			if (map[y++][x] != '.')
				break;
			h++;
		}
		return Math.min(h, w);
	}
}