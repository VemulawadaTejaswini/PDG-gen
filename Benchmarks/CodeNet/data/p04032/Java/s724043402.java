/* Filename: ABC043D.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String s = input.next();

			boolean containUnbalance = false;
			for (int i = 0; i < s.length() - 1 && containUnbalance == false; ++i) {
				for (int j = i + 1; j < s.length(); ++j) {
					if (isUnbalanced(s.substring(i, j + 1))) {
						System.out.printf("%d %d\n", i, j);
						containUnbalance = true;
						break;
					}
				}
			}

			if (containUnbalance == false) {
				System.out.println("-1 -1");
			}

		}
	}

	private static boolean isUnbalanced(String s) {
		int[] countChar = new int[26];
		for (int i = 0; i < s.length(); ++i) {
			++countChar[s.charAt(i) - 'a'];
		}

		for (int i = 0; i < countChar.length; ++i) {
			if (countChar[i] * 2 > s.length()) {
				return true;
			}
		}

		return false;
	}
}
