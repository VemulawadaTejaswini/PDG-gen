import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (C == 0){
			System.out.println("YES");
			return;
		}

		int gcd = gcd(A, B);

		System.out.println(C % gcd == 0 ? "YES" : "NO");
	}

	int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}