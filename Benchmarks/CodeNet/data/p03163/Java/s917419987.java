import java.util.Scanner;

public class Main {
  
  	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		long[][] dp = new long[N+1][W+1];
		long ans = 0;
		
		for(int i=0;i<N+1;i++){
			for(int j=0;j<W+1;j++){
				dp[i][j] = -1;
			}
		}
		dp[0][0] = 0;
		
		for(int i=1;i<=N;i++){
			int w = sc.nextInt();
			long v = sc.nextLong();
			
			for(int j=0;j<=W;j++){
				
				if(dp[i-1][j] == -1){
					continue;
				}

				for(int k=0;k<=1;k++){
					if(j+w <= W){
						dp[i][j+w*k] = chmax(dp[i][j+w*k],dp[i-1][j]+v*k);
						ans = chmax(ans, dp[i][j+w]);
					}
				}				
			}
		}
		
		System.out.println(ans);
	}

	public static long chmax(long a, long b){
		
		if(a >= b){
			return a;
		}else{
			return b;
		}
	}
	
}