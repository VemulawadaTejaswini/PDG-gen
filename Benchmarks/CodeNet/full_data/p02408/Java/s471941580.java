import java.util.ArrayList;
import java.util.Scanner;
class Main {
	// 絵柄の種類
	enum MARK {
		S, H, C, D;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// カード番号の開始・終了
		final int startNum = 1, endNum = 13;

		// 所持カードリストを作成
		ArrayList<Card> exsistsCards = new ArrayList<Card>();

		// 所持カード枚数(入力レコード数)を入力
		int cardCount = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cardCount; i++) {
			// 所持カード(絵柄 + " " + 数字)の入力
			exsistsCards.add(new Card(sc.nextLine()));
		}

		// カードの全パターンを列挙してリストにないものを出力
		for (MARK m : MARK.values()) {
			num: for (int i = startNum; i <= endNum; i++) {
				String str = m + " " + i;
				for (Card c : exsistsCards) {
					if (str.equals(c.getString())) {
						continue num;
					}
				}
				System.out.println(str);
			}
		}
	}

	// カードクラス
	static class Card {
		private MARK mark; // 絵柄
		private int num; // 数字

		// 絵柄と数字から生成
		Card(String input) {
			String[] str = input.split("[\\s]+");
			this.mark = MARK.valueOf(str[0]);
			this.num = Integer.parseInt(str[1]);
		}

		public String getString() {
			return this.mark + " " + this.num;
		}
	}
}

