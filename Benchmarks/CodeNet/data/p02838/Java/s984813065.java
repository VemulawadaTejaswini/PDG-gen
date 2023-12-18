import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		
		long[] xor = new long[N];
		for (int i = 1; i < A.length; i++) {
			xor[i] = (A[i - 1] ^ A[i]) % 1000000007;
		}

		long sum = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				sum += xor[j];
				sum %= 1000000007;
			}
		}
		System.out.println(sum % 1000000007);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}