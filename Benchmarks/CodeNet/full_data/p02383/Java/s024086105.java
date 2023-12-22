import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lesson11A サイコロを転がすシミュレーションを行うプログラム
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

		// さいころ６面
		int[] intDice = new int[6];

		// 1行目を取得
		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			String strLine = insBR.readLine();

			// 分解
			String[] strAryLine1 = strLine.split(" ");

			// さいころの面の各数字を格納
			for (int i = 0; i < intDice.length; i++) {
				intDice[i] = Integer.parseInt(strAryLine1[i]);
			}

			// ２行目取得
			strLine = insBR.readLine();

			// 分解
			String[] strAryLine2 = strLine.split("");

			//NかEかWかSのいずれかが入っていたら、そのスレッドへ
			for (int i = 0; i < strAryLine2.length; i++) {

				//Nのほうへ転がす
				if (strAryLine2[i].equals("N")) {
					goNorth(intDice);

				//Eのほうへ転がす
				} else if (strAryLine2[i].equals("E")) {
					goEast(intDice);

				//Wのほうへ転がす
				} else if (strAryLine2[i].equals("W")) {
					goWest(intDice);

				//Sのほうへ転がす
				} else if (strAryLine2[i].equals("S")) {
					goSouth(intDice);
				}

			}
			//出力
			System.out.println(intDice[0]);

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}

	/**
	 * Nの方へ転がした時にサイコロ目が変わる。 変わった状態へするメソッド
	 *
	 * @param intDice
	 */
	public static void goNorth(int[] intDice) {

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
	public static void goEast(int[] intDice) {

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
	public static void goWest(int[] intDice) {

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
	public static void goSouth(int[] intDice) {

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