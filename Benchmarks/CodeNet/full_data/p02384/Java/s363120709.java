package Lesson11B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson11B サイコロを転がすシミュレーションを行うプログラム
 *
 * @author Internship
 *
 */
public class Main{

	/**
	 * プログラムのエントリポイント
	 *
	 * @param args
	 */
	public static void main(String[] args) {



		// 1行目取得
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

		try {
			String strLine = insBR.readLine();

			// １つのサイコロを作成
			DiceNum insDiceDiceNum = new DiceNum(strLine);

			// 2行目取得
			strLine = insBR.readLine();

			// 数を取得
			int intNum = Integer.parseInt(strLine);

			// 3行目以降取得
			for (int i = 0; i < intNum; i++) {

				strLine = insBR.readLine();






				System.out.println("3");
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

class DiceNum {

	// フィールド値
	int[] intDice = new int[6];

	// コンストラクタ
	DiceNum() {

	}

	DiceNum(String strLine) {

		// 分解
		String[] strAryLine = strLine.split(" ");

		// さいころの面の各数字を格納
		for (int i = 0; i < strAryLine.length; i++) {
			intDice[i] = Integer.parseInt(strAryLine[i]);
		}
	}

	// メソッド

	int getRightNum() {
		return intDice[2];
	}











	void goNorth(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 1, intAfter, 0, 1);
		System.arraycopy(intDice, 5, intAfter, 1, 1);
		System.arraycopy(intDice, 2, intAfter, 2, 1);
		System.arraycopy(intDice, 3, intAfter, 3, 1);
		System.arraycopy(intDice, 0, intAfter, 4, 1);
		System.arraycopy(intDice, 4, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}

	 void goEast(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 3, intAfter, 0, 1);
		System.arraycopy(intDice, 1, intAfter, 1, 1);
		System.arraycopy(intDice, 0, intAfter, 2, 1);
		System.arraycopy(intDice, 5, intAfter, 3, 1);
		System.arraycopy(intDice, 4, intAfter, 4, 1);
		System.arraycopy(intDice, 2, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}


	void goWest(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 2, intAfter, 0, 1);
		System.arraycopy(intDice, 1, intAfter, 1, 1);
		System.arraycopy(intDice, 5, intAfter, 2, 1);
		System.arraycopy(intDice, 0, intAfter, 3, 1);
		System.arraycopy(intDice, 4, intAfter, 4, 1);
		System.arraycopy(intDice, 3, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}


	void goSouth(int[] intDice) {

		// サイコロ目を移動後のサイコロ
		int[] intAfter = new int[intDice.length];

		// サイコロ目を移す
		System.arraycopy(intDice, 4, intAfter, 0, 1);
		System.arraycopy(intDice, 0, intAfter, 1, 1);
		System.arraycopy(intDice, 2, intAfter, 2, 1);
		System.arraycopy(intDice, 3, intAfter, 3, 1);
		System.arraycopy(intDice, 5, intAfter, 4, 1);
		System.arraycopy(intDice, 1, intAfter, 5, 1);

		// 元のサイコロへコピー
		System.arraycopy(intAfter, 0, intDice, 0, 6);

	}
}