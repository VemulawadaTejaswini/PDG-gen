import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long nmin=Long.MAX_VALUE;
		long nmax=Long.MIN_VALUE;
		long mmin=Long.MAX_VALUE;
		long mmax=Long.MIN_VALUE;
		long mod=1000000007;
		for(long i=0; i<n; i++){
			long a=sc.nextLong();
			if(nmin>a){
				nmin=a;
			}
			if(nmax<a){
				nmax=a;
			}
		}
		for(long i=0; i<m; i++){
			long b =sc.nextLong();
			if(mmin>b){
				mmin=b;
			}
			if(mmax<b){
				mmax=b;
			}
		}
		long s=((mmax-mmin)%mod)*((nmax-nmin)%mod);
		s%=mod;
		long ans=s;
		for(long i=1; i<=n+m-4; i++){
			ans+=((i*s)%mod);
			ans%=mod;
		}
		System.out.println(ans);
	}
}
