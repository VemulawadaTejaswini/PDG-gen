import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DX1 = new int[] { -1, 1, 0, 1, 0, 1 };
	static int[] DX2 = new int[] { -1, 1, 0, -1, 0, -1 };
	static int[] DY = new int[] { 0, 0, 1, 1, -1, -1 };

	public static void main(String[] args) {
		int W = sc.nextInt();
		int H = sc.nextInt();
		boolean[][] m = new boolean[H + 2][W + 2];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				m[i + 1][j + 1] = sc.next().charAt(0) == '1';
			}
		}
		int ans = 0;
		Queue<Point> q = new ArrayDeque<Point>();
		q.add(new Point(0, 0));
		boolean[][] visited = new boolean[H + 2][W + 2];
		while (!q.isEmpty()) {
			Point p = q.poll();
			int[] DX = p.y % 2 != 0 ? DX1 : DX2;
			for (int i = 0; i < 6; ++i) {
				int nx = p.x + DX[i];
				int ny = p.y + DY[i];
				if (nx < 0 || W + 1 < nx || ny < 0 || H + 1 < ny || visited[ny][nx]) continue;
				if (m[ny][nx]) {
					++ans;
					continue;
				}
				q.add(new Point(nx, ny));
				visited[ny][nx] = true;
			}
		}
		System.out.println(ans);
	}
}