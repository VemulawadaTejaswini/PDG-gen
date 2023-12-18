import java.util.Scanner;

public class Main {
	int n, m;
	int[][] e;

	int calc(int k, boolean[] f) {
		if (check(f)) {
			return 1;
		}
		int ret = 0;
		for (int i = 0; i < n; i++) {
			if (e[k][i] == 1 && !f[i]) {
				f[i] = true;
				ret += calc(i, f);
				f[i] = false;
			}
		}
		return ret;
	}

	boolean check(boolean[] f) {
		for (int i = 0; i < n; i++) {
			if (!f[i]) {
				return false;
			}
		}
		return true;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		e = new int[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			e[a][b] = e[b][a] = 1;
		}
		boolean[] f = new boolean[n];
		f[0] = true;
		System.out.println(calc(0, f));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
