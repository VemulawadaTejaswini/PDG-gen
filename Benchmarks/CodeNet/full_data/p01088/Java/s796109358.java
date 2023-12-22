
import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] p = new int[n];
			for (int i = 0; i < n; ++i)
				p[i] = sc.nextInt();

			int[][][] f = new int[n + 1][n + 1][500 * n + 1];
			for (int i = 0; i < f.length; ++i) {
				for (int j = 0; j < f[i].length; ++j) {
					for (int k = 0; k < f[i][j].length; ++k)
						f[i][j][k] = -Integer.MAX_VALUE / 3;
				}
			}
			f[0][0][0] = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = n - 1; j >= 0; --j) {
					for (int k = f[i][j].length - 1; k >= 0; --k) {
						f[i + 1][j][k] = Math.max(f[i][j][k], f[i + 1][j][k]);
						if (f[i][j][k] < 0)
							continue;
						if (1 <= p[i] % 1000 && p[i] % 1000 <= 500) {
							int coin = (1000 - p[i] % 1000) % 500;
							f[i + 1][j + 1][k + coin] = Math.max(f[i + 1][j + 1][k + coin], f[i][j][k] + p[i]);
						} else {
							int coin = (1000 - p[i] % 1000) % 500;
							f[i + 1][j][k + coin] = Math.max(f[i + 1][j][k + coin], f[i][j][k] + p[i]);
							int v = p[i] % 1000 - 500 + (p[i] % 1000 == 0 ? 1000 : 0);
							if (k >= v) {
								f[i + 1][j + 1][k - v] = Math.max(f[i + 1][j + 1][k - v], f[i][j][k] + p[i]);
							}
						}
					}

				}
			}
			int c = 0, s = 0;
			for (int i = 0; i <f[n].length; ++i) {
				for (int j = 0; j < f[n][i].length; ++j) {
					if (f[n][i][j] < 0)
						continue;
					if (c < i || s > f[n][i][j]) {
						c = i;
						s = f[n][i][j];
					}
				}
			}
			System.out.println(c + " " + s);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
