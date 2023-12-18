import java.util.Scanner;

public class Main {
	
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(arr[0] - arr[1]);

		for (int i = 2; i < N; i++) {
			dp[i] = Integer.MAX_VALUE;

			int j = Math.max(0, i - K);

			while (j < i) {
				dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[j] - arr[i]));
				j++;
			}
		}

		System.out.println(dp[N-1]);
	}
}