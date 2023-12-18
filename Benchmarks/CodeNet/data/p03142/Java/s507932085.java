import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] ans = new int[n + 1][n + 1];
		for (int i = 0; i < n + m - 1; i++) {
			ans[scan.nextInt()][scan.nextInt()] = 1;
		}
		for (int i = 1; i < ans[0].length; i++) {
			int receiver = 0;
			for (int j = 1; j < ans.length; j++) {
				if (ans[j][i] != 0) {
					ans[j][i] = max(ans, i, j);
				}
				if (ans[j][i] > ans[receiver][i]) {
					receiver = j;
				}
			}
			System.out.println(receiver);
		}
		scan.close();
	}

	private static int max(int[][] ans, int col, int row) {
		for (int i = 1; i < ans.length; i++) {
			if (ans[i][col] != 0) {
				return 1 + max(ans, row, i);
			}
		}
		return 1;
	}
}
