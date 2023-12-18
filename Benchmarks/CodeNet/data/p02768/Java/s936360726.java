import java.util.*;

class Main{
	public static int mod=1000000007;

	public static long modpow(long n,long p){
		if(p==0)
			return 1;
		if(p%2==1)
			return n*modpow(n,p-1)%mod;
		long d=modpow(n,p/2);
		return d*d%mod;
	}

	public static long modpow(long n){
		return modpow(n,mod-2);
	}

	public static long nCr(long n,long r){
		if(n-r<r)
			return nCr(n,n-r);
		long res=1;
		for(long i=n-r+1;i<=n;++i){
			res*=i;
			res%=mod;
		}
		for(long i=2;i<=r;++i){
			res*=modpow(i,mod-2);
			res%=mod;
		}
		return res;
	}

	public static void main(String[] $){
		final Scanner s=new Scanner(System.in);
		final int n=s.nextInt();
		final int a=s.nextInt();
		final int b=s.nextInt();

		System.out.println((modpow(2,n)+mod*2-1-nCr(n,a)-nCr(n,b))%mod);
	}
}
