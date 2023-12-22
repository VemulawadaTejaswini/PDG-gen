import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int a1 = sc.nextInt();
			int m1 = sc.nextInt();
			int a2 = sc.nextInt();
			int m2 = sc.nextInt();
			int a3 = sc.nextInt();
			int m3 = sc.nextInt();
			if ((a1 | m1 | a2 | m2 | a3 | m3) == 0)
				break;
			int x = 1;
			int y = 1;
			int z = 1;
			long ans = 0;
			long t1 = 0;
			long t2 = 0;
			long t3 = 0;
			while (true) {
				t1++;
				x = a1 * x % m1;
				if (x == 1)
					break;
			}
			while (true) {
				t2++;
				y = a2 * y % m2;
				if (y == 1)
					break;
			}
			while (true) {
				t3++;
				z = a3 * z % m3;
				if (z == 1)
					break;
			}
			ans = (t1 * t2 / gcd(t1, t2));
			ans = ans * t3 / gcd(ans, t3);
			System.out.println(ans);
		}
	}

	public static long gcd(long a, long b) {
		if (a < b) {
			long c = a;
			a = b;
			b = c;
		}
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}