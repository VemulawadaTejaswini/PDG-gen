import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int alphabet[] = new int[26];
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c == ' ')
				continue;
			else if (c == '.')
				break;
			else if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}

			alphabet[(int) (c) - (int) 'a']++;

		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println((char) ('a' + i) + " : " + alphabet[i]);
		}
	}
}