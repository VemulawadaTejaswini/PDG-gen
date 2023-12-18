import java.util.*;
public class Main{
	static long mod=1000000007;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[1000001];
		for(int i=0; i<n; i++){
			a[i] =sc.nextInt();
			int tmp=a[i];
			for(int j=2; j*j<=a[i]; j++){
				int count=0;
				while(tmp%j==0){
					tmp/=j;
					count++;
				}
				b[j]=Math.max(b[j],count);
			}
			b[tmp]=Math.max(b[tmp],1);
		}
		long lcm=1;
		for(int i=2; i<1000001; i++){
			lcm*=pow(i,b[i]);
			lcm%=mod;
		}
		long ans=0;
		for(int i=0; i<n; i++){
			ans+=(lcm*pow(a[i],mod-2))%mod;
			ans%=mod;
		}
		System.out.println(ans);
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
