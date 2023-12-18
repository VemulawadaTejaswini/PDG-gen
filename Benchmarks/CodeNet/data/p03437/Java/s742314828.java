import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		if (x % y == 0) {
			System.out.println(-1);
			return;
		}
		long a = gcd(x, y);
		System.out.println(x / a * y - x);
	}
	
	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
}
