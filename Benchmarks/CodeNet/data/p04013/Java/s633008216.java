import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	// 30回ぐらい？

	final double e0 = 8.854187 * 1e-12;// Fm^(-1)
	final double a = 1;// 格子間距離
	final double dt = 0.01;
	double[][][] charge = new double[100000][3][3];
	double[][][] voltage = new double[100000][3][3];
	double thickness = 0.1;
	double k = 1e-3;// ω/k=c,k=ω/c ω=10^12 c=10^8,適当
	double Z = 120 * Math.PI;
	final long MOD = (long) 1e17 + 7;

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		long[][] dp = new long[N + 1][N * A + 1];
		dp[0][0] = 1;
		int[] x = new int[N];
		for (int i = 0; i < N; ++i) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		for (int i = 0; i < x.length; ++i) {
			for (int k = dp.length - 2; k >= 0; --k) {
				for (int j = dp[k + 1].length - 1 - x[i]; j >= 0; --j) {
					dp[k + 1][j + x[i]] += dp[k][j];
				}
			}
		}
		long ans = 0;
		for (int i = 1; i <= N; ++i) {
			ans += dp[i][A * i];
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
