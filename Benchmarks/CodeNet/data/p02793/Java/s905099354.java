import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger x, y, res;
		long val, MOD = 1000000007, ans = 0, p, n, arr[] = new long[10004] ;
		n = sc.nextInt() ;
		for(int i = 0; i < n; i++) {
			val = sc.nextInt() ;
			arr[i] = val ;
		}
		res = BigInteger.valueOf(arr[0]) ;
		for(int i = 1; i < n; i++) {
			x = res.multiply(BigInteger.valueOf(arr[i])) ;
			y = res.gcd(BigInteger.valueOf(arr[i])) ;
			res = x.divide(y) ;
		}
		
		for(int i = 0; i < n; i++ ) {
			x = res.divide(BigInteger.valueOf(arr[i])) ;
			ans = ( (ans % MOD) + (x.longValue() % MOD) ) % MOD ;
		}
		System.out.println(ans) ;
	}
}
