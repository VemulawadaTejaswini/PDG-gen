package progA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] chars = new int[26];
		chars[0] = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				char ch = Character.toLowerCase(line.charAt(i));
				byte a = (byte) (ch);
				if (a >= 97 && a <= 122) {
					chars[a - 97]++;

				}
			}

		}
		int i = 0;
		for (char x = 'a'; x <= 'z'; x++) {
			System.out.printf("%c : %d\n", x, chars[i]);
			i++;
		}
	}

}