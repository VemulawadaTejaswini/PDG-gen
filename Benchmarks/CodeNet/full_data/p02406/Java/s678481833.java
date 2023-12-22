import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 整数nを取得
		int n = scanner.nextInt();
		// System.out.print(" ");

		for (int i = 1; i <= n; i++ ) {
		// 3の倍数
		if (i % 3 == 0) {
			System.out.print(" " + i);
		// 3を含む数字
		} else if (String.valueOf(i).contains("3")) {
			System.out.print(" " + i);
		}
		}
                System.out.println();
	}
}

