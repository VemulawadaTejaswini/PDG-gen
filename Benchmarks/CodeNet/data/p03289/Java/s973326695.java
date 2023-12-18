import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();

		if (s[0] != 'A') {
			pr.println("WA");
		} else {
			int cnt = 0;
			for (int i = 2; i < s.length - 1; i++) {
				if (s[i] == 'C') {
					cnt++;
				}
			}

			if (cnt != 1) {
				pr.println("WA");
			} else {
				int cp = 0;
				for (char c : s) {
					if (c >= 'A' && c <= 'Z') {
						cp++;
					}
				}
				
				if (cp != 2) {
					pr.println("WA");
				} else {
					pr.println("AC");
				}
			}
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(INPUT == null ? System.in : new ByteArrayInputStream(INPUT.getBytes()));
		pr = new Printer(System.out);

		solve();

//		pr.close();
		pr.flush();
//		sc.close();
	}

	static String INPUT = null;

	private static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
