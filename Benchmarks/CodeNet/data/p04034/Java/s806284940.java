import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] boxes = new int[N];
		Arrays.fill(boxes, 1);
		BitSet red = new BitSet(N);
		red.set(0);
		for (int i = 0; i < M; i++) {
			int x = Integer.parseInt(sc.next()) - 1;
			int y = Integer.parseInt(sc.next()) - 1;
			if (boxes[x] > 0) {
				boxes[x] -= 1;
				boxes[y] += 1;
				if (red.get(x)) {
					red.set(y);
					red.set(x, boxes[x] > 0);
				}
			}
		}
		System.out.println(red.cardinality());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}