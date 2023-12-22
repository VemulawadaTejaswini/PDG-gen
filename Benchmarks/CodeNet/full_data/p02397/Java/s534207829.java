import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 */
public class Main {

	/* コンストラクタ */
	Main() {
	//何もしない
	}

	/**
	 * 提出
	 *
	 */

	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		int a = 0;
		int b = 0;
		int tmpB = 0;


		for (int i = 0; i < 3000; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();

			/* aの方がbより大きい場合 */
			if (a > b) {
				/* aとbの値を交換 */
				tmpB = b;
				b = a;
				a = tmpB;
				System.out.println(a + " " + b);

			} else if (a < b) {
				System.out.println(a + " " + b);
			} else if (a == 0 && b== 0) {
				break;
			} else if (a == b) {
				System.out.println(a + " " + b);
			}
		}

	}
}

