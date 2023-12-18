import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		long K = sc.nextLong() - 1;
		Pattern pattern = Pattern.compile("[2-9]");
		Matcher matcher = pattern.matcher(S);
		if (!matcher.find()) {
			System.out.println(1);
			return;
		}
		int first = matcher.start();
		if (K < first) {
			System.out.println(1);
		} else {
			System.out.println(S.charAt(first));
		}
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}