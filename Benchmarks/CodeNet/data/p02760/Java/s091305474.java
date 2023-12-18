import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean judge = false;

		//ビンゴ作成
		int[][] bingo = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		//ビンゴを回す
		final int N = sc.nextInt();
		for (int z = N; z > 0; z--) {
			int b = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (b == bingo[i][j]) {
						bingo[i][j] = 0;
					}
				}
			}
		}

		//ビンゴ判定

		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;

		if ((bingo[0][2] + bingo[1][1] + bingo[2][0]) == 0) {
			judge = true;
		}
		check: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum = 0;
				sum2 = 0;
				sum3 = 0;
				sum += bingo[i][j];
				sum2 += bingo[j][i];
				sum3 += bingo[j][j];
			}
			if (sum == 0 || sum2 == 0 || sum3 == 0) {
				judge = true;
				break check;
			}
		}
		if (judge) {
			System.out.println("Yes");
		} else {
			System.out.println("No1");
		}
	}
}