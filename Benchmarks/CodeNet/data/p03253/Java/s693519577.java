import java.util.Scanner;

public class Main {

	private static int M = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		long m = sc.nextInt();
		long answer = 1;

		for (int i = 2; i * i <= m; i++) {
			if (m % i != 0) continue;
			long t = 0;
			while (m % i == 0) {
				t++;
				m /= i;
			}
			answer = (answer * comb(t + n - 1, n - 1)) % M;
		}

		if (m != 1) answer = (answer * comb(n, n - 1)) % M;
		System.out.println(answer);
	}

	private static long comb(long a, long b) {
		if (b > a - b) return comb(a, a - b);

		long x = 1;
		long y = 1;
		for (int i = 0; i < b; i++) {
			x = (x * (a - i)) % M;
			y = (y * (i + 1)) % M;
		}

		return (x * pow(y, M - 2) % M);
	}

	private static long pow(long x, long n) {
		long a = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				a = (a * x) % M;
			}
			x = (x * x) % M;
			n >>= 1;
		}
		return a;
	}
}
