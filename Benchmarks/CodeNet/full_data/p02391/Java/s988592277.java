import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 * @author RisaTozawa
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
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;

		/* ２つの整数 a, b を読み込んで、a と b の大小関係を出力するプログラム */
		a = scanner.nextInt();
		b = scanner.nextInt();

		/* a より b の方が大きい */
		if (a < b) {
			System.out.println("a < b");
		/* a より b の方が小さい */
		} else if (a > b) {
			System.out.println("a > b");
		/* a と b が等しい */
		} else {
			System.out.println("a == b");
		}
	}
}

