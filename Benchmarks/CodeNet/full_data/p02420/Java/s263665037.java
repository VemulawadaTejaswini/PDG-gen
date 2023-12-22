import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String shuffled_card = ""; // シャッフル後のカードの状態
		int m = 0; // シャッフル回数
		int h = 0; // 下からとる枚数
		int MAX_DATA = 10;
		int NUMBER_OF_DATA = 0;
		String n = ""; // 入力されたカードの山
		boolean judge_m = true; // シャッフル回数が条件を満たしているかを示す変数
		boolean judge_n = true; // 入力されたn枚のカードが条件を満たしているかを示す変数
		String[] output = new String[MAX_DATA];

		out: for (int i = 0; i < MAX_DATA; i++) {

			// 始:カードの入力とチェック
			n = sc.next();
			shuffled_card = n;
			if (n.equals("-")) {
				break out;
			}
			NUMBER_OF_DATA++;
			if (n.length() < 1 || n.length() > 200) {
				judge_n = false;
				break out;
			}
			// 終:カードの入力とチェック

			// 始:シャッフル回数mの入力とチェック
			m = sc.nextInt();

			if (m < 1 && m > 100) {
				judge_m = false;
				break out;

			}
			// 終:シャッフル回数mの入力とチェック

			for (int j = 0; j < m; j++) {
				h = sc.nextInt();
				shuffled_card = shuffled_card.substring(h,
						shuffled_card.length())
						+ shuffled_card.substring(0, h);

			}
			output[i] = shuffled_card;
		}// out:for文ここまで

		if (judge_m == true && judge_n == true) {
			for (int k = 0; k < NUMBER_OF_DATA; k++) {
				System.out.println(output[k]);

			}
		}
	}
}

