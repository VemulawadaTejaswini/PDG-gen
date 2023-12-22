import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] c = new int[M];
		for(int i=0;i<M;i++) c[i] = sc.nextInt();
		Arrays.sort(c);
		
		int[][] dp = new int[M+1][N+1];
		for(int i=0;i<=M;i++) for(int j=0;j<=N;++j) dp[i][j] = 1000000;
		dp[0][0] = 0;
		
		for(int i=0;i<M;i++){
			for(int j=0;j<=N;++j){
				dp[i+1][j] = dp[i][j];
				int k = j-c[i];
				if(k>=0){
					dp[i+1][j] = Math.min(dp[i+1][j], Math.min(dp[i][k]+1, dp[i+1][k]+1));
				}
			}
		}
		System.out.println(dp[M][N]);
		return;
	}
}
