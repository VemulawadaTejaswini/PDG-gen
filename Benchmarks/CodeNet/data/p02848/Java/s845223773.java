import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String S = sc.next();
		char[] chars = S.toCharArray();
		char[] result = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			result[i] = (char) ((c - 'A' + N) % 26 + 'A');
		}
		System.out.println(String.copyValueOf(result));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}