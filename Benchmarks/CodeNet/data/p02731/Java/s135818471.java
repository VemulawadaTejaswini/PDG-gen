import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int L = sc.nextInt();
		double l = L / 3.0;
		System.out.printf("%f\n", l * l * l);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}