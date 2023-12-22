import java.util.Scanner;

class MathUtil {
	public static long gcd(long x, long y) {
		if(x == 0) return y;
		if(y == 0) return x;
		if(x >= y) {
			return gcd(y, x % y);
		} else {
			return gcd(x, y % x);
		}
	}
}

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long x = in.nextInt();
		long y = in.nextInt();
		System.out.println(MathUtil.gcd(x, y));
	}
}