import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int Z = Integer.parseInt(sc.next());
		System.out.printf("%d %d %d\n", Z, X, Y);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}