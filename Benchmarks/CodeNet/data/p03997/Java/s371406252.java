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
		/* 上底 */
		int jotei = scanner.nextInt();
		/* 下底 */
		int katei = scanner.nextInt();
		/* 高さ */
		int takasa = scanner.nextInt();
		/* 面積 */
		int menseki = 0;

		menseki = (jotei + katei) * takasa / 2;

		/* 出力 */
		System.out.println(menseki);
	}

}
