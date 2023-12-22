import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] tgts = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
				'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String str = " ";

		for(int i = 0; i < 10; i++) {
			str += sc.nextLine();
		}

		char[] chars = str.toCharArray();

		chars = switch_l(chars);

		for (int i = 0; i < tgts.length; i++) {
			System.out.println( tgts[i] + " : " + cnt_char(chars, tgts[i]) );
		}

		sc.close();

	}

	private static int cnt_char(char[] chars, char c) {
		int cnt = 0;

		for (int i = 0; i < chars.length; i++) {
			if ( chars[i] == c ){
				cnt++;
			}
		}

		return cnt;
	}

	private static char[] switch_l(char[] chars) {

		char[] chars_switch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
				chars_switch[i] = Character.toLowerCase(chars[i]);
		}
		return chars_switch;
	}

}
