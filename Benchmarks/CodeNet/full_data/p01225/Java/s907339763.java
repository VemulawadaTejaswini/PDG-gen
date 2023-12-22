

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) {

		// 答えの格納場所
		ArrayList<Integer> intAryAnswer = new ArrayList<Integer>();

		// 1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strNum = insBR.readLine();

			// DataSetNumは何回判定するか
			int DataSetNum = Integer.parseInt(strNum);

			//判断する回数まわす
			for (int i = 0; i < DataSetNum; i++) {

				//カードの数字とシンボルを取得
				String strNumLine = insBR.readLine();
				String strSymbolLine = insBR.readLine();

				//人クラスを作成　数字とシンボルを引数に
				Player player = new Player(strNumLine, strSymbolLine);

				//勝利条件に満たせば1　満たさなければ0
				int intJugmet = player.Judgment();

				//答えを格納
				intAryAnswer.add(intJugmet);

			}

			// 答えが何個あるか取得
			int intSize = intAryAnswer.size();

			// 出力
			for (int i = 0; i < intSize; i++) {
				System.out.println(intAryAnswer.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		}


	}

	/**
	 * プレイヤー
	 *
	 */
	public static class Player{


		/**
		 * カードR
		 * CardRとCardGとCardBを合わせて9枚になる
		 */
		private int[] CardR = new int[9];

		/**
		 * カードG
		 * CardRとCardGとCardBを合わせて9枚になる
		 */
		private int[] CardG = new int[9];

		/**
		 * カードB
		 * CardRとCardGとCardBを合わせて9枚になる
		 */
		private int[] CardB = new int[9];

		/**
		 * 引数を受け取り　フィールド値に格納する
		 * @param strNumLine　カードの数字の羅列　例:1 2 3 4 5 6 7 8 9
		 * @param strSymbolLine　カードのシンボルの羅列 例:R R R G G G B B B
		 */
		Player(String strNumLine, String strSymbolLine) {

			// 分解
			String[] strAryNum = strNumLine.split(" ");

			String[] strArySymbol = strSymbolLine.split(" ");

			int intNum = 0;

			int intR = 0;

			int intG = 0;

			int intB = 0;

			//分解したものを振り分ける
			for(int i = 0; i < strAryNum.length; i++) {

				//CardRとCardGとCardBを合わせて9枚になる
				if(strArySymbol[i].equals("R")) {

					 intNum = Integer.parseInt(strAryNum[i]);
					 CardR[intR] = intNum;

					 intR++;

				}else if(strArySymbol[i].equals("G")) {

					 intNum = Integer.parseInt(strAryNum[i]);
					 CardG[intG] = intNum;

					 intG++;

				}else if(strArySymbol[i].equals("B")) {

					 intNum = Integer.parseInt(strAryNum[i]);
					 CardB[intB] = intNum;

					 intB++;
				}

			}

		}
		/**
		 * 勝利条件を判定する
		 * @return intAnswer 勝利なら1　勝利に満たさないなら0
		 */
		int Judgment() {
			
			//答えを0にしておく
			int intAnswer = 0;
			
			//カードを昇順にする
			Arrays.sort(CardR);
			Arrays.sort(CardG);
			Arrays.sort(CardB);

			//同じ数字が3つあれば消す
			CardR = pairs3Remove(CardR);
			CardG = pairs3Remove(CardG);
			CardB = pairs3Remove(CardB);

			//3連続の数字があれば消す
			CardR = ThreeConsecutiveNumber(CardR);
			CardG = ThreeConsecutiveNumber(CardG);
			CardB = ThreeConsecutiveNumber(CardB);
			
			//カードを昇順にする
			Arrays.sort(CardR);
			Arrays.sort(CardG);
			Arrays.sort(CardB);
			
			//1〜9の数字のカードしかないので
			//昇順で最後の数字が0なら全部0
			if(CardR[8] == 0 && CardR[8] == 0 && CardR[8] == 0) {
				
				//条件をみたせば1
				intAnswer = 1;
			}
			
			return intAnswer;
		}
	}

	/**
	 * 同じ数字が3つあれば消す
	 * @param Card 3ペアを消したいカード
	 * @return Card 3ペアを消し終わったカード
	 */
	public static int[] pairs3Remove(int[] Card) {

		//ペア数をカウント 3カウントになると数字を消す為
		int pairs3count = 0;

		//ペア数をカウントした数字を格納する場所
		//対子の３つを格納する場所
		int[] count3Toitu = new int[9];

		int count3ToituCount = 0;

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(Card[j] == i + 1) {
					pairs3count++;
					count3Toitu[count3ToituCount] = j + 1;
					count3ToituCount++;
				}
			}
			if(pairs3count >= 3) {
				int count2 = 0;
				for(int k = 0; k < 9; k++) {
					if(count2 == 3) {
						break;
					}
					int intNum = count3Toitu[k];
					Card[intNum - 1] = 0;
					count2 ++;
				}
				count2 = 0;
			}
			pairs3count = 0;
			count3ToituCount = 0;
		}

		return Card;
	}

	/**
	 * 3連続の数字があれば消す
	 * @param Card
	 * @return
	 */
	public static int[] ThreeConsecutiveNumber(int[] Card) {

		int[][] count3Zyuntu = new int[3][2];

		int count3ZyuntuCount = 0;

		int k = 1;
		int i = 0;
		int j = 0;

		while(i < 7) {

			outer:
			while(true){

				if(k == 4) {
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

				if(j == 9) {
					j = 0;
					i++;
					break;
				}

				if(Card[j] == k + i) {
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

}