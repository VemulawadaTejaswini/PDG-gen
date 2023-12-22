import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		int A[][] = new int[n][m];
		int b[][] = new int[m][l];
		long c[][] = new long[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = scanner.nextInt();
			}
		}
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < l; k++) {
				b[j][k] = scanner.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < l; k++) {
				for (int j = 0; j < m; j++) {
					c[i][k] = A[i][j] * b[j][k]+c[i][k];
				}

			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < l; k++) {
				System.out.print(c[i][k]);
				if (k == l - 1) {
					System.out.println();
				} else {
					System.out.print(" ");
				}
			}
		}

	}
}

