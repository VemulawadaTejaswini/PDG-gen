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
			int[] countChar = new int[26];
			int[] countPrevFreq = new int[s.length()];

			for (int i = 0; i < s.length(); ++i) {
				++countChar[s.charAt(i) - 'a'];
				countPrevFreq[i] = countChar[s.charAt(i) - 'a'];
			}
			
			boolean isUnbalanced = false;
			for (int i = 0; i < s.length() - 1 && isUnbalanced == false; ++i) {
				for (int j = i + 1; j < s.length(); ++j) {
					int len = j - i + 1;
					int freqDiff = countPrevFreq[j] - countPrevFreq[i] + 1;

					if (freqDiff * 2 > len) {
						System.out.printf("%d %d\n", i + 1, j + 1);
						isUnbalanced = true;
						break;
					}
				}
			}

			if (isUnbalanced == false) {
				System.out.println("-1 -1");
			}

		}
	}
}
