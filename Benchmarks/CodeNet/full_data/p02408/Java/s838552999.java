import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		// 所持枚数の取得
		int count = scanner.nextInt();

		int carddesign[] = new int[count];
		int cardnum[] = new int[count];

		for (int i = 0; i < count; i++) {
			// 絵柄を取得
			String design = scanner.next();

			if (design.equals("S")) {
				carddesign[i] = 0;

			} else if (design.equals("H")) {
				carddesign[i] = 1;

			} else if (design.equals("C")) {
				carddesign[i] = 2;

			} else if (design.equals("D")) {
				carddesign[i] = 3;
			}

			// 持っているカードの数値を取得
			cardnum[i] = scanner.nextInt();

		}
		Card card = new Card(count, carddesign, cardnum);

		int designcategory = 4;
		int numbercategory = 13;

		for (int i = 0; i < designcategory; i++) {
			for (int j = 0; j < numbercategory; j++) {
				if (card.getCard(i, j) != true) {
					System.out.println(card.getDesign(i) + " " + card.getNum(j));
				}
			}
		}

	}
}

class Card {

	boolean card[][] = new boolean[4][13];

	Card(int have, int[] design, int[] num) {

		for (int i = 0; i < have; i++) {

			// 所持しているカードの値をtrueにする
			card[design[i]][num[i] - 1] = true;
		}
	}

	public boolean getCard(int design, int number) {

		return card[design][number];

	}

	public String getDesign(int design) {
		String carddesign = " ";

		if (design == 0) {
			carddesign = "S";

		} else if (design == 1) {
			carddesign = "H";

		} else if (design == 2) {
			carddesign = "C";

		} else if (design == 3) {
			carddesign = "D";
		}

		return carddesign;
	}

	public int getNum(int number) {
		return number + 1;
	}
}

