import java.util.*;
import java.math.*;
public class Main{
	static long mod=1000000007;
	static long[] fact;
	static long[] inv;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fact=new long[n+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=n; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[n+1];
		inv[n]=pow(fact[n],mod-2);
		for(int i=n-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		int k=sc.nextInt();
		long mod=1000000007;
		long[] a=new long[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		long ans=0;
		for(int i=n-1; i>=0; i--){
			ans+=a[i]*comb(i,k-1);
			ans-=a[i]*comb(n-1-i,k-1);
			ans=(ans+mod)%mod;
		}
		System.out.println(ans);
	}
	static long comb(int t,int y){
		if(t<y){
			return 0;
		}
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
