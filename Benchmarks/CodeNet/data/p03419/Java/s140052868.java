import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N == 1 && M == 1) {
			System.out.println(1);
		} else if (N == 1) {
			System.out.println(M - 2);
		} else if (M == 1) {
			System.out.println(N - 2);
		} else if (N > 3 && M > 3) {
			System.out.println((N - 2L) * (M - 2L));
		} else {
			System.out.println(0);
		}
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}