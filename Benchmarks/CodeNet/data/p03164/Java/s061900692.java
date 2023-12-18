import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w=sc.nextInt();
		long value[]=new long[n];
		long weight[]=new long[n];
		for(int i=0;i<n;i++){
			weight[i]=sc.nextLong();
			value[i]=sc.nextLong();
		}
		long dp[][]=new long[n+1][w+1];
		for(int i=0;i<=n;i++){
			for(int j=0;j<=w;j++){
				if(i==0||j==0){
					dp[i][j]=0;
					continue;
				}
				long inc=0,exe=0;
				if(weight[i-1]<=j){
					dp[i][j]=Math.max(value[i-1]+dp[i-1][(int)(j-weight[i-1])],dp[i-1][j]);
				}
				else{
					dp[i][j]=Math.max(inc, exe);
				}
			}
		}
		long ans=0;
		for(int i=0;i<=w;i++){
			ans=Math.max(ans, dp[n][i]);
		}
		System.out.println(ans);
	}
}