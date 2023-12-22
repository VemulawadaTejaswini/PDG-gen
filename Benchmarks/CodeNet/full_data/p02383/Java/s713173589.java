import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson11A サイコロを転がすシミュレーションを行うプログラム
 *
 * @author Internship
 *
 */
public class Lesson11A {

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

			//転がす
			insDiceDiceNum.roll(strLine);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}

/**
 * サイコロの目が保存されている。
 *
 */
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

	/**
	 * N(北)へ転がすと目が変わるなど行動
	 *
	 * @param strLine N(北)S(南)などStringで連続でもっている 例:NEE
	 */
	void roll(String strLine) {

		// 分解
		String[] strAryLine = strLine.split("");

		// NかEかWかSのいずれかが入っていたら、そのスレッドへ
		for (int i = 0; i < strAryLine.length; i++) {

			// Nのほうへ転がす
			if (strAryLine[i].equals("N")) {
				goNorth(intDice);
				// Eのほうへ転がす
			} else if (strAryLine[i].equals("E")) {
				goEast(intDice);
				// Wのほうへ転がす
			} else if (strAryLine[i].equals("W")) {
				goWest(intDice);
				// Sのほうへ転がす
			} else if (strAryLine[i].equals("S")) {
				goSouth(intDice);
			}
		}

	}

	/**
	 * Nの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */

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

	/**
	 * Eの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
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

	/**
	 * Wの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
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

	/**
	 * Sの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
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