import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		double map[][];
		double memo[][];

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			map = new double[n][n];
			memo = new double[m][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = sc.nextDouble();
				}
			}
			for (int i = 0; i < m; i++) {
				Arrays.fill(memo[i], -1.0);
			}

			for (int j = 0; j < n; j++) {
				memo[0][j] = 1.0;
			}

			for (int i = 1; i < m; i++) {
				for (int j = 0; j < n; j++) {
					double max = 0;
					for (int k = 0; k < n; k++) {
						max = Math.max(max, memo[i - 1][k] * map[k][j]);
					}
					memo[i][j] = max;
				}
			}

			Arrays.sort(memo[m - 1]);
			System.out.printf("%.2f\n", memo[m - 1][n - 1]);
		}
	}
}