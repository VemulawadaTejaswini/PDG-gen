import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		while (true) {
			int W = sc.nextInt();
			if (W == 0) break;
			int H = sc.nextInt();
			boolean[][] f = new boolean[H + 2][W + 2];
			ArrayList<Point> ps = new ArrayList<Point>();
			for (int i = 0; i < H; ++i) {
				char[] line = sc.next().toCharArray();
				for (int j = 0; j < W; ++j) {
					if (line[j] == '@') {
						ps.add(new Point(i + 1, j + 1));
					} else if (line[j] == '.') {
						f[i + 1][j + 1] = true;
					}
				}
			}
			int ans = 1;
			while (!ps.isEmpty()) {
				ArrayList<Point> next = new ArrayList<Point>();
				for (Point p : ps) {
					for (int i = 0; i < 4; ++i) {
						int nr = p.x + DR[i];
						int nc = p.y + DC[i];
						if (f[nr][nc]) {
							++ans;
							f[nr][nc] = false;
							next.add(new Point(nr, nc));
						}
					}
				}
				ps = next;
			}
			System.out.println(ans);
		}
	}
}