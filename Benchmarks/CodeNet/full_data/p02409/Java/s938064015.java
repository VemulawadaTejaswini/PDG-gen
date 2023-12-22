import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int[][] A = new int[3][10];
		int[][] B = new int[3][10];
		int[][] C = new int[3][10];
		int[][] D = new int[3][10];

		for(int i =0; i<3;i++){
			for(int j = 0; j<10; j++){
				A[i][j] =0;
				B[i][j] =0;
				C[i][j] =0;
				D[i][j] =0;
			}

		}

		int n = scane.nextInt();
		int b, f, r, v;

		for (int i = 0; i < n; i++) {
			b = scane.nextInt();
			f = scane.nextInt();
			r = scane.nextInt();
			v = scane.nextInt();

			if (b == 1) {
				A[f - 1][r - 1] = A[f - 1][r - 1]+v;
			} else if (b == 2) {
				B[f - 1][r - 1] = B[f - 1][r - 1]+v;
			} else if (b == 3) {
				C[f - 1][r - 1] = C[f - 1][r - 1]+v;
			} else if (b == 4) {
				D[f - 1][r - 1] = D[f - 1][r - 1]+v;
			}
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(" " + A[i][j]);
			}
			System.out.println("");
		}
		for (int i = 0; i < 20; i++) {
			System.out.print("#");
		}
		System.out.println("");


		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(" " + B[i][j]);
			}
			System.out.println("");
		}
		for (int i = 0; i < 20; i++) {
			System.out.print("#");
		}
		System.out.println("");

		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				System.out.print(" " + C[i][j]);
			}
			System.out.println("");
		}
		for (int i = 0; i < 20; i++) {
			System.out.print("#");
		}
		System.out.println("");


		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D[0].length; j++) {
				System.out.print(" " + D[i][j]);
			}
			System.out.println("");
		}



	}
}