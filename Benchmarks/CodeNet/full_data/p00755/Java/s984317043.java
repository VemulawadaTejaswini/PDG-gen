import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[] dx = { 1, 0, -1, 0 };
	int[] dy = { 0, 1, 0, -1 };
	int H, W, C;
	int[][] map;
	int[][] field;
	boolean visit[][];
	int max, cnt;

	void run() {
		for (;;) {
			H = sc.nextInt();
			W = sc.nextInt();
			C = sc.nextInt();
			if ((H | W | C) == 0) {
				return;
			}
			map = new int[H][W];
			field = new int[H][W];
			max = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int[] parm = new int[5];
			makePerm(0, parm);
			System.out.println(max);
		}
	}

	void makePerm(int n, int[] parm) {
		if (n == 4) {
			parm[n] = C;
			solve(parm);
			return;
		}
		for (int i = 1; i <= 6; i++) {
			if (n == 3 && i == C) {
				continue;
			}
			parm[n] = i;
			makePerm(n + 1, parm);
		}
	}

	void solve(int parm[]) {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				field[i][j] = map[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			visit = new boolean[H][W];
			int first = field[0][0];
			dfs(parm[i], first, visit, 0, 0);
		}
		visit = new boolean[H][W];
		if (field[0][0] == C && !visit[0][0]) {
			cnt = 1;
			cntMap(field, visit, 0, 0);
			max = Math.max(max, cnt);
		}
	}

	void dfs(int num, int first, boolean[][] visit, int h, int w) {
		field[h][w] = num;
		visit[h][w] = true;
		for (int i = 0; i < 4; i++) {
			int nh = h + dy[i];
			int nw = w + dx[i];
			if (nh >= 0 && nh < H && nw >= 0 && nw < W && !visit[nh][nw]
					&& field[nh][nw] == first) {
				dfs(num, first, visit, nh, nw);
			}
		}
	}

	void cntMap(int[][] field, boolean[][] visitf, int h, int w) {
		visit[h][w] = true;
		for (int i = 0; i < 4; i++) {
			int nh = h + dy[i];
			int nw = w + dx[i];
			if (nh >= 0 && nh < H && nw >= 0 && nw < W && !visit[nh][nw]
					&& field[nh][nw] == C) {
				cnt++;
				cntMap(field, visit, nh, nw);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}