import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/** 歩数 */
	private static final int STEP = 0;

	/** 方向 */
	private static final int DEGREE = 1;

	/**
	 * 宝探しをシミュレートする。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力値を受け取る
		List<int[]> pairList = readPairList();

		// 初期位置
		int degree = 90; // 北を向いているものとする
		double x = 0;
		double y = 0;

		// 指示どおりに移動する
		for (int[] pair : pairList) {

			// 向いている方向から x, y それぞれの移動距離を計算する
			double radian = Math.toRadians(degree);
			double moveX = Math.cos(radian) * pair[STEP];
			double moveY = Math.sin(radian) * pair[STEP];

			// 移動する
			x += moveX;
			y += moveY;

			// デバッグ
			// printResult(x, y);

			// 向いている方向を変える
			degree -= pair[DEGREE];
		}

		// 結果を出力する
		printResult(x, y);
	}

	/**
	 * 標準入力からカンマ区切りの数値を取得し、2次元配列として返却する。
	 *
	 * @return 整数ペアの2次元配列（2×データ数）
	 */
	protected static List<int[]> readPairList() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// 1行につき2データ取り込む
		List<int[]> pairList = new ArrayList<int[]>();
		while (true) {
			String[] line = reader.readLine().split(",");
			int step = Integer.parseInt(line[STEP]);
			int degree = Integer.parseInt(line[DEGREE]);

			if (step == 0 && degree == 0) {
				// 0,0 が指定されたら終了する
				break;
			}

			// 数値ペアを作成し、リストに追加する
			int[] pair = new int[2];
			pair[STEP] = step;
			pair[DEGREE] = degree;
			pairList.add(pair);
		}

		if (reader != null) {
			reader.close();
		}

		return pairList;
	}

	/**
	 * 結果を出力する。
	 *
	 * @param x
	 *            X 座標
	 * @param y
	 *            Y 座標
	 */
	protected static void printResult(double x, double y) {
		printAsInteger(x);
		printAsInteger(y);
	}

	/**
	 * 引数で与えられた数値の整数部のみを出力する。
	 *
	 * @param value
	 *            出力する数値
	 */
	protected static void printAsInteger(Double value) {
		System.out.println(value.intValue());
	}

}