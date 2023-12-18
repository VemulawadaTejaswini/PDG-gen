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
          
          if (!a.equals("1") && !a.equals(N) && !b.equals("1") && !b.equals(N)) {
            continue;
          }
          
			if (a.equals("1")) {
				s.add(b);
				if (g.contains(b)) {
					ans = "POSSIBLE";
					break;
				}
			} else if (a.equals(N)) {
				g.add(b);
				if (s.contains(b)) {
					ans = "POSSIBLE";
					break;
				}
			}
			if (b.equals("1")) {
				s.add(a);
				if (g.contains(a)) {
					ans = "POSSIBLE";
					break;
				}
			} else if (b.equals(N)) {
				g.add(a);
				if (s.contains(a)) {
					ans = "POSSIBLE";
					break;
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
