import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = Integer.parseInt(sc.next());
		for (int i = 0; i < q; i++) {
			int t = Integer.parseInt(sc.next());
			if (t == 1) {
				s = new StringBuffer(s).reverse().toString();
			} else {
				int f = Integer.parseInt(sc.next());
				String c = sc.next();
				if (f == 1) {
					s = c + s;
				} else {
					s = s + c;
				}
			}
		}
		System.out.println(s);
	}
}