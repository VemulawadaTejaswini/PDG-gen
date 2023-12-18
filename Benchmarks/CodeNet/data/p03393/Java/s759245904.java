import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length() == 26) {
			boolean[] arr = new boolean[26];
			for (int i = s.length() - 1; i >= 0; i--) {
				if (i != s.length() - 1) {
					if (s.charAt(i) < s.charAt(i + 1)) {
						char c = '\0';
						for (int j = 0; j < arr.length; j++) {
							if (arr[j]) {
								c = (char)('a' + j);
								System.out.println(s.substring(0, i) + c);
								return;
							}
						}
					}
				}
				arr[s.charAt(i) - 'a'] = true;
			}
			System.out.println(-1);
		} else {
			boolean[] arr = new boolean[26];
			for (int i = 0; i < s.length(); i++) {
				arr[s.charAt(i) - 'a'] = true;
			}
			for (int i = 0; i < arr.length; i++) {
				if (!arr[i]) {
					System.out.println(s + (char)('a' + i));
					return;
				}
			}
		}
	}
}
