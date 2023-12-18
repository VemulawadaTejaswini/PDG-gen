
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(final String[] args) {
		@SuppressWarnings("resource")
		final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		final String S = in.next();
		String judge = solve(S);
		System.out.println(judge.trim());
	}

	public static boolean isPossibleMonth(String m) {
		final int val = Integer.parseInt(m);
		return val <= 12 && val >= 1;
	}

	static String solve(final String S) {
		final boolean headIsMonth = isPossibleMonth(S.substring(0, 2));
		final boolean tailIsMonth = isPossibleMonth(S.substring(2, 4));
		if (headIsMonth) {
			if (tailIsMonth) {
				return "AMBIGUOUS";
			} else {
				return "MMYY";
			}
		} else {
			if (tailIsMonth) {
				return "YYMM";
			} else {
				return "NA";
			}
		}
	}
}
