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
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();


		/* 滞在期間がK以下の場合 */
		if (n < k) {
			goukei =  n * x;
		} else {
			goukei = k * x;
			goukei = (n-k) * y + goukei;

		}


		System.out.println(goukei + "円");
	}

}
