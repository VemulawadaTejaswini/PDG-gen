import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chars = new int[26];
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				char ch = Character.toLowerCase(line.charAt(i));
				if ('a' <= ch || ch <= 'z')
					chars[ch - 'a']++;
			}
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " : " + chars[ch - 'a']);
		}
	}
}