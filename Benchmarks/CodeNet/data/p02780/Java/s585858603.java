import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		double max = 0;
		double tail;
		for (int i = 0; i < K; i++) {
			tail = 0.5 * (P[i] + 1);
			max += tail;
		}
		double prev = max;
		for (int i = K; i < N; i++) {
			prev -= 0.5 * (P[i - K] + 1);
			prev += 0.5 * (P[i] + 1);
			max = Math.max(prev, max);
		}
		System.out.println(max);
	}


}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}