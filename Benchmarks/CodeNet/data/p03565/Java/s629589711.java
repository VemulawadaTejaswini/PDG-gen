import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int index = -1;
		for (int i = s.length - t.length; i >= 0; i--) {
			boolean find = true;
			for (int j = 0; j < t.length; j++) {
				if (s[i + j] == '?') continue;
				if (t[j] != s[i + j]) {
					find = false;
					break;
				}
			}
			if (find) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("UNRESTORABLE");
			return;
		}
		for (int i = 0; i < s.length; i++) {
			if (i < index) {
				if (s[i] == '?') s[i] = 'a';
			} else if (i < index + t.length) {
				s[i] = t[i - index];
			} else {
				if (s[i] == '?') s[i] = 'a';
			}
		}

		System.out.println(s);
	}
}
