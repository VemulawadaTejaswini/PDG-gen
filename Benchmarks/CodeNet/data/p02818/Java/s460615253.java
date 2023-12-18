import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		long tak = A - K;
		if (tak < 0) {
			System.out.println(0 + " " + Math.max(B + tak, 0));
		} else {
			System.out.println(tak + " " + B);
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