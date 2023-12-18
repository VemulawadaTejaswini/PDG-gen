import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[][] dp=new long[n][3];
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			if(n%2==0){
				if(i<=1){
					dp[i][i]=a;
				}else if(i==2){
					dp[i][0]=dp[i-2][0]+a;
				}else{
					dp[i][0]=dp[i-2][0]+a;
					dp[i][1]=Math.max(dp[i-2][1],dp[i-3][0])+a;
				}
			}else{
				System.out.println(dp[n+1][1]);
				if(i<=1){
					dp[i][i]=a;
				}else if(i==2){
					dp[i][0]=dp[i-2][0]+a;
					dp[i][2]=a;
				}else if(i==3){
					dp[i][0]=dp[i-2][1]+a;
					dp[i][1]=dp[i-3][0]+a;
				}else{
					dp[i][0]=dp[i-2][0]+a;
					dp[i][1]=Math.max(dp[i-2][1],dp[i-3][0])+a;
					dp[i][2]=Math.max(dp[i-4][0],Math.max(dp[i-3][1],dp[i-2][2]))+a;
				}
			}
		}
		long ans=0;
		if(n%2==0){
			for(int i=n-1; i>=Math.max(0,n-2); i--){
				ans=Math.max(ans,dp[i][1-(n-1-i)]);
			}
		}else{
			for(int i=n-1; i>=Math.max(0,n-3); i--){
				ans=Math.max(ans,dp[i][2-(n-1-i)]);
			}
		}
		System.out.println(ans);
	}
}
