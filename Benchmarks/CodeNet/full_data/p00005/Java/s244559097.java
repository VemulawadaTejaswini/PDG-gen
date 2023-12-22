import java.util.*;
public class R48p1 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		long x, y;
		while (in.hasNext()) {
			x = in.nextLong();
			y = in.nextLong();
			System.out.println(gcd(x, y) + " " + lcm(x, y));
		}
	}
	static long gcd(long x, long y) {
		if (y == 0)
			return x;
		return gcd(y, x%y);
	}

	static long lcm(long a, long b) {
		return (a*b)/gcd(a, b);
	}
}