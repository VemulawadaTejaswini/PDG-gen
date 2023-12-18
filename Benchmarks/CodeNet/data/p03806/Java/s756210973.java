import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int ma, mb;
	int[] a, b, c;
	int[][][] dp;
	boolean[][][] f;

	int dp(int k, int ta, int tb) {
		if (k == 0 && ta == a[0] && tb == b[0]) {
			return c[0];
		}
		if (k == 0 && ta == 0 && tb == 0) {
			return 0;
		}
		if (k < 0 || ta < 0 || tb < 0) {
			return 1 << 20;
		}
		if (f[k][ta][tb]) {
			return dp[k][ta][tb];
		}
		f[k][ta][tb] = true;

		int ret = 1 << 20;
		ret = Math.min(ret, dp(k - 1, ta, tb));
		ret = Math.min(ret, dp(k - 1, ta - a[k], tb - b[k]) + c[k]);
		return dp[k][ta][tb] = ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		ma = sc.nextInt();
		mb = sc.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		dp = new int[n][401][401];
		f = new boolean[n][401][401];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 401; j++) {
				Arrays.fill(dp[i][j], 1 << 20);
				Arrays.fill(f[i][j], false);
			}
		}
		int min = 1 << 20;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 401; j++) {
				for (int k = 0; k < 401; k++) {
					int tmp = dp(i, j, k);
					if (i != 0 && j != 0 && ma * k == mb * j) {
						min = Math.min(min, tmp);
					}
				}
			}
		}

		if (min < (1 << 20)) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
