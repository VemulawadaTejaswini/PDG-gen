import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[][][] dp=new long[n+3][3][2];
		//2が余分、3は0が最後を使わない
		for(int i=3; i<n+3; i++){
			int a=sc.nextInt();
			dp[i][0][0]=dp[i-1][0][1];
			dp[i][0][1]=dp[i-1][0][0]+a;
			dp[i][1][0]=Math.max(dp[i-1][1][1],dp[i-2][0][1]);
			dp[i][1][1]=dp[i-1][1][0]+a;
			if(n%2==1){
				dp[i][100][1]=0;
				dp[i][2][0]=Math.max(Math.max(dp[i-1][2][1],dp[i-3][0][1]),dp[i-2][1][1]);
				dp[i][2][1]=dp[i-1][2][0]+a;
			}
		}
		long ans=0;
		for(int j=0; j<3; j++){
			for(int i=0; i<2; i++){
				ans=Math.max(ans,dp[n+2][j][i]);
			}
		}
		System.out.println(ans);
	}
}
