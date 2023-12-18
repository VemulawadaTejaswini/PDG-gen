import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
			return;
		}

		if (s.length() == 26) {
			TreeSet<Character> set = new TreeSet<Character>();
			for (int i = 24; i >= 0; i--) {
				set.add(s.charAt(i + 1));
				if (s.charAt(i) - s.charAt(i + 1) < 0) {
					break;
				}
			}
			char l = s.charAt(25 - set.size());
			String str = s.substring(0, 25 - set.size());
			while (!set.isEmpty()) {
				char f = set.pollFirst();
				if (f > l) {
					System.out.println(str + f);
					return;
				}
			}
		} else {
			TreeSet<Character> set = new TreeSet<Character>();
			for (int i = 0; i < 26; i++) {
				set.add((char) ('a' + i));
			}
			for (int i = 0; i < s.length(); i++) {
				set.remove(s.charAt(i));
			}
			System.out.println(s + set.first());
		}
	}
}
