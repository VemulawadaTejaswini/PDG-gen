import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		sc.close();

		int a = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
		int n2 = n / a;
		int m2 = m / a;
		for (int i = 0; i < a; i++) {
			if (s.charAt(n2 * i) != t.charAt(m2 * i)) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println((long) n2 * m2 * a);
	}
}
