import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] x, y, r, c;
	byte[] memo;

	void run() {
		for (;;) {
			n = sc.nextInt();
			if (n == 0) return;
			x = new int[n];
			y = new int[n];
			r = new int[n];
			c = new int[n];
			memo = new byte[1 << n];
			for (int i = 0; i < 1 << n; i++) memo[i] = -1;
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				r[i] = sc.nextInt();
				c[i] = sc.nextInt();
			}
			int max = 0;
			// ????????????????????????????????????????±???????
			for (int i = 0; i < n; i++) {
				L: for (int j = i + 1; j < n; j++) {
					if (c[i] != c[j]) continue;
					for (int k = j - 1; k >= 0; k--) {
						int pDis_j = (x[k] - x[j]) * (x[k] - x[j]) + (y[k] - y[j]) * (y[k] - y[j]);
						int rDis_j = (r[k] + r[j]) * (r[k] + r[j]);
						int pDis_i = (x[k] - x[i]) * (x[k] - x[i]) + (y[k] - y[i]) * (y[k] - y[i]);
						int rDis_i = (r[k] + r[i]) * (r[k] + r[i]);
						// k?????????????????£??????????????§????????????
						if (pDis_j < rDis_j) continue L;
						if (k < i && pDis_i < rDis_i) continue L;
					}
					max = Math.max(max, 2 + bitDP(1 << i | 1 << j));
				}
			}
			System.out.println(max);
		}
	}

	int bitDP(int mask) {
		if (memo[mask] != -1) return memo[mask];

		byte res = 0;
		for (int i = 0; i < n; i++) {
			L: for (int j = i + 1; j < n; j++) {
				if (c[i] != c[j]) continue;
				// ??¢???i or j????????£?????????
				if ((mask & (1 << i)) != 0 || (mask & (1 << j)) != 0) continue;
				for (int k = j - 1; k >= 0; k--) {
					// ??¢???k???????????????????????????
					if ((mask & 1 << k) != 0) continue;
					int pDis_j = (x[k] - x[j]) * (x[k] - x[j]) + (y[k] - y[j]) * (y[k] - y[j]);
					int rDis_j = (r[k] + r[j]) * (r[k] + r[j]);
					int pDis_i = (x[k] - x[i]) * (x[k] - x[i]) + (y[k] - y[i]) * (y[k] - y[i]);
					int rDis_i = (r[k] + r[i]) * (r[k] + r[i]);

					// k?????????????????£??????????????§????????????
					if (pDis_j < rDis_j) continue L;
					if (k < i && pDis_i < rDis_i) continue L;
				}
				res = (byte) Math.max(res, 2 + bitDP(mask | (1 << i | 1 << j)));
			}
		}
		return memo[mask] = res;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}