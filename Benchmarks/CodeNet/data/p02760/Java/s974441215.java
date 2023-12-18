import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int[][] array = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		int N = sc.nextInt();

		boolean[][] ansArray = new boolean[3][3];
		for (int h = 0; h < N; h++) {
			int number = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					ansArray[i][j] = false;
					if (array[i][j] == number) {
						ansArray[i][j] = true;
					}
				}
			}
		}
		sc.close();



	}
}
