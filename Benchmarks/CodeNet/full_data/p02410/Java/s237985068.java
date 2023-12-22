import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				a[i][j] = scanner.nextInt();
			}
		}
		int[] b = new int[m];
		for (int i = 0; i < m; ++i) {
			b[i] = scanner.nextInt();
		}
		int result[] = new int[n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				result[i] += a[i][j] * b[j];
			}
		}
		for (int i : result) {
			System.out.printf("%d\n", i);
		}
	}
}

