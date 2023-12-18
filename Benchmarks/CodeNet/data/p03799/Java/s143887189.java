import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long N = sc.nextLong();
		long M = sc.nextLong();
		long m = M - N - N;
		if (m < 0) {
			System.out.println(M / 2);
		}else {
			System.out.println(N + m / 4);
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