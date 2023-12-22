import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			char[] chars = s.next().toCharArray();
			for (int i = 0; i < chars.length; ++i) {
				if (Character.isUpperCase(chars[i])) {
					chars[i] = Character.toLowerCase(chars[i]);
				} else {
					chars[i] = Character.toUpperCase(chars[i]);
				}
			}
			System.out.print(String.valueOf(chars));
			if (chars[chars.length - 1] == '.') {
				System.out.println();
				return;
			} else {
				System.out.print(' ');
			}

		}
	}
}