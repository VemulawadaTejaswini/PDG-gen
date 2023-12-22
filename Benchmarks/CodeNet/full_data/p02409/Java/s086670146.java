import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][][] house = new int[4][3][10];
		// 公舎配列の定義
		house[0][0] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[0][1] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[0][2] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		house[1][0] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[1][1] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[1][2] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		house[2][0] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[2][1] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[2][2] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		house[3][0] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[3][1] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		house[3][2] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


		Scanner scanner = new Scanner(System.in);


		int n = scanner.nextInt();

		for (int a = 0; a < n; a++) {

			int b = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();

			// 人数計算
			 	// 入居者は0以下にならない

			house[b - 1][f - 1][r - 1] += v;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					if (i == 3 && j ==2 && k == 9) {
						System.out.println(" " + house[i][j][k]);
					} else if (j == 2 && k == 9) {
						System.out.println(" " + house[i][j][k]);
						System.out.println("####################");
					} else if (k == 9) {
						System.out.println(" " + house[i][j][k]);
					} else {
					System.out.print(" " + house[i][j][k]);
					}
				}
			}
		}
	}

}

