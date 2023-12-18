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
		long[] dp=new long[n];
		int[] r=new int[n];
		int[] c=new int[n];
		for(int i=0; i<n; i++){
			r[i]=sc.nextInt()-1;
			c[i]=sc.nextInt()-1;
			dp[i]=comb(r[i]+c[i],r[i]);
		}
		for(int i=0; i<n; i++){
			long ii=dp[i];
			for(int j=0; j<n; j++){
				if(i!=j && r[i]>=r[j] && c[i]>=c[j]){
					long tmp=(dp[j]*comb(r[i]+c[i]-r[j]-c[j],r[i]-r[j]))%mod;
					ii=(ii-tmp+mod)%mod;
				}
			}
			ii=(ii*comb(h+w-r[i]-c[i]-2,h-r[i]-1))%mod;
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
