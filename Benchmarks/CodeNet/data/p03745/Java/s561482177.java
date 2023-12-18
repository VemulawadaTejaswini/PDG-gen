import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		if (N == 1) {
			System.out.println(1);
			return;
		}
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int mp = Integer.signum(A[0] - A[1]);
		int count = 1;
		for (int i = 1; i < A.length; i++) {
			int sig = Integer.signum(A[i - 1] - A[i]);
			if (mp * sig < 0) {
				count++;
				mp = 0;
			} else if (mp == 0) {
				mp = sig;
			}
		}
		System.out.println(count);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}