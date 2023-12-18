import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String N = sc.next();
		int M = sc.nextInt();
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> g = new ArrayList<String>();
		String ans = "IMPOSSIBLE";

		for (int i = 0; i < M; i++) {
			String a = sc.next();
			String b = sc.next();
			if (a.equals("1")) {
				s.add(b);
			} else if (a.equals(N)) {
				g.add(b);
			}
			if (b.equals("1")) {
				s.add(a);
			} else if (b.equals(N)) {
				g.add(a);
			}
		}

		for (String i : s) {
			if (g.contains(i)) {
				ans = "POSSIBLE";
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}