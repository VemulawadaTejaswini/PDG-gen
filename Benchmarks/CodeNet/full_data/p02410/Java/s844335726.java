import java.util.Scanner;

public class Main {

		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] A = new int[n][m];
		int[][] b = new int[m][1];
		int[][] c = new int[n][1];

		A = inputMat(A);
		b = inputMat(b);

		vec_multi(A, b, c);
		sc.close();


	}

	private static int[][] inputMat(int[][] a) {
		int[][] mat = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		return mat;
	}

	private static void vec_multi(int[][] a, int[][] b, int[][] c) {

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][0] += a[i][j] * b[j][0];
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i][0]);
		}

	}


}

