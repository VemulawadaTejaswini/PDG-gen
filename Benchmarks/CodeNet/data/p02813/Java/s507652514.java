import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.function.Predicate;

class Solver {
	static final Solver INSTANCE = new Solver();
	private int[] P;
	private int[] Q;
	private int a;
	private int b;

	void permutation(int[] seed){
		int[] perm = new int[seed.length];
		buildPerm(seed, perm, new BitSet(seed.length), 0);
	}

	int idx;
	void buildPerm(int[] seed, int[] permutation, BitSet used, int index){
		if (index == seed.length) {
			idx++;
			if (Arrays.equals(permutation, P)) {
				a = idx;
			}
			if (Arrays.equals(permutation, Q)) {
				b = idx;
			}
			return;
		}

		for (int i = 0; i < seed.length; ++i) {
			if (used.get(i)) continue;
			permutation[index] = seed[i];
			used.set(i);
			buildPerm(seed, permutation, used, index + 1);
			used.flip(i);
		}
	}

	void solve(Scanner sc) {
		int N = sc.nextInt();
		P = new int[N];
		Q = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			Q[i] = sc.nextInt();
		}

		int[] R = new int[N];
		Arrays.setAll(R, i -> i + 1);
		permutation(R);
		System.out.println(Math.abs(a - b));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}