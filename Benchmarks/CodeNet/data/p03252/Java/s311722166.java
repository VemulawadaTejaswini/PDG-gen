import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		HashMap<String, String> m = new HashMap<String, String>();

		if (S.equals(T)) {
			System.out.println("Yes");
		}

		for (int i = 0; i < T.length(); i++) {
			String t = T.substring(i, i + 1);
			String s = S.substring(i, i + 1);

			if (m.containsKey(t) && !m.get(t).equals(s)) {
				System.out.println("No");
				return;
			}

			if (t.equals(s) || !S.contains(t)) {
				continue;
			}

			if (!m.containsKey(t)) {
				m.put(t, s);
				continue;
			}

			System.out.println("No");
			return;
		}

		System.out.println("Yes");

		return;
	}
}
