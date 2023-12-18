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
			String ss = s.substring(a, b);
			String tt = t.substring(c, d);
			while (true) {
				String sss = ss.replaceAll("AB", "").replaceAll("BA", "").replaceAll("AAA", "").replaceAll("BBB", "");
				sss = sss.replaceAll("BB", "A").replaceAll("AA", "B");
				if (sss.length() == ss.length()) break;
				ss = sss;
			}
			while (true) {
				String ttt = tt.replaceAll("AB", "").replaceAll("BA", "").replaceAll("AAA", "").replaceAll("BBB", "");
				ttt = ttt.replaceAll("BB", "A").replaceAll("AA", "B");
				if (ttt.length() == tt.length()) break;
				tt = ttt;
			}
			if (ss.equals(tt)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
