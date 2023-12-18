import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long total = 0;
		if (m < 2 * n) {
			total = m / 2;
		} else {
			total = n;
			m -= n * 2;
			total += m / 4;
		}
		System.out.println(total);
	}
}
