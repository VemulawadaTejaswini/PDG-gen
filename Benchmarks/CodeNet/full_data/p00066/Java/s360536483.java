import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			char[] s = sc.next().toCharArray();
			int[][] a = new int[3][3];
			for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) {
				int k = 0;
				if (s[i * 3 + j] == 'o') k = 1;
				if (s[i * 3 + j] == 'x') k = 2;
				a[i][j] = k;
			}
			System.out.println(solve(a));
		}
	}
	char solve(int[][] a) {
		char[] s = {'d', 'o', 'x'};
		for (int side = 1; side <= 2; side++) {
			for (int i = 0; i < 3; i++) {
				if (a[i][0] == side && a[i][1] == side && a[i][2] == side) return s[side];
				if (a[0][i] == side && a[1][i] == side && a[2][i] == side) return s[side];
			}
			if (a[0][0] == side && a[1][1] == side && a[2][2] == side) return s[side];
			if (a[0][2] == side && a[1][1] == side && a[2][0] == side) return s[side];
		}
		return 'd';
	}
}