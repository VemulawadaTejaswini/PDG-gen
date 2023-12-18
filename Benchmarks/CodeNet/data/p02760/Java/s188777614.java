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

		for (int h = 0; h < N; h++) {
			int number = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (array[i][j] == number) {
						array[i][j] = 0;
					}
				}
			}
		}
		sc.close();

		boolean flag = false;

////////
		for (int i = 0; i < 3; i++) {
			int sum = 0;

			for (int j = 0; j < 3; j++) {
				sum = sum + array[i][j];
			}

			if (sum==0) {
				flag = true;
			}
			sum=0;
		}
////////
		for (int i = 0; i < 3; i++) {
			int sum = 0;

			for (int j = 0; j < 3; j++) {
				sum = sum + array[j][i];
			}

			if (sum==0) {
				flag = true;
			}
			sum=0;
		}
////////
			int sum1 = array[0][0] + array[1][1] + array[2][2];
			if (sum1==0) {
				flag = true;
			}

			int sum2 = array[0][3] + array[1][1] + array[3][0];
			if (sum2==0) {
				flag = true;
			}

////////
		for (int i = 0; i < 3; i++) {
			int sum = 0;

			for (int j = 0; j < 3; j++) {
				sum = sum + array[2-i][i];
			}

			if (sum==0) {
				flag = true;
			}
			sum=0;
		}
////////

		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
