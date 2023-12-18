import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int position = 0;
		int prev = 0;
		while (position < S.length()) {
			String current = S.substring(position);
			// debug(current);
			if (current.startsWith("dream")) {
				position += "dream".length();
				prev = 1;
			} else if (current.startsWith("er")) {
				position += "er".length();
				if (prev == 2) {
					prev = 4;
				} else {
					prev = 2;
				}
			} else if (current.startsWith("aser")) {
				if (prev != 2 && prev != 4) {
					System.out.println("NO");
					return;
				}
				position += "aser".length();
				prev = 3;
			} else if (current.startsWith("ase")) {
				if (prev != 2 && prev != 4) {
					System.out.println("NO");
					return;
				}
				position += "ase".length();
				prev = 3;
			} else {
				System.out.println("NO");
				return;
			}
		}

		if (prev == 4) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}
}
