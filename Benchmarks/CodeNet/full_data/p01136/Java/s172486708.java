import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			boolean[][] t = new boolean[31][N];
			for (int i = 0; i < N; ++i) {
				int F = sc.nextInt();
				for (int j = 0; j < F; ++j) {
					int d = sc.nextInt();
					t[d][i] = true;
				}
			}
			int ans = -1;
			for (int i = 1; i <= 30; ++i) {
				if (ok(t, i)) {
					ans = i;
					break;
				}
			}
			System.out.println(ans);
		}
	}

	static boolean ok(boolean[][] t, int d) {
		boolean[] v = new boolean[N];
		for (int i = 0; i < N; ++i) {
			if (t[d][i]) v[i] = true;
		}
		for (int i = d - 1; i >= 1; --i) {
			boolean ok = false;
			for (int j = 0; j < N; ++j) {
				if (t[i][j] && v[j]) ok = true;
			}
			if (ok) {
				for (int j = 0; j < N; ++j) {
					if (t[i][j]) v[j] = true;
				}
			}
		}
		for (int i = 0; i < N; ++i) {
			if (!v[i]) return false;
		}
		return true;
	}
}