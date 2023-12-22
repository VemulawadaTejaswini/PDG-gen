import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum = 0;
		long mod = 1000000007;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum+=a[i]%mod;
			//System.out.println(sum);
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			sum-=a[i];
			ans+=sum*a[i]%mod;
		}
		System.out.println(ans%mod);
	}
}