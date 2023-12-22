

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		int column = in.nextInt();

		// ???????????????????´?????????????
		int[][] matrix = new int[line][column];
		// ????????????????????????????´?????????????
		int[] vector = new int[column];

		for(int l = 0; l < line; l++) {

			for(int c = 0; c < column; c++) {

				int column_num = in.nextInt();
				matrix[l][c] = column_num;

			}
		}

		for(int c = 0; c < column; c++) {

			int column_num = in.nextInt();
			vector[c] = column_num;

		}

		for(int l = 0; l < line; l++) {

			int ans = 0;

			for(int c = 0; c < column; c++) {

				ans += matrix[l][c] * vector[c];
			}

			System.out.println(ans);

		}
	}
}