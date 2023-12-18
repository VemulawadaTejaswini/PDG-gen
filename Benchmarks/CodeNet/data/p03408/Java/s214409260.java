import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int m = 0;
		HashMap<String, Integer> s = new HashMap<String, Integer>();
		int ans = 0;

		for (int i = 0; i < n; i++) {
			String a = sc.next();
			if (s.get(a) != null) {
				s.put(a, s.get(a) + 1);
			} else {
				s.put(a, 1);
			}
		}

		m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			String a = sc.next();
			if (s.get(a) != null) {
				s.put(a, s.get(a) - 1);
			} else {
				s.put(a, -1);
			}
		}

		for (String i : s.keySet()) {
			if (s.get(i) > ans) {
				ans = s.get(i);
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
