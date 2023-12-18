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
		Scanner sc = new Scanner(System.in);

		/* 何泊したいかを入力 */
		int goukei= 0;
		int count = 0;
		int visit = 0;
		int kijo = 0;
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();


		/* 滞在期間がK以下の場合 */
		if (visit <= k) {
			goukei = k * y;
		}
		/* 滞在期間がKより長い場合 */
		if (visit > k) {
			count = visit - k;
			kijo = y * count;
			goukei = goukei + goukei;

		}

		System.out.println(goukei + "円");
	}

}
