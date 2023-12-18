import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int r1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		int r2 = scanner.nextInt() + 1;
		int c2 = scanner.nextInt() + 1;

		long sum = f(r2, c2) - f(r1, c2) - f(r2, c1) + f(r1, c1);

		while (sum < 0)
			sum += PRIME;

		System.out.println(sum);

		scanner.close();
	}

	static long f(int r, int c) {
		long denom = fact(r) * fact(c);
		denom %= PRIME;

		return fact(r + c) * inverse(denom) % PRIME;
	}

	static long fact(int n) {
		if (n == 1)
			return 1;
		return fact(n - 1) * n % PRIME;
	}

	static int inverse(long denom) {
		if (denom == 0)
			return 0;

		int a = PRIME;
		int b = (int) denom;
		int x = 0;
		int y = 1;
		int temp;

		while (a % b != 0) {
			x -= a / b * y;
			temp = x;
			x = y;
			y = temp;
			temp = a % b;
			a = b;
			b = temp;
		}

		//		while (y < 0)
		//			y += PRIME;

		return y;
	}

	static final int PRIME = 1000000007;
}
