import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	/** 元金 */
	private static final BigDecimal PRINCIPAL = BigDecimal.valueOf(100000);

	/** 利息による増加率 */
	private static final BigDecimal RATE_OF_INCREASE = BigDecimal.valueOf(1.05);

	/**
	 * 入力された期間から返済額を計算して出力する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 期間を受け取る
		int week = readNumber();

		// 返済額を計算する
		BigDecimal debt = PRINCIPAL;
		for (int i = 0; i < week; i++) {
			// 1週間ごとに5%利子をつけ、1000円未満は切り上げる
			debt = debt.multiply(RATE_OF_INCREASE).setScale(-3,
					RoundingMode.CEILING);
		}

		// 計算結果を出力する
		System.out.println(debt.toPlainString());
	}

	/**
	 * 標準入力から1行読み込んで返す。
	 *
	 * @return 入力された数値
	 */
	protected static int readNumber() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String line = reader.readLine();

		if (reader != null) {
			reader.close();
		}

		return Integer.parseInt(line);
	}

}