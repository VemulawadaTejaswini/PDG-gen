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
	 * Atcorder 提出
	 * @return
	 *
	 */

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A;
		String B = "";
		int C;
		int result = 0;

		A = scanner.nextInt();
		B = scanner.next();
		C = scanner.nextInt();

		if (B.equals("+")) {

			result = A + C;
		} else {
			result = A - C;
		}
		System.out.println(result);
	}
}
