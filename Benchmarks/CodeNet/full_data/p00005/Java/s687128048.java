import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b, c, GCD, LCM, a_base, b_base;
		while (sc.hasNext()) {
			a = sc.nextLong();
			b = sc.nextLong();
			a_base = a;
			b_base = b;
			if (a < b) {
				long sub;
				sub = a;
				a = b;
				b = sub;
			}
			GCD = gcd(a, b);
			LCM = (a_base * b_base) / GCD;
			System.out.println(GCD + " " + LCM);
		}
	}
	static long gcd(long a, long b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);
	}
}