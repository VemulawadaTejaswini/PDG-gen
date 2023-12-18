import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int mina = Integer.MAX_VALUE;
		for (int i = 0; i < A; i++) {
			a[i] = sc.nextInt();
			mina = Math.min(mina, a[i]);
		}
		int minb = Integer.MAX_VALUE;
		for (int i = 0; i < B; i++) {
			b[i] = sc.nextInt();
			minb = Math.min(minb, b[i]);
		}
		int min = mina + minb;
		for (int i = 0; i < M; i++) {
			int f = a[sc.nextInt() - 1];
			int r = b[sc.nextInt() - 1];
			min = Math.min(f + r - sc.nextInt(), min);
		}
		System.out.println(min);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}