import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long x = getCount(a - 1, c, d);
		long y = getCount(b, c, d);
		System.out.println(b - a + 1 - (y - x));
	}
	
	static long getCount(long x, long y, long z) { // x以内で、yかzで割り切れる数
		long ans = x / y;
		ans += x / z;
		ans -= x / (y * z / gcd(y, z));
		return ans; 
	}
	
	static long gcd(long x, long y) {
		if (x % y == 0) {
			return y;
		}
		return gcd(y, x % y);
	}
}
