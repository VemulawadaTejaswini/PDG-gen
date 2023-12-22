import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n ;
		n = sc.nextInt() ;
		BigInteger val = BigInteger.valueOf(1), check = new BigInteger("1000000000000000000"), x ;
		for (int i = 0; i < n; i++) {
			x = sc.nextBigInteger() ;
			val = val.multiply(x) ;
		}
		int result = val.compareTo(check) ;
		if (result == 1)	System.out.println(-1) ;
		else	System.out.println(val) ;
		System.gc(); 
	}
}
