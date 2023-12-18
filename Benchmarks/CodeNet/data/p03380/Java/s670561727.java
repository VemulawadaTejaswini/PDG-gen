import java.util.Arrays;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);

		int max = A[N - 1];
		int r = -1;
		int actual = -1;
		for (int i = 0; i < A.length - 1; i++) {
			int calc = max / 2 < A[i] ? max - A[i] : A[i];
			if (calc > r) {
				r = calc;
				actual = A[i];
			}
		}
		System.out.printf("%d %d\n", max, actual);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}