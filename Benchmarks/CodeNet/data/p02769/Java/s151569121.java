import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long[] fact;
	static long[] inv;
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		fact=new long[2*n+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=2*n; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[2*n+1];
		inv[2*n]=pow(fact[2*n],mod-2);
		for(int i=2*n-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		long ans=comb(n+n-1,n-1);
		if(n-1<=k){
			System.out.println(ans);
		}else{
			ans=(ans-comb(n,n-1-k)*comb(k+n-2-k,n-2-k)+mod)%mod;
			System.out.println(ans);
		}
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
