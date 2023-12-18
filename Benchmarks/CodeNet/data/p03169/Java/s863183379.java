import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] A = new int[4];
		for (int i = 0; i < N; i++) {
			A[sc.nextInt()]++;
		}
		double[][][] dp = new double[301][301][301];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; i + j <= N; j++) {
				for (int k = 0; i + j + k <= N; k++) {
					int any = i + j + k;
					double ratio = 1.0 * N / any;
					if (i > 0) {
						dp[i][j][k] += (dp[i - 1][j + 1][k] + ratio) * i / any;
					}
					if (j > 0) {
						dp[i][j][k] += (dp[i][j - 1][k + 1] + ratio) * j / any;
					}
					if (k > 0) {
						dp[i][j][k] += (dp[i][j][k - 1] + ratio) * k / any;
					}
				}
			}
		}
		System.out.printf("%.10f\n", dp[A[3]][A[2]][A[1]]);
	}
}