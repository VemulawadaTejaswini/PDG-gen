import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	// インク滴を落とすマス
	private int[][] cell = new int[10][10];

	public static void main(String[] args) throws Exception {
		new Main().execute();
	}

	/**
	 * 計算実行
	 */
	private void execute() throws IOException {

		// 標準入力
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// 標準入力を１行ずつ処理
		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] inkInfo = line.split(",");

			// インクを落とした結果を紙に反映
			calcInkDropPoint(Integer.parseInt(inkInfo[0]),
					Integer.parseInt(inkInfo[1]), Integer.parseInt(inkInfo[2]));
		}

		// 結果を出力
		outputInkDropPoint();

	}

	/**
	 * インク滴を落とした結果を紙に反映
	 * 
	 * @param x
	 *            X座標
	 * @param y
	 *            Y座標
	 * @param size
	 *            インク滴のサイズ
	 */
	private void calcInkDropPoint(int x, int y, int size) {

		// インクが落ちた箇所にポイント加算
		cell[x][y] += 1;

		// 小の滴が落ちた座標にポイント加算
		addPoint(x + 1, y);
		addPoint(x - 1, y);
		addPoint(x, y + 1);
		addPoint(x, y - 1);

		// 中の滴が落ちた座標にポイント加算
		if (size > 1) {
			addPoint(x + 1, y + 1);
			addPoint(x - 1, y + 1);
			addPoint(x + 1, y - 1);
			addPoint(x - 1, y - 1);
		}

		// 大の滴が落ちた座標にポイント加算
		if (size > 2) {
			addPoint(x + 2, y);
			addPoint(x - 2, y);
			addPoint(x, y + 2);
			addPoint(x, y - 2);
		}

	}

	/**
	 * インク滴を落とした結果を出力 「色のついていない部分のマス目の個数」と「１番濃いマス目の濃さ」を出力する。
	 */
	private void outputInkDropPoint() {

		int totalCell = 0;
		int maxPoint = 0;

		for (int i = 0; i < cell.length; i++) {
			for (int j = 0; j < cell[i].length; j++) {

				// 色のついていないセル個数を計算
				if (cell[i][j] == 0) {
					totalCell += 1;
				}

				// 最高得点の計算
				if (cell[i][j] > maxPoint) {
					maxPoint = cell[i][j];
				}
			}
		}

		// 結果を標準出力
		System.out.println(totalCell);
		System.out.println(maxPoint);
	}

	/**
	 * インク滴が滲む範囲か判定
	 * 
	 * @param direction
	 *            座標
	 * @return 判定結果(true:範囲内、false:範囲外)
	 */
	private boolean isInsideOfCell(int direction) {
		return (direction >= 0) && (direction < 10);
	}

	/**
	 * インク滴が滲む範囲であれば加算
	 * 
	 * @param x
	 *            X座標
	 * @param y
	 *            Y座標
	 */
	private void addPoint(int x, int y) {
		// 範囲内であれば加点
		if (isInsideOfCell(x) && isInsideOfCell(y)) {
			cell[x][y] += 1;
		}
	}

}