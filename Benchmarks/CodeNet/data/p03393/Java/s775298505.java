import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String word = scanner.nextLine();

			if (word.length() < 26) {
				for (char c = 'a'; c <= 'z'; c++) {
					if (word.indexOf(c) >= 0) {
						continue;
					}

					System.out.println(word + c);
					return;
				}
			}

			Set<Character> set = new TreeSet<>();
			set.add(word.charAt(word.length() - 1));
			for (int i = word.length() - 2; i >= 0; i--) {
				char check = word.charAt(i);
				for (Character val : set) {
					if (check < val) {
						System.out.println(word.substring(0, i) + val);
						return;
					}
				}
			}

			System.out.println(-1);
		}
	}
}
