import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			sum += x[i];
		}
		long[][][] dp = new long[n+1][n+1][sum+1];
		dp[0][0][0] = 1L;
		for(int i=1; i<n+1; i++){
			for(int k=0; k<n+1; k++){
				for(int s=0; s<sum+1; s++){
					if(s>=x[i-1] && k>=1){
						dp[i][k][s] = dp[i-1][k][s] + dp[i-1][k-1][s-x[i-1]];
					}
					else{
						dp[i][k][s] = dp[i-1][k][s];
					}
				}
			}
		}
		long ans = 0L;
		for(int k=1; k<n+1; k++){
			ans += dp[n][k][k*a];
		}
		System.out.println(ans);
	}
}