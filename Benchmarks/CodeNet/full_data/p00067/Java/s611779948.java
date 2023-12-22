

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[][] land = new int[12][12];
		int count = 0;
		ArrayList<Integer> islandCount = new ArrayList<>();

		while (in.hasNext()) {

			for (int i = 0; i < 12; i++) {

				String a = in.next();

				for (int j = 0; j < 12; j++) {

					char b = a.charAt(j);
					int c = Integer.parseInt(b + "");
					land[i][j] = c;

				}
			}

			for (int i = 0; i < 12; i++) {

				for (int j = 0; j < 12; j++) {

					if (land[i][j] == 1) {

						island(land, i, j);

						count++;

					}
				}
			}

			System.out.println(count);

		}

	}

	private static void island(int[][] land, int i, int j) {

		if (land[i][j] == 1) {

			land[i][j] = 0;

			if (i > 0) {

				island(land, i - 1, j);

			}

			if (i < 11) {

				island(land, i + 1, j);

			}

			if (j > 0) {

				island(land, i, j - 1);

			}

			if (j < 11) {

				island(land, i, j + 1);

			}

		} else {

			return;
			
		}

		/*
		 * if(land[i + 1][j] == 0 && land[i - 1][j] == 0 && land[i][j + 1] == 0 &&
		 * land[i][j - 1] == 0) {
		 * 
		 * land[i][j] = 0;
		 * 
		 * } else if(land[i + 1][j] == 1 || land[i - 1][j] != 0 || land[i][j + 1] != 0
		 * || land[i][j - 1] != 0){
		 * 
		 * island(land, i + 1, j);
		 * 
		 * } else if(land[j + 1][j] == 1 && land[i + 1][j] == 0 || land[i - 1][j] != 0
		 * || land[i][j - 1] != 0) {
		 * 
		 * island(land, i, j + 1);
		 * 
		 * } else if(land[i][j - 1] == 1 && land[i + 1][j] == 0 || land[i - 1][j] != 0
		 * || land[i][j - 1] != 0){
		 * 
		 * island(land, i, j - 1);
		 * 
		 * } else if(land[i][i - 1] == 1 && land[i + 1][j] == 0 || land[i][j + 1] != 0
		 * || land[i][j - 1] != 0){
		 * 
		 * island(land, i - 1, j);
		 * 
		 * }
		 * 
		 * land[i][j] = 0;
		 */

	}
}