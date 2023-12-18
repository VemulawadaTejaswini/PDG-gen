import java.util.*;
public class knapsack1bottomup {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long w=sc.nextLong();
		long value[]=new long[n];
		long weight[]=new long[n];
		for(int i=0;i<n;i++){
			weight[i]=sc.nextLong();
			value[i]=sc.nextLong();
		}
		long dp[][]=new long[n+1][(int)w+1];
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
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][(int)w]);
	}
}
