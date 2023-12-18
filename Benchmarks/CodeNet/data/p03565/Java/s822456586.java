import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] key = scanner.nextLine().toCharArray();
		char[] aFilledKey = String.valueOf(key).replaceAll("\\?", "a").toCharArray();
		char[] part = scanner.nextLine().toCharArray();
		List<String> possibleKeys = new ArrayList<>();
		int kLen = key.length;
		int pLen = part.length;

		for (int kIndex = kLen - 1; kIndex >= pLen - 1; kIndex--) {
			char[] keyCopy = Arrays.copyOf(aFilledKey, kLen);
			boolean found = true;
			for (int probe = 0; probe < pLen; probe++) {
				if (key[kIndex - probe] != part[pLen - 1 - probe] && key[kIndex - probe] != '?') {
					found = false;
					break;
				}
			}
			if (found) {
				for (int substIndex = 0; substIndex < pLen; substIndex++) {
					keyCopy[kIndex - pLen + 1 + substIndex] = part[substIndex];
				}
				possibleKeys.add(String.valueOf(keyCopy));
			}
		}

		System.out.println(possibleKeys.parallelStream().sorted().findFirst().orElse("UNRESTORABLE"));
	}
}
