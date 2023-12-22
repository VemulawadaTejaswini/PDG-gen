import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static char[][] grid;
	private static String[][] dp;

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int N = scanner.nextInt();
			if (N == 0) {
				scanner.close();
				break;
			}
			int M = scanner.nextInt();

			grid = new char[M][N];
			dp = new String[M][N];
			for (int i = 0; i < grid.length; i++) {
				String line = scanner.next();
				for (int j = 0; j < grid[i].length; j++) {
					grid[i][j] = line.charAt(j);
					dp[i][j] = String.valueOf(grid[i][j]);
				}
			}

			String ans = "";
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (Character.getNumericValue(grid[i][j]) < 10) {
						ans = strMax(ans, dp[i][j]);
						if (i + 1 < grid.length
								&& Character.getNumericValue(grid[i + 1][j]) < 10) {
							dp[i + 1][j] = strMax(dp[i + 1][j], dp[i][j]
									+ String.valueOf(grid[i + 1][j]));
							ans = strMax(ans, dp[i + 1][j]);
						}
						if (j + 1 < grid[i].length
								&& Character.getNumericValue(grid[i][j + 1]) < 10) {
							dp[i][j + 1] = strMax(dp[i][j + 1], dp[i][j]
									+ String.valueOf(grid[i][j + 1]));
							ans = strMax(ans, dp[i][j + 1]);
						}
					}
				}
			}
			System.out.println(ans);
		}

	}

	static String strMax(String a, String b) {
		// 行頭の0を全て削除
		a = a.replaceAll("^0*", "");
		b = b.replaceAll("^0*", "");

		if (b.length() > a.length()
				|| (b.length() == a.length() && b.compareTo(a) > 0)) {
			// 桁数が大きいか、桁数が一緒でも辞書順で後ろならば、
			// その数字を採用する
			return b;
		} else {
			return a;
		}

	}

}