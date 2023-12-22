import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		// 1行目を取得
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		String strNum = insBR.readLine();

		// データセット数
		int DataSetNum = Integer.parseInt(strNum);

		//データセットの数の分、答えがあるので
		//答えを保存する為、配列を作成し初期化
		Field[] fieldAnswer = new Field[DataSetNum];

		// 判断する回数まわす
		for (int i = 0; i < DataSetNum; i++) {

			// 2行目取得
			String strLine2 = insBR.readLine();

			// 分解
			String[] strLineAry = strLine2.split(" ");

			// マップの高さ
			int intHeight = Integer.parseInt(strLineAry[0]);

			// マップの幅
			int intWidth = Integer.parseInt(strLineAry[1]);

			// フィールド情報を引数で渡す配列を作成
			char[][] charBlock = new char[intHeight][intWidth];

			// フィールド情報を1列づつ読み込む
			for (int j = 0; j < intHeight; j++) {

				String strBlock = insBR.readLine();

				// 分解
				char[] chBlock = strBlock.toCharArray();

				// 格納
				for (int k = 0; k < intWidth; k++) {
					charBlock[j][k] = chBlock[k];
				}
			}

			// フィールドを作成
			Field field = new Field(charBlock);

			// 行動がいくつあるか読み込み
			String strLine3 = insBR.readLine();

			int ActionNum = Integer.parseInt(strLine3);

			// 行動を読み込み
			String strAction = insBR.readLine();

			// 分解
			char chAction[] = strAction.toCharArray();

			// 戦車を作成
			Tank tank = new Tank(chAction);

			tankAction(field, tank);

			fieldAnswer[i] = field;

		}

		//出力
		for (int i = 0; i < fieldAnswer.length; i++) {

			if(i != 0) {
				System.out.println("");
			}

			fieldAnswer[i].fieldPrint();
		}

	}

	/**
	 * 入力値通り戦車を動かす
	 * @param field　フィールドのインスタンス
	 * @param tank　戦車のインスタンス
	 */
	public static void tankAction(Field field, Tank tank) {

		// 戦車の位置を把握
		int[] intPosion = field.LookPosition();

		int ActionNum = tank.getActionNum();

		for(int i = 0; i < ActionNum; i++) {
		char chAction = tank.getAction(i);

		if (chAction == 'S') {

			//ポジションを覚えておく
			int intPosionBeforeHeight = intPosion[0];
			int intPosionBeforeWidth= intPosion[1];

			//大砲を撃つ
			field.actionS(intPosion, 0);

			//ポジションを覚えておいた場所に戻す
			intPosion[0] = intPosionBeforeHeight;
			intPosion[1] = intPosionBeforeWidth;

		}else if (chAction == 'U') {

			intPosion = field.actionU(intPosion);

		}else if (chAction == 'D') {

			intPosion = field.actionD(intPosion);

		}else if (chAction == 'R') {

			intPosion = field.actionR(intPosion);

		}else if (chAction == 'L') {

			intPosion = field.actionL(intPosion);

		}
		}

	}

	public static class Field {

		char[][] Block;

		// 平地
		char chFlatland = '.';

		// レンガの壁
		char chBrickWall = '*';

		// 鉄の壁
		char chWallIron = '#';

		// 水
		char chWater = '-';

		// 戦車（上向き）
		char chUpTank = '^';

		// 戦車（下向き）
		char chDownTank = 'v';

		// 戦車（右向き）
		char chRightTank = '>';

		// 戦車（左向き）
		char chLeftTank = '<';

		// 戦車が動く前のフィールドの状態
		char chBefore = '.';

		char[] chTank = { chUpTank, chDownTank, chRightTank, chLeftTank };

		Field(char[][] Block) {

			this.Block = Block;

		}

		// //戦車の位置
		int[] LookPosition() {

			int[] intPosition = new int[2];

			for (int i = 0; i < Block.length; i++) {
				for (int j = 0; j < Block[0].length; j++) {
					for (int k = 0; k < chTank.length; k++) {
						if (chTank[k] == Block[i][j]) {

							intPosition[0] = i;
							intPosition[1] = j;
						}
					}
				}
			}

			return intPosition;
		}

		/**
		 * 行動S　大砲を撃つ
		 * '.'平地なら通り過ぎる
		 * '*'レンガの壁なら、壊れて'.'平地になる
		 * '#'鉄の壁なら大砲が消える
		 * '-'水なら通り過ぎる
		 * ポジションが通り過ぎたり、フィールド値が変更になったりする
		 * @param intPosion int[]型でint[0]に上下位置(下へいくとプラス、上へ行くとマイナス)
		 * int[1]に左右位置(右へいくとプラス、左へ行くとマイナス)が入っている
		 * @param intDirection 0は向き不明 1は戦車上向き 2は戦車下向き 3は戦車右向き 4は戦車左向き
		 */
		void actionS(int[] intPosion, int intDirection) {

			//ポジションの上下位置
			int intHeight = intPosion[0];

			//ポジションの左右位置
			int intWidth = intPosion[1];

			//フィールドからはみ出したら終わり
			if(intHeight < 0 ||
					Block.length <= intHeight ||
					intWidth < 0 ||
					Block[0].length <= intWidth) {
				return;
			}

			//まず戦車の向きを調べる
			//intDirectionは最初0で来る
			//intDirectionが0の時の動きになる

			//戦車が上向きなら
			if(Block[intHeight][intWidth] == '^') {

				//ポジションを上に移動
				//intDirectionが1
				//回帰する
				goUpPosion(intPosion,1);
				return;

			}else if(Block[intHeight][intWidth] == 'v') {

				//ポジションを下に移動
				//intDirectionが2
				//回帰する
				goDowmPosion(intPosion,2);
				return;

			}else if(Block[intHeight][intWidth] == '>') {

				//ポジションを右に移動
				//intDirectionが3
				//回帰する
				goRightPosion(intPosion,3);
				return;

			}else if(Block[intHeight][intWidth] == '<') {

				//ポジションを左に移動
				//intDirectionが4
				//回帰する
				goLeftPosion(intPosion,4);
				return;
			}

			//フィールド値によって行動
			//回帰で戻ってきたらココへ来る
			//intDirectionが1〜4の時の動きになる

			//平地と水の時
			if(Block[intHeight][intWidth] == '.' || Block[intHeight][intWidth] == '-') {

				switch(intDirection) {

				case 1:

					//ポジションを上に移動
					goUpPosion(intPosion,1);
					return;

				case 2:

					//ポジションを下に移動
					goDowmPosion(intPosion,2);
					return;

				case 3:

					//ポジションを右に移動
					goRightPosion(intPosion,3);
					return;

				case 4:

					//ポジションを左に移動
					goLeftPosion(intPosion,4);
					return;

				}
			}else if(Block[intHeight][intWidth] == '*') {

				Block[intHeight][intWidth] = '.';

			}else if(Block[intHeight][intWidth] == '#') {

				//何もなし

			}

		}

		/**
		 * 行動U　戦車が上に行ければ移動
		 * @param intPosion
		 */
		int[] actionU(int[] intPosion) {

			//ポジションの上下位置
			int intHeight = intPosion[0];

			//ポジションの左右位置
			int intWidth = intPosion[1];

			//ポジションを上に移動
			intHeight--;

			//フィールドからはみ出したら終わり
			if(intHeight < 0 || Block.length <= intHeight) {

				Block[intHeight + 1][intWidth] = '^';

				return intPosion;
			}

			if(Block[intHeight][intWidth] == '.') {

				//上に移動した後は戦車があった場所にフィールド値を与える
				Block[intHeight + 1][intWidth] = chBefore;

				Block[intHeight][intWidth] = '^';

				intPosion[0]--;

			} else {
				Block[intHeight + 1][intWidth] = '^';
			}

			return intPosion;

		}

		/**
		 * 行動D　戦車が下に行ければ移動
		 * @param intPosion
		 */
		int[] actionD(int[] intPosion) {

			//ポジションの上下位置
			int intHeight = intPosion[0];

			//ポジションの左右位置
			int intWidth = intPosion[1];

			//ポジションを下に移動
			intHeight++;

			//フィールドからはみ出したら終わり
			if(intHeight < 0 || Block.length <= intHeight ) {

				Block[intHeight - 1][intWidth] = 'v';
				return intPosion;
			}

			if(Block[intHeight][intWidth] == '.') {

				//上に移動した後は戦車があった場所にフィールド値を与える
				Block[intHeight - 1][intWidth] = chBefore;

				Block[intHeight][intWidth] = 'v';

				intPosion[0]++;

			} else {
				Block[intHeight - 1][intWidth] = 'v';
			}

			return intPosion;

		}

		/**
		 * 行動R　戦車が右に行ければ移動
		 * @param intPosion
		 */
		int[] actionR(int[] intPosion) {

			//ポジションの上下位置
			int intHeight = intPosion[0];

			//ポジションの左右位置
			int intWidth = intPosion[1];

			//ポジションを右に移動
			intWidth++;

			//フィールドからはみ出したら終わり
			if(intWidth < 0 || Block[0].length <= intWidth) {

				Block[intHeight][intWidth - 1] = '>';
				return intPosion;
			}

			if(Block[intHeight][intWidth] == '.') {

				//右に移動した後は戦車があった場所にフィールド値を与える
				Block[intHeight][intWidth - 1] = chBefore;

				Block[intHeight][intWidth] = '>';

				intPosion[1]++;

			} else {
				Block[intHeight][intWidth - 1] = '>';
			}

			return intPosion;
		}

		/**
		 * 行動L　戦車が左に行ければ移動
		 * @param intPosion
		 */
		int[] actionL(int[] intPosion) {

			//ポジションの上下位置
			int intHeight = intPosion[0];

			//ポジションの左右位置
			int intWidth = intPosion[1];

			//ポジションを左に移動
			intWidth--;

			//フィールドからはみ出したら終わり
			if(intWidth < 0 || Block[0].length <= intWidth) {

				Block[intHeight][intWidth + 1] = '<';
				return intPosion;
			}

			if(Block[intHeight][intWidth] == '.') {

				//左に移動した後は戦車があった場所にフィールド値を与える
				Block[intHeight][intWidth + 1] = chBefore;

				Block[intHeight][intWidth] = '<';

				intPosion[1]--;

			} else {
				Block[intHeight][intWidth + 1] = '<';
			}

			return intPosion;
		}

		/**
		 * ポジションを１つ上に移動
		 * @param intPosion
		 * @param intDirection
		 */
		void goUpPosion(int[] intPosion, int intDirection) {

			//上のブロックを参照するので
			//ポジションを1個上へ変更
			intPosion[0]--;

			//回帰処理
			actionS(intPosion, intDirection);
		}

		/**
		 * ポジションを１つ下に移動
		 * @param intPosion
		 * @param intDirection
		 */
		void goDowmPosion(int[] intPosion, int intDirection) {

			//上のブロックを参照するので
			//ポジションを1個上へ変更
			intPosion[0]++;

			//回帰処理
			actionS(intPosion, intDirection);
		}

		/**
		 * ポジションを１つ右に移動
		 * @param intPosion
		 * @param intDirection
		 */
		void goRightPosion(int[] intPosion, int intDirection) {

			//上のブロックを参照するので
			//ポジションを1個上へ変更
			intPosion[1]++;

			//回帰処理
			actionS(intPosion, intDirection);
		}

		/**
		 * ポジションを１つ左に移動
		 * @param intPosion
		 * @param intDirection
		 */
		void goLeftPosion(int[] intPosion, int intDirection) {

			//上のブロックを参照するので
			//ポジションを1個上へ変更
			intPosion[1]--;

			//回帰処理
			actionS(intPosion, intDirection);
		}

		void fieldPrint() {

			for (int i = 0; i < Block.length; i++) {
				for (int j = 0; j < Block[0].length; j++) {
					System.out.print(Block[i][j]);
				}

				System.out.println();
			}
		}
	}

	public static class Tank {

		char[] chAction;

		Tank(char[] chAction) {

			this.chAction = chAction;
		}

		// 行動を提供
		char getAction(int ActionNum) {

			return chAction[ActionNum];

		}

		int getActionNum() {
			return chAction.length;
		}

	}

}