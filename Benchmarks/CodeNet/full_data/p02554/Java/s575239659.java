import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long mod = 1000000007;
		long ans = (powmod(10,n)-powmod(9,n)*2+powmod(8,n))%mod;
		System.out.println(ans);
	}
	public static long powmod(long x, long n){
		long mod = 1000000007;
      	long res = 1;
      
		for(long i = 0; i < n; i++){
			res = res * x % mod;
		}
		return res;
	}
}