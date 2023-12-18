import java.util.*;

public class Main{

	static Scanner s=new Scanner(System.in);

	static int mod=998244353;

	public static void main(String[] $){
		long n=s.nextInt(),a=s.nextInt(),b=s.nextInt(),k=s.nextLong(),r=0;
		for(int i=0;i<=n;++i){
			if((k-a*i)%b==0){
				long j=(k-a*i)/b;
				r+=nPr(n,i)*nPr(n,j);
				r%=mod;
			}
		}
		System.out.println(r);
	}
	static long nPr(long n,long a){
		if(a==0)
			return 1;
		long r=1;
		for(long i=n-a+1;i<=n;++i){
			r*=i;
			r%=mod;
		}
		for(int i=2;i<=a;++i) {
			r*=pow(i,mod-2);
			r%=mod;
		}
		return r;
	}
	static long pow(long n,long a){
		if(a==1)
			return n;
		if(a%2==0){
			long d=pow(n,a/2);
			return d*d%mod;
		}
		return n*pow(n,a-1)%mod;
	}
}