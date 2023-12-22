import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int max = 0;

		for (int i = 0; i <= s.length() - t.length(); i++) {
			int match = 0;
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) == s.charAt(i + j)) {
					match++;
				}
			}
			if (max < match) {
				max = match;
			}
		}
		System.out.println(t.length() - max);
	}
}