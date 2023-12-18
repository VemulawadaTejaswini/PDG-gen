import java.util.BitSet;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt() - 1;
		}

		BitSet touched = new BitSet(N);
		int i = A[0];
		int result = 0;
		while (i != 1){
			if (touched.get(i)) {
				System.out.println(-1);
				return;
			}

			touched.set(i);
			result++;
			i = A[i];
		}
		System.out.println(result + 1);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}