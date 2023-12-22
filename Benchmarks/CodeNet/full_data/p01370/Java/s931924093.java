import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DX = { 1, 1, 0, -1, -1, 0 };
	static int[] DY = { 1, 0, -1, -1, 0, 1 };

	public static void main(String[] arg) {
		while (true) {
			int T = sc.nextInt();
			if (T == 0) break;
			int N = sc.nextInt();
			boolean[][] visited = new boolean[201][201];
			for (int i = 0; i < N; ++i) {
				int x = sc.nextInt() + 100;
				int y = sc.nextInt() + 100;
				visited[x][y] = true;
			}
			ArrayList<Point> ps = new ArrayList<Point>();
			int sx = sc.nextInt() + 100;
			int sy = sc.nextInt() + 100;
			visited[sx][sy] = true;
			ps.add(new Point(sx, sy));
			int ans = 1;
			for (int i = 0; i < T; ++i) {
				ArrayList<Point> next = new ArrayList<Point>();
				for (Point p : ps) {
					for (int j = 0; j < 6; ++j) {
						int nx = p.x + DX[j];
						int ny = p.y + DY[j];
						if (!visited[nx][ny]) {
							visited[nx][ny] = true;
							next.add(new Point(nx, ny));
						}
					}
				}
				ans += next.size();
				ps = next;
			}
			System.out.println(ans);
		}
	}

}