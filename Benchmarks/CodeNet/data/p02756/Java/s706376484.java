import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		int Q = sc.nextInt();
		StringBuilder sb = new StringBuilder(S);
		for (int i = 0; i < Q; i++) {
			int T = sc.nextInt();
			switch (T) {
				case 1: {
					sb.reverse();
					break;
				}
				case 2: {
					int F = sc.nextInt();
					String C = sc.next();
					switch (F) {
						case 1: {
							sb.insert(0, C);
							break;
						}
						case 2: {
							sb.append(C);
						}
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}