import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		BigInteger lcm = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			BigInteger ai = BigInteger.valueOf(a[i]);
			lcm = lcm.multiply(ai).divide(lcm.gcd(ai));
		}

		BigInteger m = BigInteger.valueOf(1000000007);
		BigInteger ans = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			BigInteger ai = BigInteger.valueOf(a[i]);
			BigInteger val = lcm.divide(ai);
			ans = ans.add(val);
			ans = ans.mod(m);
		}
		System.out.println(ans);
	}
}
