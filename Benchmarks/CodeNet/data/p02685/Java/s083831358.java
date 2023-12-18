import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=998244353;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		
		long[] pow=new long[n+1];
		long[] ppp=new long[n+1];
		ppp[1]=1;
		for(int i=2; i<=n; i++){
			ppp[i]=(ppp[i-1]*i)%mod;
		}
		pow[1]=m;
		for(int i=2; i<=n; i++){
			pow[i]=(pow[i-1]*(m-1))%mod;
		}
		long ans=0;
		for(int i=0; i<=k; i++){
			ans+=pow[n-i]*((ppp[n-i]*((pow1(ppp[i],mod-2)*pow1(ppp[n-2*i],mod-2))%mod))%mod)%mod;
			ans%=mod;
		}
		System.out.println(ans);
	}
	static long pow1(long p,long q){
		if(p==0){
			return 1;
		}
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
