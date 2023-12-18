import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		
		BigInteger ans = calcFactorial(N).multiply(calcFactorial(M));
		
		if (N == M)
			ans = ans.multiply(BigInteger.valueOf(2));
		
		long ansLong = ans.mod(BigInteger.valueOf(1_000_000_007)).longValue();
		
		if (Math.abs(N-M) > 1)
			ansLong = 0;
		
		System.out.println(ansLong);
	}
	
	static BigInteger calcFactorial(long n) {
		BigInteger ans = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		
		return ans;
	}

}