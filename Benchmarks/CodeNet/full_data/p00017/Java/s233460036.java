import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextLine()) {
				char[] originalCharactors = sc.nextLine().toCharArray();

				// ずらした文字数を調べる
				int restrationCode = -1;
				for (int i = 0; i < originalCharactors.length - 1; i++) {
					int code = originalCharactors[0] - 't';
					if (isRestrationCode(code, originalCharactors, i)) {
						restrationCode = code;
						break;
					}
				}
				// 復元する
				char[] tartgetCharactors = displace(restrationCode,
						originalCharactors);

				// 出力する
				print(tartgetCharactors);
			}
		} finally {
			sc.close();
		}
	}

	private static boolean isRestrationCode(int code, char[] cArrays, int start) {

		if ((cArrays[start + 1] - code) == 'h') {
			if ((cArrays[start + 2] - code) == 'e') {
				return true;
			} else if ((cArrays[start + 2] - code) == 'i') {
				if ((cArrays[start + 3] - code) == 's') {
					return true;
				}
			} else if ((cArrays[start + 2] - code) == 'a') {
				if ((cArrays[start + 3] - code) == 't') {
					return true;
				}
			}
		}

		return false;
	}

	private static char[] displace(int code, char[] originalCharactors) {

		char[] targetCharactors = new char[originalCharactors.length];

		int i = 0;
		char piriod = '.';
		for (char c : originalCharactors) {
			if (piriod != c) {
				c -= code;
			}
			targetCharactors[i] = (char) c;
			i++;
		}
		return targetCharactors;
	}

	private static void print(char[] cArrays) {

		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (char c : cArrays) {
			if (c == 28 || c == 33) {
				sb.append(" ");
			} else {
				sb.append(c);
			}
			i++;
		}
		System.out.println(sb.toString());
	}
}