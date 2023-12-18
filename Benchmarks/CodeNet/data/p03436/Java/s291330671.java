import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		String[][] s = new String[h][w];
		int count = 0;
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().split("");
			for (int j = 0; j < w; j++)
				if (s[i][j].equals(".")) count++;
		}
		int ans = bfs(s, h, w);
		if (ans != -1)
			ans = count - ans;
		System.out.println(ans);
	}

	public static int bfs(String[][] s, int h, int w) {
		int[][] d = new int[h][w];
		for (int i = 0; i < h; i++)
			Arrays.fill(d[i], -1);
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		int sx = 0, sy = 0, gx = h - 1, gy = w - 1;
		Deque<Point> p = new ArrayDeque<Point>();
		p.push(new Point(sx, sy));
		d[sx][sy] = 1;
		while (!p.isEmpty()) {
			Point q = p.pop();
			int x = q.x;
			int y = q.y;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || h <= nx || ny < 0 || w <= ny || s[nx][ny].equals("#"))
					continue;
				if (d[nx][ny] != -1)
					continue;
				d[nx][ny] = d[x][y] + 1;
				p.push(new Point(nx, ny));
			}
		}
		return d[gx][gy];
	}

	public static class Point {
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}