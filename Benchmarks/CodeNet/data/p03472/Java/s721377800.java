import java.util.Arrays;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		int[] spcs = new int[N];
		int maxAtk = 0;
		for (int i = 0; i < N; i++) {
			maxAtk = Math.max(maxAtk, Integer.parseInt(sc.next()));
			spcs[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(spcs);
		long sum = 0;
		int count = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (sum >= H) break;
			if (spcs[i] <= maxAtk) break;

			sum += spcs[i];
			count += 1;
		}
		System.out.println(count + -Math.floorDiv(-Math.max(H - sum, 0), maxAtk));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}