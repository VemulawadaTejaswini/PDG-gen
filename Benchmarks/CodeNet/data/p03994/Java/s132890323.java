import java.util.Scanner;

/**
 * Created by LCW on 2016-9-19.
 */

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = in.nextInt();

		char[] cs = s.toCharArray();
		int[] moved = new int[cs.length];

		for (int i = 0; i < cs.length; i++) {
			int cp = Character.codePointAt(cs, i);
			if (cs[i] != 'a' && cp + n > 122) {// codePointAt 'z'
				int used = 123 - cp;
				n = n - used;
				cs[i] = 'a';
				moved[i] = 1;
			}
		}

		if (n > 0) {
			for (int i = cs.length - 1; i >= 0 && n > 0; i--) {
				int cp = Character.codePointAt(cs, i);
				char newChar = Character.toChars(97 + (cp + n - 97) % 26)[0];
				cs[i] = newChar;
				n = 0;
			}
		}

		System.out.println(String.valueOf(cs));
	}

	/*public static void main(String[] args) {
		String s = "z";
		char[] cs = s.toCharArray();
		System.out.println(Character.toChars(97 + (123 - 97) % 26)[0]);
	}*/
}
