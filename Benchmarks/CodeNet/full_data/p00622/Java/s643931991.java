import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			String t = sc.next();
			if (t.equals("-")) break;
			String l = sc.next();
			String b = sc.next();
			StringBuilder r = new StringBuilder();
			int pt = 0;
			int pl = 1;
			int pb = 0;
			char cur = l.charAt(0);
			while (pt < t.length() || pl < l.length()) {
				if (pb < b.length() && cur == b.charAt(pb)) {
					cur = t.charAt(pt);
					++pt;
					++pb;
				} else {
					r.append(cur);
					cur = l.charAt(pl);
					++pl;
				}
			}
			r.append(cur);
			System.out.println(r);
		}
	}

}