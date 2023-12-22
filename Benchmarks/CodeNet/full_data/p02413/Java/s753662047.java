import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//入力
		int r = scanner.nextInt();
		int c = scanner.nextInt();

		//配列rc
		int[][] rc = new int[r + 1][c + 1];

		//入力
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				rc[i][j] = scanner.nextInt();
			}
		}


		//縦列の合計
		for (int i = 0; i < r; i++) {

			int sum = 0;

			for (int j = 0; j < c; j++) {
				sum += rc[i][j];
			}
			rc[i][c] = sum;
		}

		//横列の合計
		for (int i = 0; i < c + 1; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum += rc[j][i];
			}
			rc[r][i] = sum;

		}


		//配列rcの出力
		for (int i = 0; i <= r; i++) {

			for (int j = 0; j <= c; j++) {

				if (j == 0)					//一回目
					System.out.print(rc[i][j]);
				else
					System.out.print(" " + rc[i][j]);

			}
			System.out.println();
		}
	}
}
