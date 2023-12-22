import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, -1, 0, 1 };
	static int R, C, M;
	static boolean[][] f;
	static int[][] m1, m2, m3, time;
	static int[] tr, tc;
	static int curTime, total;

	public static void main(String[] args) {
		R = sc.nextInt();
		C = sc.nextInt();
		M = sc.nextInt();
		f = new boolean[R][C];
		m1 = new int[R][C];
		m2 = new int[R][C];
		m3 = new int[R][C];
		time = new int[R][C];
		for (int i = 0; i < R; ++i) {
			char[] line = sc.next().toCharArray();
			for (int j = 0; j < C; ++j) {
				f[i][j] = line[j] == '.';
			}
			Arrays.fill(time[i], -1);
		}
		tr = new int[M];
		tc = new int[M];
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				m1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				m2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				m3[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < M; ++i) {
			tr[i] = sc.nextInt();
			tc[i] = sc.nextInt();
		}
		time[tr[0]][tc[0]] = 0;
		total += m2[tr[0]][tc[0]];
		for (int i = 0; i < M - 1; ++i) {
			move(tr[i], tc[i], tr[i + 1], tc[i + 1]);
		}
		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < C; ++j) {
				if (time[i][j] != -1) {
					total += m3[i][j];
				}
			}
		}
		System.out.println(total);
	}

	static void move(int fr, int fc, int tr, int tc) {
		ArrayList<Integer> path = new ArrayList<Integer>();
		for (int i = 0; i < 4; ++i) {
			int nr = fr + DR[i];
			int nc = fc + DC[i];
			if (nr < 0 || R <= nr || nc < 0 || C <= nc || !f[nr][nc]) continue;
			path.add((nr << 10) + nc);
			if (dfs(i, nr, nc, tr, tc, path)) {
				return;
			}
			path.remove(path.size() - 1);
		}
	}

	static boolean dfs(int dir, int cr, int cc, int tr, int tc, ArrayList<Integer> path) {
		if (cr == tr && cc == tc) {
			for (int i = 0; i < path.size(); ++i) {
				int pr = path.get(i) >> 10;
				int pc = path.get(i) & 0xFF;
				int nowTime = curTime + i + 1;
				if (time[pr][pc] == -1) {
					total += m2[pr][pc];
				} else {
					int onOff = m2[pr][pc] + m3[pr][pc];
					int keep = m1[pr][pc] * (nowTime - time[pr][pc]);
					total += Math.min(onOff, keep);
				}
				time[pr][pc] = nowTime;
			}
			curTime += path.size();
			return true;
		}
		for (int i = 0; i < 4; ++i) {
			if (i == ((dir + 2) & 3)) continue;
			int nr = cr + DR[i];
			int nc = cc + DC[i];
			if (nr < 0 || R <= nr || nc < 0 || C <= nc || !f[nr][nc]) continue;
			path.add((nr << 10) + nc);
			if (dfs(i, nr, nc, tr, tc, path)) {
				return true;
			}
			path.remove(path.size() - 1);
		}
		return false;
	}
}