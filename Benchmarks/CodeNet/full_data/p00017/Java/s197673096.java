import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	// 基準となる単語
	private static final String[] CORRECT_WORDS = { "the", "that", "this" };

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {
			String line = readLine(reader);

			// 終了判定
			if (line == null) {
				break;
			}

			// 26パターン試す
			String result = null;
			for (int i = 1; i <= 26; i++) {
				// コード変換をかける
				result = shiftString(line, i);
				System.out.println(result);

				// 正しい変換ならここで変換終了
				if (isCorrect(result)) {
					break;
				}
			}

			// 結果を表示する
			System.out.println(result);
		}

	}

	/**
	 * ストリームから1行読み込んで、文字列として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 文字列
	 */
	private static String readLine(BufferedReader reader) {
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return line;
	}

	/**
	 * 文字列内のアルファベットを指定文字分だけシフトする。
	 *
	 * @param target
	 *            対象文字列
	 * @param shift
	 *            シフトする文字数
	 * @return シフト後の文字列
	 */
	private static String shiftString(String target, int shift) {
		StringBuilder buffer = new StringBuilder();

		for (int i = 0; i < target.length(); i++) {
			char ch = target.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch + shift);
				if (ch > 'z') {
					ch = (char) ((ch % ('z')) + 'a' - 1);
				}
			}
			buffer.append(ch);
		}

		return buffer.toString();
	}

	/**
	 * 渡された文字列に正しい単語が含まれているか確認する。
	 *
	 * @param target
	 *            チェック対象文字列
	 * @return 正しい場合はtrue、そうでない場合はfalse
	 */
	private static boolean isCorrect(String target) {
		boolean result = false;
		for (String word : CORRECT_WORDS) {
			if (target.contains(word)) {
				result = true;
				break;
			}
		}
		return result;
	}
}