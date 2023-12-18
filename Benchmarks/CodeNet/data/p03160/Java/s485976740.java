public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = in.nextInt();
		}
		int[] dp = new int[N];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i = 1; i < N; i++) {
			for (int j = Math.max(0, i - K); j < i; j++) {
				if (dp[j] == Integer.MAX_VALUE) continue;
				dp[i] = Math.min(dp[i], dp[j] + Math.abs(h[j] - h[i]));
			}
		}
		System.out.println(dp[N - 1]);
	}
}