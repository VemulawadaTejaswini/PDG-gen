import java.util.Arrays;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		int[] count = new int[3];
		char[] chars = S.toCharArray();
		if (chars.length == 1) {
			System.out.println("YES");
			return;
		}
		for (char ch : chars) {
			count[ch - 'a']++;
		}
		Arrays.sort(count);
		System.out.println(count[0] >= chars.length / 3 && count[2] <= chars.length / 2. ? "YES" : "NO");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}