import java.util.*;

class Main {
	Scanner sc;
	int N, K;
	int[] H;
	long[][] dp;
	long[] s;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		H = new int[N+2];
		s = new long[N+2];
		for (int i = 1; i < N+1; i++) {
			H[i] = sc.nextInt();
			s[i] = s[i-1] + Math.abs(H[i-1]-H[i]);
		}
		s[N+1] = s[N] + Math.abs(H[N]-H[N+1]);
		
		dp = new long[N+2][K+1];
		for (int i = 0; i < N+2; i++) {
			for (int k = 0; k < K+1; k++) {
				int lp = Math.min(K, Math.min(N-i, K-k));
				for (int c = 0; c <= lp; c++) {
					long d = s[i+c+1]-s[i] - Math.abs(H[i]-H[i+c+1]);
					dp[i+c+1][k+c] = Math.max(dp[i+c+1][k+c], dp[i][k]+d);
				}
			}
		}
		System.out.println(s[N+1]/2 - dp[N+1][K]/2);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
