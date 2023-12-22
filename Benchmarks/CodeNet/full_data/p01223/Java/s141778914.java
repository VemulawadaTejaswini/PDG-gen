import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] block = new int[scan.nextInt()][scan.nextInt()];
		int maxUp = 0;
		int maxDown = 0;

		for (int i = 0; i < block.length; i++) {
			for (int j = 0; j < block[i].length; j++) {
				block[i][j] = scan.nextInt();
				System.out.println(block[i][j]);
			}

		}
		for (int i = 0; i < block.length; i++) {
			for (int j = 0; j < block[i].length - 1; j++) {
				if (block[i][j] < block[i][j + 1] && (block[i][j + 1] - block[i][j]) > maxUp) {
					maxUp = block[i][j + 1] - block[i][j];

				} else if (block[i][j + 1] < block[i][j] && (block[i][j] - block[i][j + 1]) > maxDown) {
					maxDown = block[i][j] - block[i][j + 1];

				}
			}
		}

		System.out.println(maxUp + " " + maxDown);

	}
}