

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int set = Integer.parseInt(br.readLine());
		// input Area
		for (int i = 0; i < set; i++) {
			String tmpNum = br.readLine();
			String tmpColor = br.readLine();

			CardRummy cr = new CardRummy();

			int result = cr.playtheGame();

			answer.add(result);
		}

		// output Area
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}

class CardRummy {

	// declear
	static final int ONECARDSET = 9;
	// static final int CARDPAGE = 2;

	int[] cardR = new int[ONECARDSET];
	int[] cardG = new int[ONECARDSET];
	int[] cardB = new int[ONECARDSET];

	public CardRummy() {

	}

	public CardRummy(String tmpNum, String tmpColor) {

		String[] transNum = tmpNum.split(" ");

		String[] transColor = tmpColor.split(" ");

		int intNum = 0;

		int tmpRnum = 0;

		int tmpGnum = 0;

		int tmpBnum = 0;

		for (int i = 0; i < transNum.length; i++) {

			if (transColor[i].equals("R")) {

				intNum = Integer.parseInt(transNum[i]);
				cardR[tmpRnum++] = intNum;

			} else if (transColor[i].equals("G")) {

				intNum = Integer.parseInt(transNum[i]);
				cardG[tmpGnum++] = intNum;

			} else if (transColor[i].equals("B")) {

				intNum = Integer.parseInt(transNum[i]);
				cardB[tmpBnum++] = intNum;
			}
		}
	}

	public int playtheGame() {
		int intAnswer = 0;

		// ???????????????????????????
		Arrays.sort(cardR);
		Arrays.sort(cardG);
		Arrays.sort(cardB);

		// pprint(CardB);

		// ????????°??????3???????????°?¶????
		cardR = pairs3Remove(cardR);
		cardG = pairs3Remove(cardG);
		cardB = pairs3Remove(cardB);

		// 3??£?¶??????°??????????????°?¶????
		cardR = ThreeConsecutiveNumber(cardR);
		cardG = ThreeConsecutiveNumber(cardG);
		cardB = ThreeConsecutiveNumber(cardB);

		// pprint(CardB);

		// ???????????????????????????
		Arrays.sort(cardR);
		Arrays.sort(cardG);
		Arrays.sort(cardB);

		// 1???9?????°????????????????????????????????§
		// ????????§???????????°??????0????????¨??¨0
		if (cardR[8] == 0 && cardG[8] == 0 && cardB[8] == 0) {

			// ?????¶??????????????°1
			intAnswer = 1;
		}

		return intAnswer;

	}
	public static int[] pairs3Remove(int[] Card) {

		// ?????¢??°??????????????? 3???????????????????????¨??°???????¶???????
		int pairs3count = 0;

		// ?????¢??°???????????????????????°??????????´?????????´???
		// ??????????????????????´?????????´???
		int[] count3Toitu = new int[9];

		int count3ToituCount = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (Card[j] == i + 1) {
					pairs3count++;
					count3Toitu[count3ToituCount] = j + 1;
					count3ToituCount++;
				}
			}
			if (pairs3count >= 3) {
				int count2 = 0;
				for (int k = 0; k < 9; k++) {
					if (count2 == 3) {
						break;
					}
					int intNum = count3Toitu[k];
					Card[intNum - 1] = 0;
					count2++;
				}
				count2 = 0;
			}
			pairs3count = 0;
			count3ToituCount = 0;
		}

		return Card;
	}

	/**
	 * 3??£?¶??????°??????????????°?¶????
	 *
	 * @param Card
	 * @return
	 */
	public static int[] ThreeConsecutiveNumber(int[] Card) {

		int[][] count3Zyuntu = new int[3][2];

		int count3ZyuntuCount = 0;

		int k = 1;
		int i = 0;
		int j = 0;

		while (i < 7) {

			outer: while (true) {

				if (k == 4) {
					int intNum1 = count3Zyuntu[0][1];
					int intNum2 = count3Zyuntu[1][1];
					int intNum3 = count3Zyuntu[2][1];
					Card[intNum1] = 0;
					Card[intNum2] = 0;
					Card[intNum3] = 0;
					Arrays.sort(Card);
					i -= 1;

					break outer;
				}

				if (j == 9) {
					j = 0;
					i++;
					break;
				}

				if (Card[j] == k + i) {
					count3Zyuntu[count3ZyuntuCount][0] = k + i;
					count3Zyuntu[count3ZyuntuCount][1] = j;
					count3ZyuntuCount++;
					k++;
				}
				j++;
			}
			k = 1;
			count3ZyuntuCount = 0;
		}

		return Card;
	}

	public static void pprint(int[] Card) {

		for (int i = 0; i < Card.length; i++) {
			System.out.print(Card[i]);
		}
		System.out.println();

	}

}