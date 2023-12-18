import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if (n == m) {
			System.out.println((kaijo(n) * kaijo(m) * 2) % MOD);
		} else if (Math.abs(m - n) == 1) {
			System.out.println((kaijo(n) * kaijo(m)) % MOD);
		} else {
			System.out.println(0);
		}
	}
	
	static long kaijo(long n) {
		if (n == 1) {
			return 1;
		} else {
			return n * kaijo(n - 1) % MOD;
		}
	}
}
