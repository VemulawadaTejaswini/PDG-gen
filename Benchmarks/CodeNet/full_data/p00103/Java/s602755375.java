import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	public void run() {
		int t = sc.nextInt();
		for (int tt = 0; tt < t; tt++) {
			solve();
		}
	}
	void solve() {
		int score = 0;
		int[] base = {0, 0, 0, 0};
		for (int out = 0; out < 3;) {
			String s = sc.next();
			if (s.equals("OUT")) {
				out++;
			} else if (s.equals("HIT")) {
				score += base[3];
				base[3] = base[2];
				base[2] = base[1];
				base[1] = 1;
			} else if (s.equals("HOMERUN")) {
				score += 1 + base[1] + base[2] + base[3];
				base[1] = base[2] = base[3] = 0; 
			}
		}
		System.out.println(score);
	}
}