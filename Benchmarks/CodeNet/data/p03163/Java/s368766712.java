import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[N];
		int v[] = new int[N];
		long dp[] = new long[W + 1];
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		//O(1e7)
		for(int i = 0; i < N; i++) {
			for(int j = W; j >= w[i]; j--) {
				int idx = j - w[i];
				dp[j] = Math.max(dp[j], dp[idx] + v[i]);
			}
		}
		System.out.println(dp[W]);

	}
	int diff(int a, int b) {
		return Math.abs(a - b);
	}




	public static void main(String[] args) {
		new Main().doIt();
	}
}
