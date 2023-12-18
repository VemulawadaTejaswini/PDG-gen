import java.util.Arrays;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int K = sc.nextInt();
		int T = sc.nextInt();
		int[] A = new int[T];
		for (int i = 0; i < T; i++) {
			A[i] = sc.nextInt();
		}
		if (T == 1) {
			System.out.println(A[0] - 1);
			return;
		}
		Arrays.sort(A);
		System.out.println(Math.max((K - 1) - (K - A[T - 1]) * 2, 0));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}