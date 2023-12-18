import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		long mod=998244353;
		long[][][] dp=new long[n+1][s+1][3];
		//0は開始、１は継続、２は終了
		for(int i=1; i<=n; i++){
			int a=sc.nextInt();
			dp[i][0][0]=1;
			if(a<=s){
				dp[i][a][0]=1;
			}
			for(int t=s; t>=0; t--){
				dp[i][t][1]+=dp[i-1][t][0]+dp[i-1][t][1];
				if(t>=a){
					dp[i][t][1]+=dp[i-1][t-a][0]+dp[i-1][t-a][1];
				}
				dp[i][t][1]%=mod;
			}
			dp[i][s][2]=(dp[i-1][s][2]+dp[i][s][1]+((a==s)?1:0))%mod;
		}
		System.out.println(dp[n][s][2]);
	}
}
