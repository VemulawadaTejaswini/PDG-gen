import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = Integer.parseInt(input);
		int x = 0;

		if (n >= 3 && n <= 10000) {
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0) {
					System.out.print(" " + i);
				} else {
					x = i;

					while ((x >= 10) && ((x % 10) != 3)) { // 3を含む値をチェックして、あれば出力するプログラム
						x /= 10;
					}

					if (x % 10 == 3) {
						System.out.print(" " + x);
					}
				}

			}

		}

	}
}

