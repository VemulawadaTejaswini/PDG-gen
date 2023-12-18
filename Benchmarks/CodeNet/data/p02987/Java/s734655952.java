import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();

		int[] cnt = new int[26];
		cnt[s[0] - 'A']++;
		cnt[s[1] - 'A']++;
		cnt[s[2] - 'A']++;
		cnt[s[3] - 'A']++;

		for (int i = 0; i < 26; i++) {
			if (cnt[i] != 0 && cnt[i] != 2) {
				pr.println("No");
				return;
			}
		}
		
		pr.println("Yes");
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
