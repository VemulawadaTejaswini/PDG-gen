import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {

			// 辞書の件数を取得する
			int count = Integer.parseInt(readLine(reader));

			// 終了判定を行う
			if (count == 0) {
				return;
			}

			Map<String, String> dictionary = createDictionary(count, reader);
			int loop = Integer.parseInt(readLine(reader));
			// 1文字ずつ変換して出力する
			for (int i = 0; i < loop; i++) {
				String ch = readLine(reader);
				String output = dictionary.get(ch);
				if (output == null) {
					output = ch;
				}
				System.out.print(output);
			}
			System.out.println();
		}
	}

	/**
	 * ストリームから1行読み込んで、文字列として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return　文字列
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
	 * ストリームを読んで変換辞書を作成する。
	 *
	 * @param count 辞書の件数
	 * @param reader 入力ストリーム
	 * @return 変換辞書
	 */
	private static Map<String, String> createDictionary(int count,
			BufferedReader reader) {
		Map<String, String> dictionary = new HashMap<String, String>();
		for (int i = 0; i < count; i++) {
			String[] array = readLine(reader).split(" ");
			dictionary.put(array[0], array[1]);
		}
		return dictionary;
	}
}