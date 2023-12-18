import java.util.Scanner;
import java.util.function.LongUnaryOperator;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		int C = sc.nextInt();
		int D = sc.nextInt();
		long lcm = (long) C * D / gcd(C, D);
		LongUnaryOperator f = x -> (x / C) + (x / D) - (x / lcm);
		long b = f.applyAsLong(B);
		long a = f.applyAsLong(A - 1);
		System.out.println((B - (A - 1)) - (b - a));
	}

	int gcd(int a, int b) {
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