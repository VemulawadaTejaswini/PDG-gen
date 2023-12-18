import java.util.*;

public class Main {

	public static String reverse(String t) {
		StringBuffer str = new StringBuffer(t);
		return str.reverse().toString().substring(0);
	}

	public static String cat(String t, String cat, int flag) {
		StringBuffer str = new StringBuffer();
		if (flag == 1) {
			str.append(cat);
			str.append(t);
		} else {
			str.append(t);
			str.append(cat);
		}
		return str.toString().substring(0);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		for (int i = 0; i < q; ++i) {
			int t = sc.nextInt();
			if (t == 1)
				s = reverse(s);
			else {
				int f = sc.nextInt();
				String c = sc.next();
				s = cat(s, c, f);
			}
		}
		System.out.println(s);
		sc.close();
	}
}
