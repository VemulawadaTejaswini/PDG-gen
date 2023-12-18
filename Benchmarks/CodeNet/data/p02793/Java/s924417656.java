import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			a[i] = BigInteger.valueOf(sc.nextLong());
		}
		sc.close();

		BigInteger lcm = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			lcm = lcm.multiply(a[i]).divide(lcm.gcd(a[i]));
		}

		BigInteger m = BigInteger.valueOf(1000000007);
		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			BigInteger val = lcm.divide(a[i]);
			ans = ans.add(val);
			ans = ans.mod(m);
		}
		System.out.println(ans);
	}
}
