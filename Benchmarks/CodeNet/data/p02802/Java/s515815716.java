import java.util.BitSet;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int penalties = 0;
		BitSet set = new BitSet(N);
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			boolean s = sc.next().equals("AC");
			if (s) {
				set.set(p);
			}
			if (!set.get(p)) {
				penalties++;
			}
		}
		System.out.println(set.cardinality());
		System.out.println(penalties);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}