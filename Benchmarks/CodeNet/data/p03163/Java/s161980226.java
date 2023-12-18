import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[N+1];
		int v[] = new int[N+1];

		for(int n=1;n<N+1;n++){
			w[n] = sc.nextInt();
			v[n] = sc.nextInt();
		}

		long dp[][] = new long[N+1][W+1];
		Arrays.fill(dp[0],0);
		for(int n=1;n<N+1;n++){
			for(int i=1;i<W+1;i++){
				if(w[n] > i) dp[n][i] = dp[n-1][i];
				else dp[n][i] = Math.max(dp[n-1][i],dp[n-1][i-w[n]]+v[n]);
			}
		}

		System.out.println(dp[N][W]);
	}
}