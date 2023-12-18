import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int X = sc.nextInt();
		if (X < 100) {
			System.out.println(0);
			return;
		}

		int n = X / 100;
		int mod = X % 100;
		for (int i = 0; i < n; i++) {
			for (int j = 5; j > 0; j--) {
				if (mod < j) continue;
				mod -= j;
				break;
			}
			if (mod == 0){
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}