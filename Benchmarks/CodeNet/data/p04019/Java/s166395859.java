import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();

		int[] cnt = new int[4];

		for (char c : s) {
			if (c == 'N') {
				cnt[0]++;
			} else if (c == 'S') {
				cnt[1]++;
			} else if (c == 'W') {
				cnt[2]++;
			} else if (c == 'E') {
				cnt[3]++;
			}
		}

		if ((cnt[0] == 0 && cnt[1] != 0)
				|| (cnt[0] != 0 && cnt[1] == 0)
				|| (cnt[2] == 0 && cnt[3] != 0)
				|| (cnt[2] != 0 && cnt[3] == 0)) {
			pr.println("No");
		} else {
			pr.println("Yes");
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
