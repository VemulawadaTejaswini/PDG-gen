import java.util.*;

public class Main{
	static long count = 0;
	static int r;
	static int c;
	static char[][] a;
	static long mod = (long) 1e9 + 7;

	public static long dp(int row, int col, int i, int j) {
		if (!valid(row, col)) {
			return 0;
		}
		if (a[i][j] == '#') {
			return 0;
		}
		if (row == r) {
			return 0;
		}
		if (row == r - 1 && col == c - 1) {
			count++;
		}
		long right = dp(row, col + 1, i, j + 1);
		long down = dp(row + 1, col, i + 1, j);
		return count%mod;

	}

	public static boolean valid(int row, int col) {
		return row < r && col < c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		a = new char[r][c];
		for (int i = 0; i < r; i++) {

			a[i] = sc.next().toCharArray();

		}
		System.out.println(dp(0, 0, 0, 0));

	}

}
