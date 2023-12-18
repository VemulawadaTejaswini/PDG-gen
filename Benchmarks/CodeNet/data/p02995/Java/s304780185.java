import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		long a = sc.nextLong() - 1;
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long lcm = c * d / gcd(c, d);
		long ans = (b - a) - (b / c + b / d - b / lcm - (a / c + a / d - a / lcm));
		System.out.println(ans);
	}

	long gcd(long a, long b) {
		long w;
		while(b != 0) {
			w = a % b;
			a = b;
			b = w;
		}
		return a;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
