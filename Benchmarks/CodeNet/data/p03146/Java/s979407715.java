import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// ============================================================
		// 標準入力を変数に設定
		// ============================================================

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int s = Integer.parseInt(br.readLine());

		List<Integer> sums = new ArrayList<Integer>();

		boolean ok = true;
		int i = 0;
		sums.contains(s);
		while (ok) {

			i++;

			s = calc(s, i);

			if (sums.contains(s)) {
				System.out.println(i + 1);
				return;
			} else {
				sums.add(s);
			}

		}

	}

	static int calc(int num, int i) {

		if (num % 2 == 0) {
			return num / 2;

		} else {
			return num * 3 + 1;
		}

	}
}