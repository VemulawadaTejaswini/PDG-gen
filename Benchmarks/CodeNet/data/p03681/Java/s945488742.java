import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(Math.abs(n-m)>1){
			System.out.println(0);
			return;
		}
		int min=Math.min(n,m);
		int max=Math.max(n,m);
		long ans=1;
		long mod=1000000007;
		for(int i=2; i<=max; i++){
			ans*=i;
			ans%=mod;
		}
		for(int i=2; i<=min; i++){
			ans*=i;
			ans%=mod;
		}
		if(n==m){
			ans*=Combination(max+1,min,mod)-max+1;
		}
		System.out.println(ans%mod);
	}
	static long Combination(long left,long right,long mod){
		long ans=1;
		right=Math.min(right,left-right);
		for(int i=0; i<right; i++){
			ans*=(left-i);
			ans%=mod;
		}
		for(int i=2; i<=right; i++){
			long tmp=mod-2;
			long mul=i;
			while(tmp>0){
				if((tmp&1)==1){
					ans*=mul;
				}
				tmp>>=1;
				mul*=mul;
				ans%=mod;
				mul%=mod;
			}
		}
		return ans;
	}
}
