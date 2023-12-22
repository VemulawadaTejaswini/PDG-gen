import java.util.Scanner;

class Main {
	// 絵柄
	static final String[] MARK = { "S", "H", "C", "D" };

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// カード総数
		final int TOTAL_CARDS = 52;

		// どのカードを所持しているかのフラグ
		boolean[] flagArray = new boolean[TOTAL_CARDS];

		// 所持カード枚数(入力レコード数)を記録
		int cardCount = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cardCount; i++) {
			// 所持カード(絵柄 + " " + 数字)の入力
			String[] input = sc.nextLine().split("[\\s]+");
			// 所持フラグの変更
			int arraynum = CardToArrayNum(input[0], input[1]);
			flagArray[arraynum] = true;

		}

		print(flagArray);

	}

	// カードから配列番号へ
	static int CardToArrayNum(String mark, String num) {
		for (int x = 0; x < MARK.length; x++) {

			if (mark.equals(MARK[x])) {

				return Integer.parseInt(num) + (x * 13) - 1;
			}
		}
		return -1;
	}

	// 配列番号からカードへ
	static String[] ArrayNumToCard(int num) {
		String[] card = new String[2];
		card[0] = MARK[num / 13];
		card[1] = String.valueOf(num % 13 + 1);
		return card;
	}

	// 表示処理
	static void print(boolean[] flagArray) {
		// 所持していなかったカードを表示させる
		for (int i = 0; i < flagArray.length; i++) {

			if (flagArray[i] == false) {
				String[] card = ArrayNumToCard(i);
				// 出力
				System.out.println(card[0] + " " + card[1]);
			}
		}
	}
}

