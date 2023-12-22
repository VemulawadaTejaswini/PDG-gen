import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, A, B;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			A = sc.nextInt();
			B = sc.nextInt();
			int gcd = gcd(A, B);
			System.out.println(N - count(N / gcd, A / gcd, B / gcd));
		}
	}

	static int count(int n, long a, long b) {
		int ret = 0;
		for (long i = 0; i <= n && i < a * b; i += a) {
			ret += (Math.min(a * b - 1, n) - i) / b + 1;
		}
		if (n >= a * b) {
			ret += n - a * b + 1;
		}
		return ret - 1;
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}