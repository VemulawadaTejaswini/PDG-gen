import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int q = in.nextInt();
		StringBuffer str = new StringBuffer(s);
		for (int i = 0; i < q; i++) {
			int t = in.nextInt();
			if (t == 1) {
				str.reverse();
			} else {
				int f = in.nextInt();
				String c = in.next();
				if (f == 1) {
					str.insert(0,c);
				} else {
					str.append(c);
				}
			}
		}
		System.out.println(str);
	}
}
