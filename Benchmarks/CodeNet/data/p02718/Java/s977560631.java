import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.next()));
		int sum = Arrays.stream(A).sum();
		long count = Arrays.stream(A).filter(i -> 4 * i * M >= sum).count();
		System.out.println(count < M ? "No" : "Yes");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}