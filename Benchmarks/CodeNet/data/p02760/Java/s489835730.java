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

		boolean flag = false;

		////////
		for (int i = 0; i < 3; i++) {
			if (ansArray[i][0] && ansArray[i][1] && ansArray[i][2]) {
				flag = true;
			}
		}
		////////
		for (int i = 0; i < 3; i++) {
			if (ansArray[0][i] && ansArray[1][i] && ansArray[2][i]) {
				flag = true;
			}
		}
		////////
		if (ansArray[0][0] && ansArray[1][1] && ansArray[2][2]) {
			flag = true;
		}
		////////
		if (ansArray[0][2] && ansArray[1][1] && ansArray[2][0]) {
			flag = true;
		}
		////////
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
