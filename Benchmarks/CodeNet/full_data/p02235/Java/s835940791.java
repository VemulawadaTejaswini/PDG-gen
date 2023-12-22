
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			String s1 = scanner.next();
			String s2 = scanner.next();
			System.out.println(lcs(s1, s2));
		}
	}

	private int lcs(String x, String y) {
		int max = Math.max(x.length(), y.length());
		int[][] c = new int[max + 1][max + 1];
		int m = x.length();
		int n = y.length();
		int maxl = 0;
		x = ' ' + x;
		y = ' ' + y;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (x.charAt(i) == y.charAt(j)) {
					c[i][j] = c[i - 1][j - 1] + 1;
				} else {
					c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
				}
				maxl = Math.max(maxl, c[i][j]);
			}
		}
		return maxl;
	}
}