import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int W, H;
	static char[][] map;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		while (true) {
			W = sc.nextInt();
			H = sc.nextInt();
			if (W == 0) break;
			map = new char[H][];
			for (int i = 0; i < H; ++i) {
				map[i] = sc.next().toCharArray();
			}
			System.out.println(solve());
		}
	}

	static int solve() {
		ArrayList<Point> pos = new ArrayList<>();
		int sr = 0;
		int sc = 0;
		int[][] idx = new int[H][W];
		for (int[] a : idx) {
			Arrays.fill(a, -1);
		}
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (map[i][j] == 'o') {
					sr = i;
					sc = j;
					idx[i][j] = 0;
				} else if (map[i][j] == '*') {
					pos.add(new Point(i, j));
					idx[i][j] = pos.size();
				}
			}
		}
		int c = pos.size() + 1;
		int[][] dist = new int[c][c];
		calc(sr, sc, 0, idx, dist);
		for (int i = 0; i < c - 1; ++i) {
			calc(pos.get(i).x, pos.get(i).y, i + 1, idx, dist);
		}
		for (int i = 0; i < c; ++i) {
			for (int j = 0; j < i; ++j) {
				if (dist[i][j] == 0) return -1;
			}
		}

		int[][] dp = new int[1 << c][c];
		for (int[] a : dp) {
			Arrays.fill(a, 1 << 30);
		}
		dp[1][0] = 0;
		for (int i = 1; i < (1 << c); ++i) {
			for (int j = 0; j < c; ++j) {
				if ((i & (1 << j)) == 0) continue;
				for (int k = 0; k < c; ++k) {
					if ((i & (1 << k)) != 0) continue;
					dp[i + (1 << k)][k] = Math.min(dp[i + (1 << k)][k], dp[i][j] + dist[j][k]);
				}
			}
		}
		int ans = 1 << 30;
		for (int i = 1; i < c; ++i) {
			ans = Math.min(ans, dp[(1 << c) - 1][i]);
		}
		return ans;
	}

	static void calc(int sr, int sc, int si, int[][] idx, int[][] dist) {
		boolean[][] visited = new boolean[H][W];
		ArrayList<Point> cur = new ArrayList<>();
		cur.add(new Point(sr, sc));
		visited[sr][sc] = true;
		for (int i = 1; !cur.isEmpty(); ++i) {
			ArrayList<Point> next = new ArrayList<>();
			for (Point p : cur) {
				for (int j = 0; j < 4; ++j) {
					int nr = p.x + DR[j];
					int nc = p.y + DC[j];
					if (nr < 0 || H <= nr || nc < 0 || W <= nc || visited[nr][nc]) continue;
					if (map[nr][nc] == 'x') continue;
					visited[nr][nc] = true;
					if (idx[nr][nc] >= 0) {
						dist[si][idx[nr][nc]] = dist[idx[nr][nc]][si] = i;
					}
					next.add(new Point(nr, nc));
				}
			}
			cur = next;
		}
	}

}