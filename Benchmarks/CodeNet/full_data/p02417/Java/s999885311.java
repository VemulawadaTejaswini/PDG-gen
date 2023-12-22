import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		int[] count = new int[26];
		for (int i = 0; i < 26; i++) {
			count[i] = 0;
		}
		while (sc.hasNext()) {
			line = sc.next().toLowerCase();
			for (int i = 0; i < line.length(); i++) {
				int ch = line.charAt(i) - 'a';
				if (ch >= 0 && ch < 26) {
					count[ch]++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			char alp = (char) ('a' + i);
			System.out.println(alp + " : " + count[i]);
		}
		sc.close();
	}
}
