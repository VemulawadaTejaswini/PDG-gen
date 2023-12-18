import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String a, b, c;
	int result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		a = in.readLine();
		b = in.readLine();
		c = in.readLine();
	}

	boolean isMatch(String a, String b, int indexDiff) {
		// indexチェック
		if (indexDiff >= a.length()) {
			// かぶる場所がないのでOK
			return true;
		}
		boolean result = true;
		for (int i = indexDiff; i < Math.min(a.length(), indexDiff + b.length()); ++i) {
			int bIndex = i - indexDiff;
			if (!isMatch(a.charAt(i), b.charAt(bIndex))) {
				result = false;
				break;
			}
		}
		return result;
	}

	boolean isMatch(char a, char b) {
		if (a == '?' || b == '?') {
			return true;
		} else if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	char merge(char a, char b) {
		if (a == '?' && b == '?') {
			return '?';
		} else if (a == '?') {
			return b;
		} else {
			return a;
		}
	}

	String merge(String a, String b) {
		// bの開始場所を0->a.lengthまで変化させる
		int mergeIndex = 0;
		for (int i = 0; i <= a.length(); ++i) {
			if (isMatch(a, b, i)) {
				mergeIndex = i;
				break;
			}
		}

		StringBuilder strBuilder = new StringBuilder();
		// まず0-mergeIndex未満までaをコピーする
		strBuilder.append(a.substring(0, mergeIndex));
		// 次に，a: mergeindex, b: 0から, a: length, b: length のいずれか小さいほうにマージしていく
		for (int i = mergeIndex; i < Math.min(a.length(), mergeIndex + b.length()); ++i) {
			strBuilder.append(merge(a.charAt(i), b.charAt(i - mergeIndex)));
		}
		if (mergeIndex + b.length() > a.length()) {
			strBuilder.append(b.substring(b.length() - (mergeIndex + b.length() - a.length()), b.length()));
		} else {
			strBuilder.append(a.substring(mergeIndex + b.length(), a.length()));
		}

		String str = strBuilder.toString();
		return str;
	}

	void calc() {
		result = Integer.MAX_VALUE / 2;
		result = Math.min(result, subCalc(a, b, c).length());
		result = Math.min(result, subCalc(a, c, b).length());
		result = Math.min(result, subCalc(b, a, c).length());
		result = Math.min(result, subCalc(b, c, a).length());
		result = Math.min(result, subCalc(c, a, b).length());
		result = Math.min(result, subCalc(c, b, a).length());
	}

	String subCalc(String latter, String middle, String later) {
		String str = merge(latter, middle);
		String result = merge(str, later);
		// System.out.println(result + ": " + latter + ", " + middle + ", " + later + ": " + str);
		return result;
	}

	void showResult() {
		System.out.println(result);
	}
}