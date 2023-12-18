import java.util.*;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		Arrays.setAll(A, $ -> Integer.parseInt(sc.next()));
		Arrays.sort(A);

		int target = A[0];
		int streak = 0;
		long sum = 0;
		for (int i : A) {
			if (i == target) {
				streak++;
				continue;
			}
			sum += target > streak ? streak : streak - target;
			target = i;
			streak = 1;
		}
		System.out.println(sum + (target > streak ? streak : streak - target));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}