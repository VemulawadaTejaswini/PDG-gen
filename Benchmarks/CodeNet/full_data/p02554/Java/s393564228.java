
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger mod = BigInteger.valueOf((long) (Math.pow(10, 9) + 7));
		
		BigInteger a = BigInteger.valueOf(9).modPow(BigInteger.valueOf(n), mod).multiply(BigInteger.valueOf(2)).mod(mod);
		BigInteger b = BigInteger.valueOf(8).modPow(BigInteger.valueOf(n), mod);
		BigInteger c = a.subtract(b).add(mod).mod(mod);
		BigInteger e = BigInteger.valueOf(10).modPow(BigInteger.valueOf(n), mod);
		BigInteger ans = e.subtract(c).add(mod).mod(mod);
		System.out.println(ans.longValue());
	}
}