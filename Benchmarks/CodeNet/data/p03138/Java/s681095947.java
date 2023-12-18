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

		//int byteCount = Long.toBinaryString(K).toCharArray().length;

		char[][] values = new char[as.size()][byteCount];
		for (int i = 0; i < as.size(); i++) {
			char[] l = new char[byteCount];
			char[] buf = Long.toBinaryString(as.get(i)).toCharArray();
			for (int j = 0; j < byteCount; j++) {
				l[j] = '0';
			}
			for (int j = 0; j < buf.length; j++) {
				l[byteCount - buf.length + j] = buf[j];
			}
			for (int j = 0; j < l.length; j++) {
				values[i][j] = l[j];
			}
		}

		String result = "";

		// 全バイト
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
		} else {

			char[] resultChar = result.toCharArray();
			while (Long.parseLong(result, 2) > K) {

				long diff = Long.parseLong(result, 2) - K;

				int pow = 1;
				long buf = diff;
				while (buf >= 2) {
					pow++;
					buf = buf / 2;
				}

				for (int i = pow; i < resultChar.length; i++) {
					if (resultChar[resultChar.length - i - 1] == '1') {
						resultChar[resultChar.length - i - 1] = '0';
						break;
					}
				}
				result = String.valueOf(resultChar);
			}
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