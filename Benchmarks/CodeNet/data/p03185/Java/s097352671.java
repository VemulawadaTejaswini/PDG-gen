import java.util.Scanner;

class Main{
	static int N;
	static long C;

	static int[] h;

	static long[] memo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		C = sc.nextLong();

		h = new int[N];
		memo = new long[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			memo[i] = -1;
		}

		long ans = dp(N - 1);

		System.out.println(ans);
		sc.close();
	}

	static long dp(int i) {
		if(i == 0)
			return 0;
		if(memo[i] == -1) {
			long min = Long.MAX_VALUE;
			for(int k = 1; k <= N; k++) {
				if(i >= k) {
					long jump = (long) (dp(i - k) + Math.pow(h[i] - h[i - k],2.0) + C);
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