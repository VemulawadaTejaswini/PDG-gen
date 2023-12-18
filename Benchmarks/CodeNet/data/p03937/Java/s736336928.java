import java.util.Scanner;

public class Main {

	static char[][] A;
	static final int[] dx = { 1, 0 };
	static final int[] dy = { 0, 1 };
	static int H;
	static int W;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		W = in.nextInt();
		A = new char[H][W];
		int countS = 0;
		for (int i = 0; i < H; i++) {
			A[i] = in.next().toCharArray();
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] == '#') {
					countS++;
				}
			}
		}
		boolean[][] seen = new boolean[H][W];
		dfs(0, 0, seen);
		int count = 0;
		for (int i = 0; i < seen.length; i++) {
			for (int j = 0; j < seen[i].length; j++) {
				if (seen[i][j] == true) {
					count++;
				}
			}
		}
		System.out.println(countS == count ? "Possible" : "Impossible");
		in.close();
	}

	static void dfs(int h, int w, boolean[][] seen) {
		seen[h][w] = true;
		if (w - 1 >= 0 && seen[h][w - 1] == false && A[h][w - 1] == '#') {
			return;
		}
		if (h - 1 >= 0 && seen[h - 1][w] == false && A[h - 1][w] == '#') {
			return;
		}
		if ((h + 1 < H && A[h + 1][w] == '#') && (w + 1 < W && A[h][w + 1] == '#')) {
			return;
		}
		for (int i = 0; i < 2; i++) {
			int nh = h + dx[i];
			int nw = w + dy[i];
			if (nh >= H || nw >= W)
				continue;
			if (A[nh][nw] == '.')
				continue;
			if (seen[nh][nw] == true)
				continue;
			// 再帰的に探索
			dfs(nh, nw, seen);
		}
	}
}