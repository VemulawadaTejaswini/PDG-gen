
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Count = new int[26];
		for (int i = 0; i < 26; i++) {
			Count[i] = 0;
		}
		for (int j = 0; j < 12; j++) {
			String S = sc.nextline();
			for (int i = 0; i < S.length(); i++) {
				char c = Character.toLowerCase(S.charAt(i));
				if (c - 'a' >= 0 && c - 'a' <= 26) {
					Count[c - 'a']++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char)('a' + i) + " : " + Count[i]);
		}
	}
}

