import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N, M, R;
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();
		int[] r = new int[R];
		int[][] mat = new int[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				if (i != j)
					mat[i][j] = Integer.MAX_VALUE / 3;
			}
		}
		for (int i = 0; i < R; ++i) {
			r[i] = sc.nextInt();
			--r[i];
		}
		for (int i = 0; i < M; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			--a;
			--b;
			mat[a][b] = c;
			mat[b][a] = c;
		}
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				for (int k = 0; k < N; ++k) {
					mat[j][k] = Math.min(mat[j][k], mat[j][i] + mat[i][k]);
				}
			}
		}
		int[] ord = new int[R];
		for (int i = 0; i < R; ++i) {
			ord[i] = i;
		}

		int ans = Integer.MAX_VALUE / 3;
		do {
			int tmp = 0;
			for (int i = 0; i + 1 < R; ++i) {
				tmp += mat[r[ord[i]]][r[ord[i + 1]]];
			}
			ans = Math.min(ans, tmp);
		} while (nextPermutation(ord));
		System.out.println(ans);
	}

	boolean nextPermutation(int[] a) {
		int i = a.length - 1;
		while (i > 0 && a[i - 1] > a[i])
			--i;
		if (i == 0)
			return false;
		int j = a.length - 1;
		while (a[i - 1] >= a[j])
			--j;
		a[i - 1] ^= a[j];
		a[j] ^= a[i - 1];
		a[i - 1] ^= a[j];
		int t = a.length - 1;
		int s = i;
		while (t - s > 0) {
			a[s] ^= a[t];
			a[t] ^= a[s];
			a[s] ^= a[t];
			++s;
			--t;
		}
		return true;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
