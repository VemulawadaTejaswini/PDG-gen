import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String str = in.nextLine();
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			int a = in.nextInt();
			int b = in.nextInt();
			if (s.startsWith("print")) {
				print(str, a, b);
			} else if (s.startsWith("reverse")) {
				str = reverse(str, a, b);
			} else if (s.startsWith("replace")) {
				String p = in.next();
				str = replace(str, a, b, p);
			}
		}
	}
	static void print(String str, int a, int b) {
		char[] cs = new char[b-a+1];
		for (int i = a; i <= b; i++) {
			cs[i-a] = str.charAt(i);
		}
		out.println(new String(cs));
	}
	static String reverse(String str, int a, int b) {
		char[] cs = str.toCharArray();
		for (int i = a; i < a + (b - a + 1) / 2; i++) {
			char temp = cs[i];
			cs[i] = cs[b-(i-a)];
			cs[b-(i-a)] = temp;
		}
		return new String(cs);
	}
	static String replace(String str, int a, int b, String p) {
		char[] cs = str.toCharArray();
		char[] pp = p.toCharArray();
		for (int i = a; i <= b; i++) {
			cs[i] = pp[i-a];
		}
		return new String(cs);
	}
}