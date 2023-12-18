import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String key = scanner.nextLine();
		char[] keyChars = key.toCharArray();
		String part = scanner.nextLine();
		char[] partChars = part.toCharArray();

		int pLength = partChars.length;
		if (key.contains(part)) {
			System.out.println(key.replaceAll("\\?", "a"));
			return;
		}

		int kIndex = keyChars.length - 1;
		int pIndex = pLength - 1;
		boolean restorable = false;

		while (kIndex >= 0) {
			if (keyChars[kIndex--] != partChars[pIndex--] && keyChars[kIndex + 1] != '?') pIndex = pLength - 1;
			if (pIndex == -1) {
				for (pIndex = 0; pIndex < pLength; pIndex++) keyChars[kIndex + pIndex + 1] = partChars[pIndex];
				restorable = true;
				break;
			}
		}

		if (restorable) {
			System.out.println(String.valueOf(keyChars).replaceAll("\\?", "a"));
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}
