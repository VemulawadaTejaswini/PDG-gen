import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int N = sc.nextInt();
		int h[] = new int[N];
		for(int i = 0; i < N; i++) 
			h[i] = sc.nextInt();
		int dp[] = new int[N];
		Arrays.fill(dp, MAX);
		dp[0] = 0;
		for(int i = 0; i < N; i++) {
			if(i + 1 < N) 
				dp[i + 1] = Math.min(dp[i + 1], dp[i] + diff(h[i], h[i + 1]));
			if(i + 2 < N)
				dp[i + 2] = Math.min(dp[i + 2], dp[i] + diff(h[i], h[i + 2]));
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
