import java.util.*;

// ARC 93-D
// https://beta.atcoder.jp/contests/arc093/tasks/arc093_b

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next();
		
		if (s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
		} else {
			char[] count = new char[26];
			for (int i = 0; i < s.length(); i++) {
				count[s.charAt(i) - 'a'] += 1;
			}
			
			int index = -1;
			for (int i = 0; i < count.length; i++) {
				if (count[i] == 0) {
					index = i;
					break;
				}
			}
			
			if (index >= 0) {
				System.out.printf("%s%c\n", s, index + 'a');
			} else {
				char lastHeadChar = s.charAt(s.length() - 1);
				boolean answerFound = false;
				for (int i = s.length() - 2; i >= 0 && !answerFound; i--) {
					if (s.charAt(i) < lastHeadChar) {
						answerFound = true;
						index = i;
					}
				}
				
				if (answerFound) {
					for (int i = 0; i < index; i++) {
						System.out.printf("%c", s.charAt(i));
					}
					System.out.printf("%c\n", lastHeadChar);
				} else {
					System.out.printf("%c\n", 1 + s.charAt(0));
				}
			}
		}
	}
}