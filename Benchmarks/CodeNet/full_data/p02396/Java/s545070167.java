import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int x;
		for (int i = 1;; i++) {
			x = sc.nextInt();
			if (x != 0) {

				System.out.println("Case " + i + ": " + x);
			} else {
				break;

			}

		}

	}

}
