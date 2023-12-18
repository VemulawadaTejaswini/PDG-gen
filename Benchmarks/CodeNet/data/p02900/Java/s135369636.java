import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long gcd = gcd(a, b);
			long bk = (long) Math.sqrt(gcd);
			int ans = 0;
			if (gcd % 2 == 0) {
				gcd = divide(gcd, 2);
				ans++;
			}
			for (long i = 3; i <= bk + 1; i = i + 2) {
				if (gcd % i == 0) {
					gcd = divide(gcd, i);
					ans++;
				}
			}
			ans = ans * 2 + 1;
			if (ans == 1 && gcd != 1) {
				ans++;
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