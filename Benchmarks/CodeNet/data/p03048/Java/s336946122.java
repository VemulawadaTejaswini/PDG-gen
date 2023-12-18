import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int R = sc.nextInt();
		int G = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int count = 0;
		for (int i = 0; ; i++) {
			int r = R * i;
			if (N < r) break;
			int left = N - r;
			for (int j = 0; ; j++) {
				int g = G * j;
				if (left < g) break;
				int b = left - g;
				if (b % B != 0) continue;
				count += 1;
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