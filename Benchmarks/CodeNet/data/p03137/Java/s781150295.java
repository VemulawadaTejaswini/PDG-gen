import java.util.Arrays;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}

		if (M <= N) {
			System.out.println(0);
			return;
		}

		Arrays.sort(X);

		int[] diff = new int[M - 1];
		for (int i = 1; i < X.length; i++) {
			diff[i - 1] = X[i] - X[i - 1];
		}

		Arrays.sort(diff);

		int sum = 0;
		for (int i = 0; i < diff.length - N + 1; i++) {
			sum += diff[i];
		}

		System.out.println(sum);;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}