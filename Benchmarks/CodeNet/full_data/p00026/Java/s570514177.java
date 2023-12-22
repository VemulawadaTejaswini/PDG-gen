import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*** 0026 */
public class Main {

	/*** 紙 */
	private static int[][] paper;
	/*** インク滴「小」,「中」,「大」 */
	private static final int S = 1, M = 2, L = 3;
	/*** 文字型入力ストリーム（標準入力） */
	private static BufferedReader br;
	/*** 拡大する大きさ */
	private static int plus = 2;
	/*** 通常の紙の大きさ */
	private static int normal = 10;
	/*** 列, 行, インク滴の大きさ, 色のついていない部分, 最も色の濃い部分 */
	private static int x, y, size, blindNum = 0, max;
	/*** 入力行 */
	private static String line;

	/*** 初期化 */
	static {
		paper = new int[normal + plus * plus][normal + plus * plus];// 縦横ともに紙のサイズを拡大する（計算しやすくするため）
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * メインメソッド
	 */
	public static void main(String[] args) throws IOException {

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			setInput(line); // 入力行を設定する
		}
		calcu(); // 計算する
		System.out.println(blindNum + "\n" + max);
	}

	/**
	 * 入力行の設定を設定する
	 */
	private static void setInput(String line) {
		StringTokenizer st = new StringTokenizer(line, ","); // カンマごとに分ける
		x = Integer.parseInt(st.nextToken()) + plus; // 紙を拡大した分マスを大きくする
		y = Integer.parseInt(st.nextToken()) + plus; // 紙を拡大した分マスを大きくする
		size = Integer.parseInt(st.nextToken());
		set(); // インク滴を設定
	}

	/**
	 * 色のついていない部分のマス目の個数と１番濃いマス目の濃さを計算する。
	 */
	private static void calcu() {
		for (x = plus; x < normal + plus; x++) {
			for (y = plus; y < normal + plus; y++) {
				if (paper[x][y] == 0) // 色のついていない部分かどうか
					blindNum++;
				if (max < paper[x][y]) // １番濃いマス目かどうか
					max = paper[x][y];
			}
		}
	}

	/**
	 * 入力値に対応する場所にインキ滴を設定する
	 */
	private static void set() {
		paper[x][y]++;
		if (size >= S) {
			paper[x - 1][y]++;
			paper[x + 1][y]++;
			paper[x][y - 1]++;
			paper[x][y + 1]++;
		}
		if (size >= M) {
			paper[x - 1][y - 1]++;
			paper[x - 1][y + 1]++;
			paper[x + 1][y - 1]++;
			paper[x + 1][y + 1]++;
		}
		if (size >= L) {
			paper[x - 2][y]++;
			paper[x + 2][y]++;
			paper[x][y - 2]++;
			paper[x][y + 2]++;
		}
	}
}