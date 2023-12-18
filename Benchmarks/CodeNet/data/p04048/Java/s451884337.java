import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long x = in.nextLong();

		if (x * 2 > n) {
			x = n - x;
		}

		System.out.println(3 * (n - gcd(n, x)));
		in.close();

	}

	static long gcd(long a, long b) {

		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

}