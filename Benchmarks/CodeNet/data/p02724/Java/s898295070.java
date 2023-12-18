import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int X = sc.nextInt();
		int h500 = Math.floorDiv(X, 500);
		int h5 = Math.floorDiv(X - 500 * h500, 5);
		System.out.println(h500 * 1000 + h5 * 5);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}