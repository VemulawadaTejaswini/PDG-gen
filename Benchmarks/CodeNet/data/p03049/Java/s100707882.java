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
		int ba = 0;
		int startsWithB = 0;
		int endsWithA = 0;
		for (String s : S) {
			char[] chars = s.toCharArray();
			boolean sb = chars[0] == 'B';
			boolean ea = chars[chars.length - 1] == 'A';

			if (sb && ea) {
				ba += 1;
			} else if (sb) {
				startsWithB += 1;
			} else if (ea) {
				endsWithA += 1;
			}

			for (int j = 1; j < chars.length; j++) {
				if (chars[j - 1] == 'A' && chars[j] == 'B') {
					count += 1;
				}
			}
		}
		count += Math.max(ba - 1, 0);
		if (endsWithA > 0 && startsWithB > 0 && ba > 0) {
			count += 2;
			endsWithA -= 1;
			startsWithB -= 1;
		} else {
			count += Math.abs(endsWithA - startsWithB) > 0 ? Math.min(ba, 1) : 0;
		}
		count += Math.min(endsWithA, startsWithB);
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