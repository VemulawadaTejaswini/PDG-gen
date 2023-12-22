import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] sheet = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sheet[i][j] =  sc.nextInt();
			}
		}

		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c; j++) {
				sheet[i][c] += sheet[i][j];
			}
		}

		for (int i = 0; i < r ; i++) {
			for (int j = 0; j < c + 1; j++) {
				sheet[r][j] += sheet[i][j];
			}
		}

		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(sheet[i][j]);

				if (j < c) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		sc.close();

	}

}

