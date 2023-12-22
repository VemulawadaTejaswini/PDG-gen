import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {

	// インデックス定数
	private static final int A = 0;
	private static final int B = 1;
	private static final int C = 2;
	private static final int D = 3;
	private static final int E = 4;
	private static final int F = 5;

	/**
	 * ax + by = c、dx + ey = f より、以下を用いてx,yを求める。
	 *  x = (f - ey)/d、 y = (cd -af)/(bd - ae)
	 *
	 */
	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {
			// 入力値を受け取り、合計を数値にして返す
			BigDecimal[] input = readNumArray(reader);
			// 入力がない場合は終了
			if (input == null) {
				return;
			}

			// 数式からxとyを求める
			BigDecimal y = input[C]
					.multiply(input[D])
					.subtract(input[A].multiply(input[F]))
					.divide(input[B].multiply(input[D]).subtract(
							input[A].multiply(input[E])));
			BigDecimal x = input[F].subtract(input[E].multiply(y)).divide(
					input[D]);

			// 結果を出力する
			System.out.println(x.setScale(3, BigDecimal.ROUND_HALF_UP) + " "
					+ y.setScale(3, BigDecimal.ROUND_HALF_UP));
		}
	}

	/**
	 * ストリームから1行読み込んで、数値の配列として返す。 値が取得できなかった場合はnullを返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 数値の配列
	 */
	private static BigDecimal[] readNumArray(BufferedReader reader) {
		String[] array = null;
		try {
			String line = reader.readLine();
			if (line == null || line.length() == 0) {
				return null;
			}
			array = line.split(" ");
		} catch (IOException e) {
			throw new RuntimeException();
		}
		BigDecimal[] numArray = new BigDecimal[array.length];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = new BigDecimal(array[i]);
		}
		return numArray;
	}
}