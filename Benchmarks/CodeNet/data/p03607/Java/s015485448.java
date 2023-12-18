import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		Set<Integer> paper = new HashSet<>(N);
		for (int i = 0; i < N; i++) {
			Integer A = sc.nextInt();
			if (paper.contains(A)) {
				paper.remove(A);
			} else {
				paper.add(A);
			}
		}
		System.out.println(paper.size());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}