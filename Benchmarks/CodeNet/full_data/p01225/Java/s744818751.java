

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// game set
		int gameset = sc.nextInt();

		int[][] cardset = new int[UTRummy.CARDPAGE][UTRummy.ONECARDSET];

		for (int i = 0; i < gameset; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 9; k++) {

					if (j == 0) {
						cardset[j][k] = sc.nextInt();
					} else {

						String tmpcolor = sc.next();
						int intColor = 0;
						if (tmpcolor.equals("R")) {
							intColor = UTRummy.RED;
						} else if (tmpcolor.equals("G")) {
							intColor = UTRummy.GREEN;
						} else {
							intColor = UTRummy.BLUE;
						}
						cardset[j][k] = intColor;
					}
				}
			}

			UTRummy utr = new UTRummy();
			utr.setCardset(cardset);
			cardset = utr.getCardset();

			int intCount = 0;
			intCount = utr.playtheGame(cardset); // ?????????

			if (3 <= intCount) {
				System.out.println(1);

			} else {
				System.out.println(0);
			}
		}
	}
}

class UTRummy {

	// declear
	static final int ONECARDSET = 9;
	static final int CARDPAGE = 2;

	// color
	static final int RED = 0;
	static final int GREEN = 1;
	static final int BLUE = 2;

	int[][] Cardset = new int[CARDPAGE][ONECARDSET];

	public UTRummy() {

	}

	public int[][] getCardset() {
		return Cardset;
	}

	public void setCardset(int[][] cardset) {
		this.Cardset = settingcardplay(cardset);
	}

	public int[][] settingcardplay(int[][] card) {

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8 - i; j++) {

				if (card[1][j] > card[1][j + 1]) {
					int temp = card[1][j];
					card[1][j] = card[1][j + 1];
					card[1][j + 1] = temp;

					int temp2 = card[0][j];
					card[0][j] = card[0][j + 1];
					card[0][j + 1] = temp2;
				}
			}
		}

		for (int i = 0; i < 8; i++) {

			for (int j = 0; j < 8 - i; j++) {
				if (card[1][j] == card[1][j + 1] && card[0][j] > card[0][j + 1]) {

					int temp = card[0][j];
					card[0][j] = card[0][j + 1];
					card[0][j + 1] = temp;

				}

			}
		}
		return card;
	}

	public int playtheGame(int[][] cardset) { // ?????????

		int intCount = 0;

		for (int k = 0; k < 7; k++) {

			for (int j = k + 1; j < 8; j++) {

				for (int i = j + 1; i < 9; i++) {
					if (cardset[1][k] == cardset[1][j] && cardset[1][j] == cardset[1][i]) {

						if (cardset[0][k] != 0 && cardset[0][k] == cardset[0][j] - 1
								&& cardset[0][k] == cardset[0][i] - 2) {

							intCount++;
							cardset[0][k] = 0;
							cardset[0][j] = 0;
							cardset[0][i] = 0;
						}
					}
				}
			}
		}

		for (int k = 0; k < 7; k++) {

			for (int j = k + 1; j < 8; j++) {

				for (int i = j + 1; i < 9; i++) {

					if (cardset[1][k] == cardset[1][j] && cardset[1][j] == cardset[1][i]) {
						if (cardset[0][k] != 0 && cardset[0][k] == cardset[0][j] && cardset[0][k] == cardset[0][i]) {

							intCount++;
							cardset[0][k] = 0;
							cardset[0][j] = 0;
							cardset[0][i] = 0;
						}
					}
				}
			}
		}
		return intCount;
	}

}