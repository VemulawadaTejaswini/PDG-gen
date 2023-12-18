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

		loop1:
		for (int i = 0; i < M; i++) {
			String a = sc.next();
			String b = sc.next();
			if (a.equals("1")) {
				s.add(b);
				if (g.contains(b)) {
					ans = "POSSIBLE";
					break loop1;
				}
			} else if (a.equals(N)) {
				g.add(b);
				if (s.contains(b)) {
					ans = "POSSIBLE";
					break loop1;
				}
			}
			if (b.equals("1")) {
				s.add(a);
				if (g.contains(a)) {
					ans = "POSSIBLE";
					break loop1;
				}
			} else if (b.equals(N)) {
				g.add(a);
				if (s.contains(a)) {
					ans = "POSSIBLE";
					break loop1;
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}