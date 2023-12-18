import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int X1 = sc.nextInt();
		int Y1 = sc.nextInt();
		int X2 = sc.nextInt();
		int Y2 = sc.nextInt();

		int X3 = X2 + (Y1 - Y2);
		int Y3 = Y2 + (X2 - X1);
		int X4 = X3 + (X1 - X2);
		int Y4 = Y3 + (Y1 - Y2);

		System.out.printf("%d %d %d %d\n", X3, Y3, X4, Y4);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}