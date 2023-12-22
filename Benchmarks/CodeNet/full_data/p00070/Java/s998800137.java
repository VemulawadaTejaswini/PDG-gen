import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n,s,ans;
		static int[][] dp;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			n=cin.nextInt();
			s=cin.nextInt();
			ans=0;
			dp=new int[1<<10][s+1];
			for(int i=0;i<(1<<10);i++)
				Arrays.fill(dp[i],-1);
			for(int i=0;i<10;i++){
				if(i>s)continue;
				dp(1<<i,i);
			}
			System.out.println(ans);
		}
	}
	static int dp(int used,int sum){
		if(dp[used][sum]!=-1)return dp[used][sum];
		if(Integer.bitCount(used)==n){
			if(sum==s){
				ans++;
				return 1;
			}
			return 0;
		}
		for(int i=0;i<10;i++){
			if(((1<<i)&used)==0){
				int step=Integer.bitCount(used)+1;
				if(sum+i*step>s)continue;
				dp[used][sum]+=dp(used+(1<<i),sum+i*(step));
			}
		}
		return dp[used][sum];
	}
}