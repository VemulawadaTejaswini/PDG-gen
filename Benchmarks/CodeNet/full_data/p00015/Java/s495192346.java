import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	/** 桁数の上限 */
	private static final int NUMBER_OF_DIGIT_LIMIT = 80;

	/** オーバーフロー時の出力文字列 */
	private static final String OVERFLOW_MESSAGE = "overflow";

	/**
	 * 80桁までの2つの数の合計を求める。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力値を受け取る
		BigDecimal[][] pairList = readPairList();

		for (BigDecimal[] pair : pairList) {

			boolean overflow = false;
			BigDecimal sum = BigDecimal.ZERO;

			for (BigDecimal value : pair) {
				if (isOverflow(value)){
					// 指定桁数を超えていたらフラグを立てて処理を止める
					overflow = true;
					break;
				}
				// 合計値に加算する
				sum = sum.add(value);
			}

			if (!overflow) {
				// 合計値がオーバーフローしているかチェックする
				overflow = isOverflow(sum);
			}

			// 出力
			printResult(sum, overflow);
		}

	}

	/**
	 * 標準入力から空白区切りの数値を取得し、2次元配列として返却する。
	 *
	 * @return 整数ペアの2次元配列（2×データ数）
	 */
	protected static BigDecimal[][] readPairList() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// 最初にデータの個数を取得する
		int numberOfLine = Integer.parseInt(reader.readLine());

		// 1行につき1データ、2行ずつ取り込む
		final int NUMBER_OF_ELEMENT = 2;
		BigDecimal[][] pairList = new BigDecimal[numberOfLine][NUMBER_OF_ELEMENT];
		for (int i = 0; i < pairList.length; i++) {
			for (int j = 0; j < pairList[i].length; j++) {
				String line = reader.readLine();
				pairList[i][j] = new BigDecimal(line);
			}
		}

		if (reader != null) {
			reader.close();
		}

		return pairList;
	}

	/**
	 * 引数で渡された値がオーバーフローしているかどうかを判定する。
	 *
	 * @param value チェック対象の値
	 * @return オーバーフローしていれば true、そうでなければ false
	 */
	protected static boolean isOverflow(BigDecimal value) {
		return (value.toPlainString().length() > NUMBER_OF_DIGIT_LIMIT);
	}

	/**
	 * 結果を出力する。
	 *
	 * @param sum 合計値
	 * @param overflow オーバーフローしていたかどうかのフラグ
	 */
	protected static void printResult(BigDecimal sum, boolean overflow) {

		if (overflow){
			// オーバーフローしていた場合は、専用メッセージを表示する
			System.out.println(OVERFLOW_MESSAGE);

		} else {
			// オーバーフローしていない場合は、合計値を表示する
			System.out.println(sum.toPlainString());
		}
	}
}