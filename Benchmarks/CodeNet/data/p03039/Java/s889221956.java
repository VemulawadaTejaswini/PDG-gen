import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		long mod=1000000007;
		long ans=0;
		for(int i=1; i<=m; i++){
			ans+=((((m-i+1)*(m-i)/2)*((n*n)%mod))%mod)*Combination(n*m-2,k-2,mod);
			ans%=mod;
		}
		for(int i=1; i<=n; i++){
			ans+=((((n-i+1)*(n-i)/2)*((m*m)%mod))%mod)*Combination(n*m-2,k-2,mod);
			ans%=mod;
		}
		System.out.println(ans);
	}
	static long Combination(int left,int right,long mod){
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


