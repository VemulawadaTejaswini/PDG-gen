
public class Main {
	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine();
		input = input.toLowerCase();
		int[] alphabet = new int[26];
		int check;
		for (int i = 0; i < input.length(); i++) {
			check = Character.getNumericValue(input.charAt(i));
			if (check - 10 >= 0 && check - 10 <= 25) {
				alphabet[check - 10] += 1;
			}
		}
		char[] ch;
		String str;
		for (int i = 0; i < 26; i++) {
			ch = Character.toChars(i + 0x61);
			str = new String(ch);
			System.out.println(str + " : " + alphabet[i]);
		}
	}

}