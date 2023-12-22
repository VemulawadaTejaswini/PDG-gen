import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chars = str.toCharArray();

		chars = switch_ul(chars);

		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}

		System.out.println();
		sc.close();


	}

	private static char[] switch_ul(char[] chars) {
		char[] chars_switch = new char[chars.length];

		for (int i = 0; i < chars.length; i++) {
			if(Character.isUpperCase(chars[i]) ) {
				chars_switch[i] = Character.toLowerCase(chars[i]);
			} else if (Character.isLowerCase(chars[i])) {
				chars_switch[i] = Character.toUpperCase(chars[i]);
			} else {
				chars_switch[i] = chars[i];
			}
		}

		return chars_switch;
	}

}

