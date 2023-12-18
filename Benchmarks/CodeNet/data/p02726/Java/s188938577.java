import java.util.Scanner;
import java.util.StringJoiner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int X = sc.nextInt() - 1;
		int Y = sc.nextInt() - 1;
		int[] counter = new int[N - 1];
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int itoj = j - i;
				int i_x_y_j = Math.abs(X - i) + Math.abs(Y - j) + 1;
				int i_y_x_j = Math.abs(Y - i) + Math.abs(X - j) + 1;
				int min = Math.min(itoj, Math.min(i_x_y_j, i_y_x_j));
				counter[min - 1] += 1;
			}
		}
		StringJoiner out = new StringJoiner("\n");
		for (int x : counter) {
			out.add(String.valueOf(x));
		}
		System.out.println(out.toString());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}