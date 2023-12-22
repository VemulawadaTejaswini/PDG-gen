import java.util.*;
import java.io.PrintWriter;

public class Main{
	static long[] fact;
	static long[] inv;
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String s=sc.next();
		fact=new long[s.length()+k+1];
		fact[0]=1;
		fact[1]=1;
		for(int i=2; i<=s.length()+k; i++){
			fact[i]=(fact[i-1]*i)%mod;
		}
		inv=new long[s.length()+k+1];
		inv[s.length()+k]=pow(fact[s.length()+k],mod-2);
		for(int i=s.length()+k-1; i>=0; i--){
			inv[i]=(inv[i+1]*(i+1))%mod;
		}
		long ans=0;
		for(int i=0; i<=k; i++){
			ans=(ans+(((pow(26,k-i)*pow(25,i))%mod)*comb(s.length()+i-1,i)%mod))%mod;
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
