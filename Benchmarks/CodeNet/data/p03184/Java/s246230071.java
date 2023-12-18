import java.util.*;
import java.io.PrintWriter;
import java.math.*;
public class Main{
	static long mod=1000000007;
	static long[] fact;
	static long[] inv;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		fact=new long[h+w+1];
		fact[1]=1;
		for(int i=2; i<=h+w; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[h+w+1];
		inv[h+w]=pow(fact[h+w],mod-2);
		for(int i=h+w-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		long ans=comb(h+w-2,h-1);
		int n=sc.nextInt();
		int[][] dp=new int[n][3];
		for(int i=0; i<n; i++){
			int r=sc.nextInt()-1;
			int c=sc.nextInt()-1;
			dp[i][0]=(int)comb(r+c,r);
			dp[i][1]=r;
			dp[i][2]=c;
		}
		Arrays.sort(dp,(x,y)->(x[1]+x[2]-y[1]-y[2]));
		for(int i=0; i<n; i++){
			long ii=dp[i][0];
			for(int j=0; j<i; j++){
				if(dp[i][1]>=dp[j][1] && dp[i][2]>=dp[j][2]){
					long tmp=(dp[j][0]*comb(dp[i][1]+dp[i][2]-dp[j][1]-dp[j][2],dp[i][1]-dp[j][1]))%mod;
					ii=(ii-tmp+mod)%mod;
				}
			}
			ii=(ii*comb(h+w-dp[i][1]-dp[i][2]-2,h-dp[i][1]-1))%mod;
			dp[i][0]=(int)ii;
			ans=(ans-ii+mod)%mod;
		}
		System.out.println(ans);
	}
	static long comb(int t,int y){
		long re=1;
		re*=fact[t];
		re*=inv[y];
		re%=mod;
		re*=inv[t-y];
		return re%mod;
	}
	
	static long pow(long p,long q){
		long res=1;
		while(q>0){
			if((q & 1)==1){
				res*=p;
				res%=mod;
			}
			q>>=1;
			p*=p;
			p%=mod;
		}
		return res;
	}
}
