import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dataSet = scan.nextInt();

		// [½ÔÚÌf[^Zbg]ÌÅåÅ¬
		int[] maxUp = new int[dataSet];
		int[] maxDown = new int[dataSet];

		// 0Åú»
		for (int i = 0; i < dataSet; i++) {
			maxUp[i] = 0;
			maxDown[i] = 0;
		}

		// [½ÔÚÌf[^Zbg][i·Ì]
		int[][] block = new int[dataSet][];

		// ubNÉlüÍ
		for (int i = 0; i < dataSet; i++) {
			// ubNÌ
			int numberOfBlock = scan.nextInt();
			block[i] = new int[numberOfBlock];

			for (int j = 0; j < numberOfBlock; j++) {
				block[i][j] = scan.nextInt();
			}

		}

		// Å¬ÆÅåðvZ
		for (int i = 0; i < block.length; i++) {
			for (int j = 0; j < block[i].length - 1; j++) {
				if (block[i][j] < block[i][j + 1] && (block[i][j + 1] - block[i][j]) > maxUp[i]) {
					maxUp[i] = block[i][j + 1] - block[i][j];

				} else if (block[i][j + 1] < block[i][j] && (block[i][j] - block[i][j + 1]) > maxDown[i]) {
					maxDown[i] = block[i][j] - block[i][j + 1];
				}
			}
			System.out.println(maxUp[i] + " " + maxDown[i]);
		}

	}
}