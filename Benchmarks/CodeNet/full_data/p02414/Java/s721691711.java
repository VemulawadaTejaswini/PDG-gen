import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		int[][] C = new int[n][l];
		int i, j, k = 0;
		int sum = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < l; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < l; j++) {
				for (k = 0; k < m; k++) {
					sum += A[i][k] * B[k][j];
				}
				C[i][j] = sum;
				sum = 0;
				if (j == l - 1) {
					System.out.print(C[i][j]);
				} else {
					System.out.print(C[i][j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
