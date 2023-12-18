import java.util.BitSet;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] penalties = new int[N];
		BitSet set = new BitSet(N);
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt() - 1;
			boolean s = sc.next().equals("AC");
			if (s) {
				set.set(p);
			}
			if (!set.get(p)) {
				penalties[p]++;
			}
		}

		int sum = 0;
		for (int i = set.nextSetBit(0); i >= 0; i = set.nextSetBit(i + 1)) {
			sum += penalties[i];
		}
		System.out.println(set.cardinality());
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