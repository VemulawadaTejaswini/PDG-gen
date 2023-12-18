import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		int count = 0;
		int startsWithB = 0;
		int endsWithA = 0;
		for (String s : S) {
			char[] chars = s.toCharArray();
			boolean flag = false;
			if (chars[chars.length - 1] == 'A') {
				if (startsWithB > 0) {
					count++;
					startsWithB--;
				} else {
					flag = true;
				}
			}
			if (chars[0] == 'B') {
				if (endsWithA > 0) {
					count++;
					endsWithA--;
				} else {
					startsWithB++;
				}
			}
			if (flag) endsWithA++;
			for (int j = 1; j < chars.length; j++) {
				if (chars[j - 1] == 'A' && chars[j] == 'B') {
					count += 1;
				}
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