import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		long mod=998244353;
		long[] dp=new long[s+1];
		dp[0]=1;
		long ans=0;
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			for(int j=s; j>=a; j--){
				dp[j]+=dp[j-a];
				dp[j]%=mod;
			}
			dp[0]++;
			ans+=dp[s];
			ans%=mod;
		}
		System.out.println(ans);
	}
}
