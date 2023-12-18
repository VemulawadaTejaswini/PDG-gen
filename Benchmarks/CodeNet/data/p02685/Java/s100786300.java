import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=998244353;
	static long[] fact;
	static long[] inv;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		fact=new long[n+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=n; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[n+1];
		inv[n]=pow1(fact[n],mod-2);
		for(int i=n-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		long[] pow=new long[n+1];
		pow[1]=m;
		for(int i=2; i<=n; i++){
			pow[i]=(pow[i-1]*(m-1))%mod;
		}
		long ans=0;
		for(int i=0; i<=k; i++){
			ans+=(pow[n-i]*C(n-1,i))%mod;
			ans%=mod;
		}
		System.out.println(ans);
	}
	static long C(int t,int y){
		long re=1;
		re*=fact[t];
		re*=inv[y];
		re%=mod;
		re*=inv[t-y];
		return re%mod;
	}
	static long pow1(long p,long q){
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
