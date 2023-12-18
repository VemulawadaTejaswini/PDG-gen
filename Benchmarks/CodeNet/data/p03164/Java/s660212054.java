import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		long[] dp = new long[100001];
		Arrays.fill(dp, W + 1);
		dp[0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = dp.length - 1 - v[i]; j >= 0; j--) {
				if (dp[j] + w[i] < dp[j + v[i]]) {
					dp[j + v[i]] = dp[j] + w[i];
				}
			}
		}
		for (int i = dp.length - 1; ; i--) {
			if (dp[i] <= W) {
				System.out.println(i);
				break;
			}
		}
	}

}