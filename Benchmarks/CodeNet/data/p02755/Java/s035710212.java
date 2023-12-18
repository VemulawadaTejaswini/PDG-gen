import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		for (int i = 1; i <= 20000; i++) {
			int ea = Math.floorDiv(i * 8, 100);
			int eb = Math.floorDiv(i * 10, 100);
			if (ea == A && eb == B){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}