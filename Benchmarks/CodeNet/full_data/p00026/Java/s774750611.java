import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[12][12];
		int x = 0;
		int y = 0;
		int size = 0;
		int blank = 0;
		int maxValue = 0;

		while (sc.hasNext()) {
			String inputData[] = sc.next().split(",");

			x = Integer.parseInt(inputData[0]);
			y = Integer.parseInt(inputData[1]);
			size = Integer.parseInt(inputData[2]);

			switch (size) {
			case 1:
				matrix[x][y]++;
				matrix[x + 1][y]++;
				matrix[x - 1][y]++;
				matrix[x][y + 1]++;
				matrix[x][y - 1]++;

				break;

			case 2:
				matrix[x][y]++;
				matrix[x + 1][y]++;
				matrix[x - 1][y]++;
				matrix[x][y + 1]++;
				matrix[x][y - 1]++;

				matrix[x + 1][y + 1]++;
				matrix[x - 1][y - 1]++;
				matrix[x + 1][y - 1]++;
				matrix[x - 1][y + 1]++;

				break;

			case 3:
				matrix[x][y]++;
				matrix[x + 1][y]++;
				matrix[x - 1][y]++;
				matrix[x][y + 1]++;
				matrix[x][y - 1]++;

				matrix[x + 1][y + 1]++;
				matrix[x - 1][y - 1]++;
				matrix[x + 1][y - 1]++;
				matrix[x - 1][y + 1]++;

				matrix[x][y + 2]++;
				matrix[x][y - 2]++;
				matrix[x + 2][y]++;
				matrix[x - 2][y]++;

			}

		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (matrix[i][j] == 0) {
					blank++;
				}
				if (maxValue < matrix[i][j]) {
					maxValue = matrix[i][j];
				}
			}
		}

		System.out.println(blank);
		System.out.println(maxValue);
	}

}