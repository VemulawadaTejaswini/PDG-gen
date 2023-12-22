import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/** 「紙」を配列として定義 */
	private static int[][] paper = new int[10][10];

	/** インクのサイズ：小を表す数字 */
	private final static String INK_SIZE_S = "1";

	/** インクのサイズ：中を表す数字 */
	private final static String INK_SIZE_M = "2";

	/** インクのサイズ：大を表す数字 */
	private final static String INK_SIZE_L = "3";

	/** 色のついていない部分のマス目の個数：初期値100 */
	private static int plainCells = 100;

	/** 一番濃いマス目の濃さ */
	private static int maximumValue = 0;

	/**
	 *
	 *
	 * @param args
	 *            利用しない。
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 入力値を受け取る
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// インクを垂らす
		String line = null;
		while ((line = br.readLine()) != null) {

			String[] inkInfo = line.split(",");
			int x = Integer.parseInt(inkInfo[0]);
			int y = Integer.parseInt(inkInfo[1]);
			String size = inkInfo[2];

			// 小のサイズのインクの濃さを加算
			dropInk(x, y); // 真ん中
			dropInk(x - 1, y); // 左
			dropInk(x + 1, y); // 右
			dropInk(x, y - 1); // 下
			dropInk(x, y + 1); // 上

			if (INK_SIZE_S.equals(size)) {
				continue;
			}

			// 中のサイズのインクの濃さを加算
			dropInk(x - 1, y - 1); // 左下
			dropInk(x - 1, y + 1); // 左上
			dropInk(x + 1, y - 1); // 右下
			dropInk(x + 1, y + 1); // 右上

			if (INK_SIZE_M.equals(size)) {
				continue;
			}

			// 大のサイズのインクの濃さを加算
			dropInk(x - 2, y); // 2つ左
			dropInk(x + 2, y); // 2つ右
			dropInk(x, y - 2); // 2つ下
			dropInk(x, y + 2); // 2つ上
		}

		// 結果を出力
		System.out.println(plainCells); // 色のついていない部分のマス目の個数
		System.out.println(maximumValue); // １番濃いマス目の濃さ
	}

	/**
	 * <p>
	 * 引数で指定されたマス目にインクを落とせるか（「紙」の大きさの範囲内か）を確認し、 落とせる場合はマス目の濃さを+1する。</br>
	 * この際、インクを落としたマス目の濃さが0であれば「色のついていない部分のマス目の個数」から1を引く。<br/>
	 * 「一番濃いマス目の濃さ」よりも濃くなるのであれば濃さを更新する。<br/>
	 * </p>
	 *
	 * @param x
	 *            インクを落とすマス目のx座標
	 * @param y
	 *            インクを落とすマス目のy座標
	 */
	private static void dropInk(int x, int y) {

		if (0 <= x && x < 10 && 0 <= y && y < 10) {
			if (paper[x][y] == 0) {
				plainCells -= 1;
			}

			paper[x][y] += 1;

			if (paper[x][y] > maximumValue) {
				maximumValue = paper[x][y];
			}

		}
	}

}