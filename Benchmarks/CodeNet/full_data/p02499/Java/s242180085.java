import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		line = line.toLowerCase();
		int[] counter = new int[26];
		for (int i = 0; i < line.length(); i++) {
			char s = line.charAt(i);
			int n = Integer.parseInt(""+s);
			counter[n]++;
		}
		char x = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.println((x + i) + " : " + counter[i]);
		}
	}
}