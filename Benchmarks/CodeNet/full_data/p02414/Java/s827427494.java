import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] b = new int[m][l];
		long[][] c = new long[n][l];

		A = inputMat(A);
		b = inputMat(b);

		vec_multi(A, b, c);
		sc.close();


	}

	public static int[][] inputMat(int[][] a) {
		int[][] mat = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		return mat;
	}

	public static void vec_multi(int[][] a, int[][] b, long[][] c) {

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j]);

					if (j < c[0].length - 1) {
						System.out.print(" ");
					}
			}
			System.out.println();
		}



	}


}

