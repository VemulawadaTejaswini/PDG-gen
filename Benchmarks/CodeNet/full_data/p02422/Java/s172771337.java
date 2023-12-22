import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *  * Lesson9D 文字列 str に対して、与えられた命令の列を実行するプログラム
 * 命令は以下の操作のいずれかです
 * ?print a b: str の a文字目から b 文字目までを出力する。
 * ?reverse a b: str の a 文字目から b 文字目までを逆順にする。
 * ?replace a b p: str の a 文字目から b 文字目までを p に置き換える。
 * ここでは、文字列 str の最初の文字を 0 文字目とする
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

		try {
			BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));

			// 答えの格納場所
			ArrayList<String> StringAry = new ArrayList<String>();

			// 1行目読み込む
			String strLine1 = insBR.readLine();

			// 2行目以降を読み込む
			String strLine2 = insBR.readLine();

			int intNum = Integer.parseInt(strLine2);

			// 命令文の格納場所
			String[] strStatement = new String[intNum];

			// 命令文の1つ目の数字と2つ目の数字の格納場所
			int[][] intStatement = new int[2][intNum];

			// 3行目以降を読み込む
			for (int i = 0; i < intNum; i++) {

				String strLineAll = insBR.readLine();

				// 文字列の分割:入力値を" "で分ける
				// 分けた文字列はstrLineAry[0]とstrLineAry[1]とstrLineAry[2]に分けられる
				String[] strLineAry = strLineAll.split(" ");

				// 命令文の格納
				strStatement[i] = strLineAry[0];

				// 命令文の1つ目の数字
				intStatement[0][i] = Integer.parseInt(strLineAry[1]);

				// 命令文の2つ目の数字
				intStatement[1][i] = Integer.parseInt(strLineAry[2]);

				// replaceを実行
				if (strStatement[i].equals("replace")) {

					// 4つ目のStringを取得
					String strReplace = strLineAry[3];

					// char型に分解
					char[] chaAryReplace = strReplace.toCharArray();

					// char型に分解
					char[] charAryLine1 = strLine1.toCharArray();

					int intLength = intStatement[1][i] - intStatement[0][i];

					System.arraycopy(chaAryReplace, 0, charAryLine1,
							intStatement[0][i], intLength + 1);

					// charを繋げてStringにする
					strLine1 = String.valueOf(charAryLine1);

				} else if (strStatement[i].equals("reverse")) {

					// char型に分解
					char[] chaAryLine = strLine1.toCharArray();

					// 分解された物が入っている配列をコピー
					char[] chaAryAfter = new char[chaAryLine.length];

					System.arraycopy(chaAryLine, 0, chaAryAfter, 0,
							chaAryLine.length);

					// reverseする個数
					int intreverse = intStatement[1][i] - intStatement[0][i];

					for (int j = 0; j < intreverse; j++) {

						chaAryAfter[intStatement[1][i] - 1 - j] = chaAryLine[intStatement[0][i]
								- 1 + j];
					}

					// charを繋げてStringにする
					strLine1 = String.valueOf(chaAryAfter);

				} else if (strStatement[i].equals("print")) {

					// char型に分解
					char[] chaAryLine = strLine1.toCharArray();

					// printする個数
					int intprint = intStatement[1][i] - intStatement[0][i];

					char[] charPrint = new char[intprint + 1];

					// printする文字を格納
					for (int j = 0; j <= intprint; j++) {
						charPrint[j] = chaAryLine[j + intStatement[0][i]];
					}

					// charを繋げてStringにする
					String strLineprint = String.valueOf(charPrint);

					StringAry.add(strLineprint);

				}
			}

			// 答えが何個あるか取得
			int intSize = StringAry.size();

			// 出力
			for (int i = 0; i < intSize; i++) {
				System.out.println(StringAry.get(i));
			}

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字で入力して下さい");
		}
	}
}