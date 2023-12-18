import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int n = sc.nextInt();
		String S = sc.next();

		char[] chars = S.toCharArray();
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		for (char c : chars) {
			if (c == '(') {
				counter++;
			} else if (counter <= 0) {
				sb.append('(');
			} else counter--;
		}
		sb = new StringBuilder(sb + S);
		for (int i = 0; i < counter; i++) {
			sb.append(')');
		}

		System.out.println(sb);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}