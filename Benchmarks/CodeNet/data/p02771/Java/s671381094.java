import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if ((A == B && B != C) || (C == B && B != A) || (A == C && C != B)){
			System.out.println("Yes");
		} else System.out.println("No");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}