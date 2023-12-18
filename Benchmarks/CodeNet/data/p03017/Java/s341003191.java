import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	final int N, A, B, C, D;
	final char[] S;
	final Set<String> checked = new HashSet<String>();

	Main(int n, int a, int b, int c, int d, char[] s) {
		N = n;
		A = a;
		B = b;
		C = c;
		D = d;
		S = s;
	}

	public static void main(String[] args) {
		Main m;
		try (Scanner s = new Scanner(System.in)) {
			m = new Main(s.nextInt(),
					s.nextInt(),
					s.nextInt(),
					s.nextInt(),
					s.nextInt(),
					s.next().toCharArray());
		}

		if (m.move(m.A, m.B)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	boolean move(int a, int b) {
		if (a == C && b == D) {
			return true;
		}

		if ((a < b && checked.contains("*," + b)) || (a > b && checked.contains(a + ",*"))) {
			return false;
		}

		if (a > C) {
			return false;
		}

		if (b > D) {
			return false;
		}

		if (a == b) {
			return false;
		}

		if (S[b - 1] == '#') {
			return false;
		}

		if (S[a - 1] == '#') {
			return false;
		}

		boolean x = move(a + 2, b);
		if (!x) {
			if (a >= b) {
				checked.add((a + 2) + ",*");
			}
			x = move(a, b + 2);
		}
		if (!x) {
			if (a <= b) {
				checked.add("*," + (b + 2));
			}
			x = move(a + 1, b);
		}
		if (!x) {
			if (a >= b) {
				checked.add((a + 1) + ",*");
			}
			x = move(a, b + 1);
		}
		if (!x) {
			if (a <= b) {
				checked.add("*," + (b + 1));
			}
		}
		return x;
	}
}
