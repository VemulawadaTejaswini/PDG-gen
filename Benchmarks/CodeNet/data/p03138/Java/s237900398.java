import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		long N = Long.parseLong(line.split(" ")[0]);
		long K = Long.parseLong(line.split(" ")[1]);

		List<Long> as = new ArrayList<Long>();
		line = br.readLine();
		for (String s : line.split(" ")) {
			as.add(Long.valueOf(s));
		}
		Collections.sort(as);

		// 今回考えなければならないバイト数を取得
		int byteCount = 0;
		for (long l : as) {
			int i = Long.toBinaryString(l).toCharArray().length;
			if (byteCount < i) {
				byteCount = i;
			}
		}
		if (byteCount < Long.toBinaryString(K).toCharArray().length) {
			byteCount = Long.toBinaryString(K).toCharArray().length;
		}

		// Aたちを二次元配列に格納
		char[][] values = new char[as.size()][byteCount];
		for (int i = 0; i < as.size(); i++) {
			char[] l = new char[byteCount];
			for (int j = 0; j < byteCount; j++) {
				l[j] = '0';
			}
			char[] buf = Long.toBinaryString(as.get(i)).toCharArray();
			for (int j = 0; j < buf.length; j++) {
				l[byteCount - buf.length + j] = buf[j];
			}
			for (int j = 0; j < l.length; j++) {
				values[i][j] = l[j];
			}
		}

		// 純粋に 最も良い X を検索
		String result = "";
		for (int i = 0; i < byteCount; i++) {
			long oneCount = 0;
			long zeroCount = 0;
			for (int j = 0; j < as.size(); j++) {
				if (values[j][i] == '1') {
					oneCount++;
				} else {
					zeroCount++;
				}
			}
			if (oneCount >= zeroCount) {
				result += "0";
			} else {
				result += "1";
			}
		}

		if (K == 0) {
			result = "0";
		} else if (Long.parseLong(result, 2) > K) {

			char[] resultChar = result.toCharArray();
			char[] KChar = Long.toBinaryString(K).toCharArray();

			String str = "";

			for (int i = KChar.length - 1; i >= 0; i--) {
				if (resultChar[i] == KChar[i]) {
					str += resultChar[i];
				} else {
					str += "0";
				}
			}
			result = str;
		}

		char resuleChar[] = new char[byteCount];
		char[] c = result.toCharArray();
		int len = result.toCharArray().length;
		for (int i = 0; i < byteCount; i++) {
			resuleChar[i] = '0';
		}
		for (int i = 0; i < len; i++) {
			resuleChar[byteCount - len + i] = c[i];
		}

		long result2 = 0;

		for (int i = 0; i < as.size(); i++) {

			for (int j = 0; j < byteCount; j++) {

				if (values[i][j] != resuleChar[j]) {
					result2 += Math.pow(2, byteCount - j - 1);
				}

			}

		}

		System.out.println(result2);
	}

}