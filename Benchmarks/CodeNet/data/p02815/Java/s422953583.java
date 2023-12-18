import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long mod=1000000007;
		long[] c=new long[n];
		for(int i=0; i<n; i++){
			c[i]=sc.nextLong();
		}
		long two=1;
		long[] mm=new long[n+1];
		for(int i=0; i<=n; i++){
			mm[i]=two;
			two*=2;
			two%=mod;
		}
		Arrays.sort(c);
		long ans=(c[n-1]*mm[n-1])%mod;
		for(int i=0; i<n-1; i++){
			ans+=c[i]*(((mm[n-1-i]+(mm[n-2-i]*(n-1-i))%mod)*mm[i])%mod);
			ans%=mod;
		}
		ans*=mm[n];
		System.out.println(ans%mod);
	}
}
