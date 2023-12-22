import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] f;
	static char[][] m = new char[2][];

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();
		f = new char[M + 2][N + 2];
		for (int i = 0; i < M; ++i) {
			String row = sc.next();
			for (int j = 0; j < N; ++j) {
				f[i + 1][j + 1] = row.charAt(j);
			}
		}
		m[0] = sc.next().toCharArray();
		m[1] = sc.next().toCharArray();
		int max = 0;
		for (int i = 1; i <= M; ++i) {
			for (int j = 1; j <= N; ++j) {
				char orig = f[i][j];
				int prev = count(i, j);
				int diff = 0;
				for (char c : new char[] { 'J', 'O', 'I' }) {
					f[i][j] = c;
					diff = Math.max(diff, count(i, j) - prev);
				}
				f[i][j] = orig;
				max = Math.max(max, diff);
			}
		}
		int all = 0;
		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				if (isJOI(i, j)) ++all;
			}
		}
		System.out.println(all + max);
	}

	static int count(int r, int c) {
		int ret = 0;
		if (isJOI(r - 1, c - 1)) ++ret;
		if (isJOI(r - 1, c)) ++ret;
		if (isJOI(r, c - 1)) ++ret;
		if (isJOI(r, c)) ++ret;
		return ret;
	}

	static boolean isJOI(int r, int c) {
		return f[r][c] == m[0][0] && f[r][c + 1] == m[0][1] && f[r + 1][c] == m[1][0] && f[r + 1][c + 1] == m[1][1];
	}
}