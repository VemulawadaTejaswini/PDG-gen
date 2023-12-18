import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] A = new int[3 * N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		long sum = 0;
		for (int i = N; i < A.length; i+=2) {
			sum += A[i];
		}
		System.out.println(sum);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}