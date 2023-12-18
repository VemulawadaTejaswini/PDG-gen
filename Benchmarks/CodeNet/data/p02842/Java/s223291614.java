import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int i = sc.nextInt();
		double v = i / 1.08;
		double ceil = Math.ceil(v);
		double floor = Math.floor(v);
		if (Math.floor(ceil * 1.08) == i) {
			System.out.println((int) ceil);
		} else if (Math.floor(floor * 1.08) == i) {
			System.out.println((int) floor);
		} else {
			System.out.println(":(");
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