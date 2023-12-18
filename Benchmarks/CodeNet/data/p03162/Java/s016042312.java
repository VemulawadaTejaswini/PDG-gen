import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] dp = new int[N + 1];

		Arrays.fill(dp, Integer.MIN_VALUE);

		dp[0] = 0;

		int past = -1;
		int pass = 0;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 0; j < 3; j++) {
				int edge = sc.nextInt();
				if (j != past && dp[i - 1] + edge > dp[i]) {
					dp[i] = dp[i - 1] + edge;
					pass = j;
				}
			}
			past = pass;
		}

		System.out.println(dp[N]);

	}
}
