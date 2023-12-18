
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int st, sx, sy, et, ex, ey;
		et = 0;
		ex = 0;
		ey = 0;

		ans[0][100][100] = 1;

		for (int i = 0; i < n; i++) {
			st = et;
			sx = ex;
			sy = ey;

			et = sc.nextInt();
			ex = sc.nextInt();
			ey = sc.nextInt();

			if (!can(et - st, ex - sx, ey - sy)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	public static int[][][] ans = new int[100][200][200];

	public static boolean can(int t, int x, int y) {
		if (t == 0) {
			if (x == 0 && y == 0) {
				return true;
			} else {
				return false;
			}
		}
		if (!(t < 100 && Math.abs(x) < 100 && Math.abs(y) < 100)) {
			return can(t - 1, x - 1, y) || can(t - 1, x + 1, y) || can(t - 1, x, y - 1) || can(t - 1, x, y + 1);
		}
		if (ans[t][x + 100][y + 100] == 1) {
			return true;
		} else if (ans[t][x + 100][y + 100] == 2) {
			return false;
		} else {
			boolean b = can(t - 1, x - 1, y) || can(t - 1, x + 1, y) || can(t - 1, x, y - 1) || can(t - 1, x, y + 1);
			if (b) {
				ans[t][x + 100][y + 100] = 1;
			} else {
				ans[t][x + 100][y + 100] = 2;
			}
			return b;
		}
	}
}
