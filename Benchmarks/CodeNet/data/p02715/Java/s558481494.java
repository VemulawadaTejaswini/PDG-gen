import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long ans=0;
		long[] kk=new long[k+1];
		for(int i=k; i>=1; i--){
			kk[i]=modpow(k/i,n);
			for(int j=2; j<=k/i; j++){
				kk[i]=(kk[i]-kk[i*j]+mod)%mod;;
			}
			ans=(ans+kk[i]*i)%mod;
		}
		System.out.println(ans);
	}
	static long modpow(long left,long right){
		long ans=1;
		while(right>0){
			if((right&1)==1){
				ans*=left;
			}
			right>>=1;
			left*=left;
			ans%=mod;
			left%=mod;
		}
		return ans;
	}
}
