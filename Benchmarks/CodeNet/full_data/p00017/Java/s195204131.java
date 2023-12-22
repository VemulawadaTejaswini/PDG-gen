import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String line = sc.nextLine();
				int offset = calculateIndex(line);
				System.out.println(encryptString(line, offset));
			}
		}
	}

	public static int calculateIndex(String str) {
		String[] ss = str.split(" ");
		for (String s : ss) {
			if (s.length() == 4) { // this, that
				if ((s.charAt(0) + 26 - 't') % 26 == (s.charAt(1) + 26 - 'h') % 26
						&& (s.charAt(0) + 26 - 't') % 26 == (s.charAt(2) + 26 - 'i') % 26
						&& (s.charAt(0) + 26 - 't') % 26 == (s.charAt(3) + 26 - 's') % 26) {
					return s.charAt(0) - 't';
				} else if ((s.charAt(0) + 26 - 't') % 26 == (s.charAt(1) + 26 - 'h') % 26
						&& (s.charAt(0) + 26 - 't') % 26 == (s.charAt(2) + 26 - 'a') % 26
						&& (s.charAt(0) + 26 - 't') % 26 == (s.charAt(3) + 26 - 't') % 26) {
					return s.charAt(0) - 't';
				}
			} else if (s.length() == 3) { // the
				if ((s.charAt(0) + 26 - 't') % 26 == (s.charAt(1) + 26 - 'h') % 26
						&& (s.charAt(0) + 26 - 't') % 26 == (s.charAt(2) + 26 - 'e') % 26) {
					return s.charAt(0) - 't';
				}
			}
		}
		return 0;
	}

	public static String encryptString(String str, int offset) {
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			result[i] = cc;
			if (cc == ' ' || cc == '.') {
				continue;
			}
			result[i] = (char)((((result[i]) % 'a') + 26 - offset) % 26 + 'a');
		}
		return new String(result);
	}
}