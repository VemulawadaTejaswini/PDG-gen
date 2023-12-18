import java.util.Scanner;

class Main{
	static int N;
	static int K;

	static int[] h;

	static int[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();

		h = new int[N];
		memo = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			memo[i] = -1;
		}

		int ans = dp(N - 1);

		System.out.println(ans);
		sc.close();
	}

	static int dp(int i) {
		if(i == 0)
			return 0;
		if(memo[i] == -1) {
			int min = Integer.MAX_VALUE;
			for(int k = 1; k <= K; k++) {
				if(i >= k) {
					int jump = dp(i - k) + Math.abs(h[i] - h[i - k]);
					if(min > jump) {
						min = jump;
					}
				}
			}
			memo[i] = min;
		}
		return memo[i];
	}
}