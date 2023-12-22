import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// 標準入力用のオブジェクトを用意（コンソールの入力を受け取る用）
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String inputStr = null;  // 入力値の文字列を受け取る用の変数
		char[] charNumber = null;  // 入力値の文字列を受ける用の文字配列
		Map<Integer, Integer> strNumberArr = new HashMap<>();  // 文字配列の合計値を保持用のマップ
		int index = 0;  // マップのkey用
		// 無限ループ
		while (true) {
			inputStr = input.readLine();  // 入力値を文字列として受け取る
			// 入力された文字が、"0"の場合
			if ("0".equals(inputStr)) {
				// "0"が入力されるまでに入力された文字列の数値としての合計
				for (Map.Entry<Integer, Integer> entry : strNumberArr.entrySet()) {
					System.out.println(entry.getValue());
				}
				break; // while文を抜ける。無限ループからの脱出
				
			} else {
				// 入力された文字列を文字配列に
				charNumber = inputStr.toCharArray();
				// 文字数だけループ
				for (int i = 0, sum = 0; i < charNumber.length; i++) {
					// 文字を数値として合計する
					sum += Character.getNumericValue(charNumber[i]);
					// ループの最後に、マップに保存
					if (i == charNumber.length - 1) {
						strNumberArr.put(index, sum);
						index++;  // マップのkeyをインクリメンタルジャーニー（+1加算してます）
					}
				}
			}

		}
	}

}

