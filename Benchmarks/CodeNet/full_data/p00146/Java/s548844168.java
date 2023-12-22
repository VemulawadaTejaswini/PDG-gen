import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int num[];
	static int dir[];
	static int val[];
	static double dp[][][];

	public static double f(int cnt, int id, int bit) {
		if (0 < dp[cnt][id][bit]) {
			return dp[cnt][id][bit];
		}
		if (cnt == n - 1) {
			return dp[cnt][id][bit] = 0;
		}

		int weight = 0;
		for (int i = 0; i < n; i++) {
			if (0 < (bit & (1 << i))) {
				weight += val[i] * 20;
			}
		}
		weight += val[id] * 20;

		double min = Double.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if ((bit & (1 << i)) == 0 && i != id) {
				double sum = 1.0 * Math.abs(dir[i] - dir[id]) / ((2000 / (70 + weight))) + f(cnt + 1, i, bit | (1 << id));
				min = Math.min(min, sum);
			}
		}

		return dp[cnt][id][bit] = min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		num = new int[n];
		dir = new int[n];
		val = new int[n];
		dp = new double[n][n][1 << n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			dir[i] = sc.nextInt();
			val[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Arrays.fill(dp[i][j], -1000.0);
			}
		}
		for (int i = 0; i < n; i++) {
			f(0, i, 0);
		}

		int bit = 0;
		String s = "";
		for (int i = 0; i < n; i++) {
			int minId = -1;
			for (int j = 0; j < n; j++) {
				if (-1.0 <= dp[i][j][bit]) {
					if (minId < 0 || dp[i][j][bit] < dp[i][minId][bit]) {
						if ((bit & (1 << j)) == 0) {
							minId = j;
						}
					}
				}
			}
			System.out.print(s + num[minId]);
			s = " ";
			bit |= (1 << minId);
		}
		System.out.println();
	}
}