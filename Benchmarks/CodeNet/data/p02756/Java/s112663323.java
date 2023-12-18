import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		int Q = sc.nextInt();
		StringBuilder sb = new StringBuilder(S);
		int st = 1;
		for (int i = 0; i < Q; i++) {
			int T = sc.nextInt();
			switch (T) {
				case 1: {
					st *= -1;
					break;
				}
				case 2: {
					int F = sc.nextInt();
					int f = (F * 2 - 3) * st;
					String C = sc.next();
					switch (f) {
						case -1: {
							sb.insert(0, C);
							break;
						}
						case 1: {
							sb.append(C);
						}
					}
				}
			}
		}
		System.out.println((st > 0 ? sb : sb.reverse()).toString());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}