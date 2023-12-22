import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();
		long y = sc.nextLong();

		sc.close();

		if(y > x) {
			long tmp;
			tmp = x;
			x = y;
			y = tmp;
		}

		long ans = gcd(x, y);

		System.out.println(ans);
	}

	private static long gcd(long x, long y) {

		if(y == 0) return x;

		return gcd(y, x%y);

	}
}