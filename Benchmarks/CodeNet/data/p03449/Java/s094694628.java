import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[2][n];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();

			}
		}

		int max = 0;

		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 0; j <= i; j++) {
				temp += a[0][j];
			}
			for (int j = i; j < n; j++) {
				temp += a[1][j];
			}
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println(max);

	}

}
