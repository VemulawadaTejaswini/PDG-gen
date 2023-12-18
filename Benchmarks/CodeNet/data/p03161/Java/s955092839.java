import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		for(int i = 0; i < N; i++) 
			h[i] = sc.nextInt();
		int dp[] = new int[N];
		Arrays.fill(dp, (int)1e9);
		dp[0] = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 1; j <= K; j++)
				if(i + j < N) 
					dp[i + j] = Math.min(dp[i + j], dp[i] + diff(h[i], h[i + j]));

		}
		System.out.println(dp[N - 1]);
	}
	int diff(int a, int b) {
		return Math.abs(a - b);
	}




	public static void main(String[] args) {
		new Main().doIt();
	}
}
