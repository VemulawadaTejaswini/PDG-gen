import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		if ((x + y) % 3 != 0) {
			System.out.println(0);
			return;
		}

		int z = (x + y) / 3;
		int a = 0;
		for (int i = 0; i <= z; i++) {
			int j = z - i;
			if (i + 2 * j == x && 2 * i + j == y) {
				a = i;
				break;
			}
		}
		System.out.println(nCr(z, a));
	}

	static long nCr(long n, long r) {
		long m = 1000000007;
		long val = 1;
		for (int i = 1; i <= r; i++) {
			val = val * (n - i + 1) % m;
			val = val * modinv(i, m) % m;
		}
		return val;
	}

	static long modinv(long a, long m) {
		long b = m;
		long u = 1;
		long v = 0;
		long tmp = 0;

		while (b > 0) {
			long t = a / b;
			a -= t * b;
			tmp = a;
			a = b;
			b = tmp;

			u -= t * v;
			tmp = u;
			u = v;
			v = tmp;
		}

		u %= m;
		if (u < 0) u += m;
		return u;
	}
}
