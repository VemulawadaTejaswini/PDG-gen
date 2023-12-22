import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static double[] x, y, r;

	public static void main(String[] args) {
		int t = 1;
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			x = new double[N];
			y = new double[N];
			r = new double[N];
			for (int i = 0; i < N; ++i) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
			}
			System.out.printf("%d %.2f\n", t, solve());
			++t;
		}
	}

	static double solve() {
		double[] xs = new double[N * 2];
		double[] ys = new double[N * 2];
		for (int i = 0; i < N; ++i) {
			xs[2 * i] = x[i] - r[i];
			xs[2 * i + 1] = x[i] + r[i];
			ys[2 * i] = y[i] - r[i];
			ys[2 * i + 1] = y[i] + r[i];
		}
		Arrays.sort(xs);
		Arrays.sort(ys);
		boolean[][] covered = new boolean[2 * N][2 * N];
		for (int i = 0; i < N; ++i) {
			int x1 = Arrays.binarySearch(xs, x[i] - r[i]);
			int x2 = Arrays.binarySearch(xs, x[i] + r[i]);
			int y1 = Arrays.binarySearch(ys, y[i] - r[i]);
			int y2 = Arrays.binarySearch(ys, y[i] + r[i]);
			for (int j = x1; j < x2; ++j) {
				for (int k = y1; k < y2; ++k) {
					covered[j][k] = true;
				}
			}
		}
		double ans = 0;
		for (int i = 0; i < 2 * N; ++i) {
			for (int j = 0; j < 2 * N; ++j) {
				if (covered[i][j]) {
					ans += (xs[i + 1] - xs[i]) * (ys[j + 1] - ys[j]);
				}
			}
		}
		return ans;
	}
}