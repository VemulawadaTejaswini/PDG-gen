import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long t1 = sc.nextLong();
		long t2 = sc.nextLong();
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong();
		long b2 = sc.nextLong();
		sc.close();

		if (a1 > b1) {
			long z = a1;
			a1 = b1;
			b1 = z;
			z = a2;
			a2 = b2;
			b2 = z;
		}

		long c1 = a1 * t1;
		long c2 = a2 * t2;
		long d1 = b1 * t1;
		long d2 = b2 * t2;
		long c = c1 + c2;
		long d = d1 + d2;
		if (c == d) {
			System.out.println("infinity");
			return;
		}
		if (c < d) {
			System.out.println(0);
			return;
		}

		long x1 = d1 - c1;
		long x = c - d;
		long ans = 1;
		ans += x1 / x * 2;
		if (x1 % x == 0) {
			ans--;
		}
		System.out.println(ans);
	}
}
