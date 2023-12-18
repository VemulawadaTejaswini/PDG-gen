import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] key = scanner.nextLine().toCharArray();
		char[] part = scanner.nextLine().toCharArray();
		int kLen = key.length;
		int pLen = part.length;
		int minNumQ = Integer.MAX_VALUE;
		int substStartIndex = Integer.MAX_VALUE;

		for (int kIndex = kLen - 1; kIndex >= pLen - 1; kIndex--) {
			int numQ = 0;
			boolean found = true;
			for (int probe = 0; probe < pLen; probe++) {
				if (key[kIndex - probe] != part[pLen - 1 - probe] && key[kIndex - probe] != '?') {
					found = false;
					break;
				}
				if (key[kIndex - probe] == '?') {
					numQ++;
				}
			}
			if (found && numQ < minNumQ) {
				minNumQ = numQ;
				substStartIndex = kIndex - pLen + 1;
				if (minNumQ == 0) {
					break;
				}
			}
		}

		if (substStartIndex < Integer.MAX_VALUE) {
			for (int pIndex = 0; pIndex < pLen; pIndex++) {
				key[substStartIndex + pIndex] = part[pIndex];
			}
			System.out.println(String.valueOf(key).replaceAll("\\?", "a"));
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}
