import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, -1, 0, 1 };
	static int W, H, ans;
	static int[][] f;

	public static void main(String[] args) {
		while (true) {
			W = sc.nextInt();
			H = sc.nextInt();
			if (H == 0) break;
			f = new int[H][W];
			int startR = 0;
			int startC = 0;
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					int cell = sc.nextInt();
					if (cell == 2) {
						startR = i;
						startC = j;
						cell = 0;
					}
					f[i][j] = cell;
				}
			}
			ans = 11;
			dfs(startR, startC, 0);
			System.out.println(ans == 11 ? -1 : ans);
		}
	}

	static void dfs(int cr, int cc, int depth) {
		if (depth == 10 || depth >= ans) return;
		for (int i = 0; i < 4; ++i) {
			int nr = cr + DR[i];
			int nc = cc + DC[i];
			if (!inside(nr, nc)) continue;
			if (f[nr][nc] == 1) continue;
			while (true) {
				if (f[nr][nc] == 3) {
					ans = depth + 1;
					return;
				}
				nr += DR[i];
				nc += DC[i];
				if (!inside(nr, nc)) break;
				if (f[nr][nc] == 1) {
					f[nr][nc] = 0;
					dfs(nr - DR[i], nc - DC[i], depth + 1);
					f[nr][nc] = 1;
					break;
				}
			}
		}
	}

	static boolean inside(int r, int c) {
		return 0 <= r && r < H && 0 <= c && c < W;
	}

}