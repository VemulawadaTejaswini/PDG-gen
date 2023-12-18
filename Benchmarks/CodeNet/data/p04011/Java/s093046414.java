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
		int vizit = sc.nextInt();
		int goukei= 0;
		int count = 0;

		/* 3泊目までは10000円 */
		for (int i = 0; i <= 3; i++) {
			goukei = goukei + 10000;
			count++;
		}

		/* 4泊以上宿泊する場合 */
		if (vizit >= 4) {
			for (count = 0; count <= vizit; vizit++) {
				goukei = goukei + 9000;
			}	
		}


		System.out.println(goukei);



	}

}
