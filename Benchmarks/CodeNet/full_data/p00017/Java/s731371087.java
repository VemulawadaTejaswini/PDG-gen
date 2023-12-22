import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// he, his, hat は全て't'より若い文字コードを持つ
	private static final int[] PATTEN_THE_ = { 0, -12, -15 };
	private static final int[] PATTEN_THIS = { 0, -12, -11, -1 };
	private static final int[] PATTEN_THAT = { 0, -12, -19, 0 };

	private static enum WORD {
		THE_, THIS, THAT, OTHER
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		Scanner sc;
		ArrayList<String> words;

		while ((line = br.readLine()) != null) {
			sc = new Scanner(line);
			words = new ArrayList<String>();
			while (sc.hasNext()) {
				words.add(sc.next());
			}
			for (String word : words) {
				String check = word.replace(".", "");
				WORD pattern = WORD.OTHER;
				int shift;
				if (check.length() == 3) {
					pattern = checkPattern(check, PATTEN_THE_);
				} else if (check.length() == 4) {
					pattern = checkPattern(check, PATTEN_THIS);
					if (pattern != WORD.THIS)
						pattern = checkPattern(check, PATTEN_THAT);
				}
				if (pattern == WORD.THE_ || pattern == WORD.THIS
						|| pattern == WORD.THAT) {
					shift = getNumberOfShift(word.charAt(0));
					System.out.println(decode(line, shift));
					break;
				}
			}
		}
	}

	public static WORD checkPattern(String word, int[] pattern) {

		WORD result = WORD.OTHER;

		boolean isMatch = false;

		int first = word.charAt(0);
		for (int i = 1; i < word.length(); i++) {
			int target = (int) word.charAt(i);
			if (target > first)
				target -= 26;
			if (target - first == pattern[i]) {
				isMatch = true;
			} else {
				isMatch = false;
				break;
			}
		}
		if (isMatch) {
			if (pattern == PATTEN_THE_)
				result = WORD.THE_;
			if (pattern == PATTEN_THIS)
				result = WORD.THIS;
			if (pattern == PATTEN_THAT)
				result = WORD.THAT;
		}
		return result;
	}

	public static int getNumberOfShift(char charOft) {
		int result;
		result = (int) charOft - (int) 't';
		return result;
	}

	public static String decode(String line, int shift) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) ((int) ch - shift);
				if (ch < 'a')
					ch = (char) ((int) ch + 26);
				if (ch > 'z')
					ch = (char) ((int) ch - 26);
			}
			sb.append(ch);
		}
		return sb.toString();
	}
}