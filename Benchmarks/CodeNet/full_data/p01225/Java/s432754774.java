

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// victory 1 defeat 0 save
		ArrayList<Integer> answer = new ArrayList<Integer>();

		// ???????????????????????°
		int set = Integer.parseInt(br.readLine());
		// input Area
		for (int i = 0; i < set; i++) {
			// ??¨??????????????????????????????????????????
			String tmpNum = br.readLine();
			String tmpColor = br.readLine();

			// ??°?????????????????§???????????£?¨????????????????????????????????????????????????????????´?
			CardRummy cr = new CardRummy(tmpNum, tmpColor);

			// method?????????????????????????????????
			int result = cr.playtheGame();
			// ???????????????????´?
			answer.add(result);
		}

		// output Area
		// ex : 10101010
		for (int i = 0; i < answer.size(); i++) {// debug chk point
			System.out.println(answer.get(i));
		}
	}
}// end

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

		// ???????±??????£???????????????????????¨????????????????´?
		for (int i = 0; i < ONECARDSET; i++) {// debug chk point

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

	public int playtheGame() {// debug chk point
		int result = 0;

		// ??´???????\?
		Arrays.sort(cardR);
		Arrays.sort(cardG);
		Arrays.sort(cardB);

		// ??£????????????????¢????
		cardR = sameNumCard(cardR);
		cardG = sameNumCard(cardG);
		cardB = sameNumCard(cardB);

		// ????????????????????????????¢????
		cardR = serialNumCard(cardR);
		cardG = serialNumCard(cardG);
		cardB = serialNumCard(cardB);

		// ?????????????????´???????\?
		Arrays.sort(cardR);
		Arrays.sort(cardG);
		Arrays.sort(cardB);

		if (cardR[8] == 0 && cardG[8] == 0 && cardB[8] == 0) {

			result = 1;
		}

		return result;

	}

	public static int[] sameNumCard(int[] card) {// debug chk point

		int cnt = 0;

		int[] tmpArr = new int[9];

		int tmpArrCnt = 0;

		for (int i = 0; i < ONECARDSET; i++) {
			for (int j = 0; j < ONECARDSET; j++) {
				if (card[j] == i + 1) {
					cnt++;
					tmpArr[tmpArrCnt++] = j + 1;
				}
			}
			if (cnt >= 3) {
				int count2 = 0;
				for (int k = 0; k < ONECARDSET; k++) {
					if (count2 == 3) {
						break;
					}
					int intNum = tmpArr[k];
					card[intNum - 1] = 0;
					count2++;
				}
				count2 = 0;
			}
			cnt = 0;
			tmpArrCnt = 0;
		}

		return card;
	}

	public static int[] serialNumCard(int[] card) {// debug chk point

		int[][] tmpArr = new int[3][2];

		int cnt = 0;

		int k = 1;
		int i = 0;
		int j = 0;

		while (i < 7) {

			outer: while (true) {

				if (k == 4) {
					int intNum1 = tmpArr[0][1];
					int intNum2 = tmpArr[1][1];
					int intNum3 = tmpArr[2][1];
					card[intNum1] = 0;
					card[intNum2] = 0;
					card[intNum3] = 0;
					Arrays.sort(card);
					i -= 1;

					break outer;
				}

				if (j == 9) {
					j = 0;
					i++;
					break;
				}

				if (card[j] == k + i) {
					tmpArr[cnt][0] = k + i;
					tmpArr[cnt][1] = j;
					cnt++;
					k++;
				}
				j++;
			}
			k = 1;
			cnt = 0;
		}
		return card;
	}
}