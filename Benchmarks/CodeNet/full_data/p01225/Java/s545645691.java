

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

	/**
	 * ?????????????????????????????\???????¢??????°???
	 * ??????
	 * 1) ????´???????????????? ??????String + String ??? Red 1 [1R] White 2 [2W] Gold 3 [3G]
	 * 2) if??§????´¢????????????.contains() ??? switch??? ??? return;
	 *
	 * ??????????????§BufferedReader?????????
	 *
	 * @throws IOException
	 *             try-catch??????throws IOException?????£?¨??????????
	 */
	public static void main(String[] args) throws IOException {

		// ?????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ?????????????´???´???
		ArrayList<Integer> answer = new ArrayList<Integer>();

		// 1??????????????????set?????°??????????????°
		int set = Integer.parseInt(br.readLine());
		// for????????? set????????°?????????
		for (int cnt = 0; cnt < set; cnt++) {
			// CardRummy????????? ???????????°??????????????????????????????????????????????????°???
			Rummy ru = new Rummy(br.readLine(), br.readLine());
			// ???????????¶??????????????°??? ????????????????????°0
			// result????????????????????????????´???´???
			int result = ru.playtheGame();
			// ?????????????´?
			answer.add(result);
		}

		// for????????? ??????????????????????????????
		for (int cnt = 0; cnt < answer.size(); cnt++)
			// ???????????????
			System.out.println(answer.get(cnt));

	}// ????????????????????????????????????

	/**
	 * ?????????CardRummy
	 */
	public static class Rummy {
		/**
		 * ?????????????????°??¶???
		 */
		private static final int ONECARDSET = 9;
		/**
		 * ?????????????????£?????????????????????
		 */
		private static final int CASTAREA = 2;
		/**
		 * ?????????????????£?????????????????°??????????´???´???
		 */
		private static final int CASTADDRESS =0;

		/**
		 * ????????????????´???´???
		 */
		ArrayList<String> card = new ArrayList<String>();

		/**
		 * ?????°??????????????? ?????£???????????????????´???????
		 *
		 * @param tmpNum
		 *            ??????????????°???????????? ??????1 2 3 3 4 5 7 7 7
		 * @param transColor
		 *            ???????????????????????? ??????R R R R R R G G G
		 */
		public Rummy(String tmpNum, String tmpColor) {// ???????????°????????????
			// ?????°???????§£ ??°??????????´?
			String[] transNum = tmpNum.split(" ");
			// ?????°???????§£ ??????????´?
			String[] transColor = tmpColor.split(" ");
			// ?????¨??°??????????????????????´?????????´???
			String tmpCard = "";

			// for????????? ????§£??????????????????????????????
			for (int cnt = 0; cnt < ONECARDSET; cnt++) {
				/**
				 * ONECARDSET CardR??¨CardG??¨CardB???????????????9????????????
				 */
				// ????§£??????????????¨??°??????????????????
				tmpCard = transNum[cnt] + transColor[cnt];
				// ????´?
				card.add(tmpCard);
			}
		}// ?????????????????????????????????

		/**
		 * ???????????¶???????????????
		 *
		 * @return result ??????????????????????????????
		 *
		 * @param tmpArr ???????????´??????????????¨???????????´???
		 *
		 */
		public int playtheGame() {// ???????????°????????????

			// ?????????0???????????????
			int result = 0;
			// ???????????????????????´???

			//??¨???????????´???
			ArrayList<String> tmpArr = new ArrayList<String>();

			// ???????????????????????´???
			Collections.sort(card);
			//??´???????????????
//			tmpArr.addAll(card);
//			card.clear();
//			card.addAll(tmpArr);

			// 3??£?¶????????????????????????°?¶????
			serialNumCard(card); //?????£????????????

			// ??????????????????3???????????°?¶????
			sameNumCard(card); //?????£????????????

			// ???????????????????????´???
			Collections.sort(card);
			//??´???????????????
//			tmpArr.addAll(card);
//			card.clear();
//			card.addAll(tmpArr);

			// ????????????????????°??????0????????¨??¨0
			if (card.get(ONECARDSET - 1).contains("0")){
				// ?????¶??????????????°???????????????s
				result = 1;}
			// ????????????????????????????????????
			return result;
		}// playtheGame????????????????????????
		/**
		 * 3??£?¶??????°??????????????°?¶????
		 *
		 * @param card2
		 *            ?????¶??????????????°"0"????????\??????????????????
		 *
		 * @return "0"????????\???????????£????????????
		 */

		public void serialNumCard(ArrayList<String> card) {// ?????£????????????

			/**
			 * for??????????????¬???
			 *
			 * ???????????????????±????????????¶ ??????1 2 3 3 4 5 7 7 7 ??? [1] [2] [3]
			 *
			 * @param cnt1
			 *            ???????????????????????? "0";
			 * @param cnt2
			 *            ???????????????????????? "cnt1 + 1";
			 * @param cnt3
			 *            ???????????????????????? "cnt2 + 1";
			 *
			 * @param tempNum String????????????????????°??????int??¢????????£???????????????????????¨????????°
			 *
			 * @param tempArr[] ??¨????????°?????????????????°??????????´? ??????????????°?????????????????????
			 *
			 * @param ONECARDSET
			 *            ??????????????????????¶????????????¨?????§?????????
			 */


			//??????????????°???????????¢??¨
			String tempNum1[] = new String[CASTAREA];
			String tempNum2[] = new String[CASTAREA];
			String tempNum3[] = new String[CASTAREA];

			// for????????????????????????????????????????????¨???????????????????????°????????????
			for (int cnt1 = 0; cnt1 < ONECARDSET - 2; cnt1++) {
				for (int cnt2 = cnt1 + 1; cnt2 < ONECARDSET - 1; cnt2++) {
					for (int cnt3 = cnt2 + 1; cnt3 < ONECARDSET; cnt3++) {

						/**
						 * ?????£????????????
						 *
						 * ?????????1???String???????????????????\???????
						 * ?????????2?????????????????¢?????????????????????
						 *
						 * ?????????1 ?????????
						 * 1) ??¨????????°??§??°???????????¢????´? ??? ???????¨?????????????????????????????????°???????????????????????§???????????????????????????
						 *    (??¢?????????????????????)
						 * 2) ??¨????????°??§??°???????????¢????´? ??? ??¨???int[]????????£??????????????°????????????????????????????????????????????????
						 *
						 * ?????????2 ?????????
						 * ???????????°??¢????????§????????????????????£ ??? ?????????????¨??????????????????????????????????
						 *
						 */

						//
						tempNum1 = card.get(cnt1).split("");
						tempNum2 = card.get(cnt2).split("");
						tempNum3 = card.get(cnt3).split("");
						// (1)3??£?¶?????????????????????????????????????
						if (Integer.parseInt(tempNum1[CASTADDRESS]) == Integer.parseInt(tempNum2[CASTADDRESS]) - 1
								&& Integer.parseInt(tempNum1[CASTADDRESS]) == Integer.parseInt(tempNum3[CASTADDRESS])
										- 2) {
							// (2)3??£?¶????????????????????????????????????????
							if (tempNum1[CASTADDRESS + 1].equals(tempNum2[CASTADDRESS + 1])
									&& tempNum2[CASTADDRESS + 1].equals(tempNum3[CASTADDRESS + 1])) {

								// (3)???????????????????????§?????????????????????
								if (!card.get(cnt1).contains("0") && !card.get(cnt2).contains("0")
										&& !card.get(cnt3).contains("0")) {

									// ??¨???????????¶??????????????°????????§?¨??????????"0"????????\
									card.remove(cnt1);
									card.add(cnt1, "0");
									card.remove(cnt2);
									card.add(cnt2, "0");
									card.remove(cnt3);
									card.add(cnt3, "0");
								}
						}
					}
				}
			}
			}
			// ?¶?????????¨???????????£???????????????????????????
			//return card;
		}// serialNumCard ????????????????????????
		/**
		 * ????????°????????????????????°?¶????
		 *
		 * @param card
		 *            ?????¶??????????????°"0"????????\??????????????????
		 *
		 * @return "0"????????\???????????£????????????
		 */
		public void sameNumCard(ArrayList<String> card) {// ???????????°????????????

			/**
			 * for??????????????¬???
			 *
			 * ???????????????????±????????????¶ ??????1 2 3 3 4 5 7 7 7 ??? [1] [2] [3]
			 *
			 * @param cnt1
			 *            ???????????????????????? "0";
			 * @param cnt2
			 *            ???????????????????????? "cnt1 + 1";
			 * @param cnt3
			 *            ???????????????????????? "cnt2 + 1";
			 *
			 * @param ONECARDSET
			 *            ??????????????????????¶????????????¨?????§?????????
			 */

			// for???????????????????????????????????????????????¨???????????????????????°????????????
			for (int cnt1 = 0; cnt1 < ONECARDSET - 2; cnt1++) {
				// ????????????????????¨???????????????????????°????????????
				for (int cnt2 = cnt1 + 1; cnt2 < ONECARDSET - 1; cnt2++) {
					for (int cnt3 = cnt2 + 1; cnt3 < ONECARDSET; cnt3++) {
						// (1)???????????????????????????????????????
						if (card.get(cnt1).equals(card.get(cnt2)) && card.get(cnt2).equals(card.get(cnt3))) {
							// (1)????????¶??????????????°??????????????????
							if (!card.get(cnt1).contains("0") && !card.get(cnt2).contains("0") && !card.get(cnt3).contains("0")){

								// ??¨???????????¶??????????????°????????§?¨??????????"0"????????\
								card.remove(cnt1);
								card.add(cnt1, "0");
								card.remove(cnt2);
								card.add(cnt2, "0");
								card.remove(cnt3);
								card.add(cnt3, "0");
							}
						}
					}
				}
			}
			// ?¶?????????¨???????????£???????????????????????????
			//return card;
		}// sameNumCard????????????????????????

	}// Rummy?????????????????????

}// NRummy?????????????????????