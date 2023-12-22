import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			System.out.printf("Case %d:\n", t);
			solve();
		}
	}
	void solve() {
		int x = sc.nextInt();
		int n = 4;
		for (int step = 0; step < 10; step++) {
			String s = String.format("%08d", x * x).substring(2, 6);
			x = Integer.parseInt(s, 10);
			System.out.println(x);
		}
	}
}