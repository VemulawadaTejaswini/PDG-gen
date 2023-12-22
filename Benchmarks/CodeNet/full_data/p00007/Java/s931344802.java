import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	// 繰り上げ金額の単位(円)
	private static final int ROUND_UNIT = 1000;

	// 利子
	private static final double LOAN_INTEREST = 1.05;

	/**
	 * 返済額計算実行
	 */
	public static void main(String[] args) throws Exception {

		// 標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// 返済額の計算
		new Main().calcAmountRepaid(Integer.parseInt(reader.readLine()));
	}

	/**
	 * 返済額計算
	 */
	private void calcAmountRepaid(int weekNum) {

		// 借金10万円を初期値とする
		int debt = 100000;

		// 週単位で返済額を計算
		for (int i = 0; i < weekNum; i++) {

			// 利子込みの返済額を計算
			debt *= LOAN_INTEREST;

			// 計算結果から1000円未満を切り上げ
			if (debt % ROUND_UNIT != 0) {
				debt = ROUND_UNIT * (debt / ROUND_UNIT + 1);
			} else {
				debt = ROUND_UNIT * (debt / ROUND_UNIT);
			}

		}

		// 結果出力
		System.out.println(debt);

	}

}