import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long gcd = gcd(a, b);
			int ans = 1;
			for (long i = 2; i <= gcd; i++) {
				if (gcd % i == 0) {
					gcd = divide(gcd, i);
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}

	static long divide(long a, long b) {
		while ((a % b) == 0) {
			a = a / b;
		}
		return a;
	}
}