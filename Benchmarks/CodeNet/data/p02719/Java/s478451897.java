import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long N = Long.parseLong(sc.next());
		long K = Long.parseLong(sc.next());
		if (N == 0) {
			System.out.println(N);
			return;
		}
		if (N % K == 0) {
			System.out.println(0);
			return;
		}

		System.out.println(gcd(N, K));
	}

	long gcd(long a, long b) {
	    return b == 0 ? a : gcd(b, a % b);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}