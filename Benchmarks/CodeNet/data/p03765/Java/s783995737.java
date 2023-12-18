import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt();
			int c = sc.nextInt() - 1;
			int d = sc.nextInt();
			char ss = 0;
			char tt = 0;
			for (int j = a; j < b; j++) {
				if (ss != 0) {
					if (ss == s.charAt(j)) {
						ss = op(s.charAt(j));
					} else {
						ss = 0;
					}
				} else {
					ss = s.charAt(j);
				}
			}
			for (int j = c; j < d; j++) {
				if (tt != 0) {
					if (tt == t.charAt(j)) {
						tt = op(t.charAt(j));
					} else {
						tt = 0;
					}
				} else {
					tt = t.charAt(j);
				}
			}
			System.out.println(ss == tt ? "YES" : "NO");
		}
	}
	static char op(char c) {
		return c == 'A' ? 'B' : 'A';
	}
}
