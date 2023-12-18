import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int start = -1;
		for (int i = 0; i <= s.length - t.length; i++) {
			boolean flag = true;
			for (int j = 0; j < t.length; j++) {
				if (t[j] != s[i + j] && s[i + j] != '?') {
					flag = false;
					break;
				}
			}
			if (flag) {
				start = i;
			}
		}
		if (start == -1) {
			System.out.println("UNRESTORABLE");
			return;
		}
		System.arraycopy(t, 0, s, start, t.length);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '?') {
				s[i] = 'a';
			}
		}
		System.out.println(s);
	}
}
