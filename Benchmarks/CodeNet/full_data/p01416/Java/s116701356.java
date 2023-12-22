import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[][] f;;

	public static void main(String[] arg) {
		int M = sc.nextInt();
		int N = sc.nextInt();
		f = new char[M][N];
		for (int i = 0; i < M; ++i) {
			f[i] = sc.next().toCharArray();
		}
		int[][] r = new int[26][2];
		int[][] c = new int[26][2];
		for (int i = 0; i < 26; ++i) {
			r[i][0] = r[i][1] = c[i][0] = c[i][1] = -1;
		}
		boolean[] used = new boolean[26];
		Arrays.fill(used, true);
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				if (f[i][j] == '.') continue;
				int ch = f[i][j] - 'A';
				used[ch] = false;
				if (r[ch][0] >= 0) {
					r[ch][1] = i;
					c[ch][1] = j;
				} else {
					r[ch][0] = i;
					c[ch][0] = j;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < 26; ++i) {
			for (int j = 0; j < 26; ++j) {
				if (used[j]) continue;
				if (remove(r[j][0], c[j][0], r[j][1], c[j][1])) {
					ans += 2;
					used[j] = true;
					f[r[j][0]][c[j][0]] = '.';
					f[r[j][1]][c[j][1]] = '.';
				}
			}
		}
		System.out.println(ans);
	}

	static boolean remove(int r1, int c1, int r2, int c2) {
		if (r1 == r2) {
			if (Math.abs(c1 - c2) <= 1) return false;
			for (int i = Math.min(c1, c2) + 1; i < Math.max(c1, c2); ++i) {
				if (f[r1][i] != '.') return false;
			}
			return true;
		} else if (c1 == c2) {
			if (Math.abs(r1 - r2) <= 1) return false;
			for (int i = Math.min(r1, r2) + 1; i < Math.max(r1, r2); ++i) {
				if (f[i][c1] != '.') return false;
			}
			return true;
		} else {
			if (r1 > r2) {
				int tmp = r1;
				r1 = r2;
				r2 = tmp;
				tmp = c1;
				c1 = c2;
				c2 = tmp;
			}
			{
				boolean ok = true;
				for (int i = r1 + 1; i <= r2; ++i) {
					if (f[i][c1] != '.') {
						ok = false;
						break;
					}
				}
				int move = c1 < c2 ? 1 : -1;
				for (int i = c1; i != c2; i += move) {
					if (f[r2][i] != '.') {
						ok = false;
						break;
					}
				}
				if (ok) return true;
			}
			{
				boolean ok = true;
				for (int i = r2 - 1; i >= r1; --i) {
					if (f[i][c2] != '.') {
						ok = false;
						break;
					}
				}
				int move = c1 < c2 ? -1 : 1;
				for (int i = c2; i != c1; i += move) {
					if (f[r1][i] != '.') {
						ok = false;
						break;
					}
				}
				if (ok) return true;
			}
			return false;
		}
	}
}