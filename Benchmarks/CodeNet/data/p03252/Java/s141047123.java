import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		String T = sc.next();
		char[] enc = new char['z' - 'a' + 1];
		char[] dec = new char['z' - 'a' + 1];
		char[] sa = S.toCharArray();
		char[] ta = T.toCharArray();
		for (int i = 0; i < sa.length; i++) {
			char s = sa[i];
			char t = ta[i];
			char es = enc[s - 'a'];
			char dt = dec[t - 'a'];
			if (es == 0 && dt == 0) {
				enc[s - 'a'] = t;
				dec[t - 'a'] = s;
			} else if (es != t || dt != s) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}