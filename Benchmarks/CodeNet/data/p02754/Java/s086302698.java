import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int times = N / (A + B);
		int m = N % (A + B);
		System.out.println(times * A + Math.min(m, A));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}