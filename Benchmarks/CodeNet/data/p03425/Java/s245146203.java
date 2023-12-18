import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			char[] s = sc.next().toCharArray();

			if (s[0] == 'M' || s[0] == 'A' || s[0] == 'R' || s[0] == 'C' || s[0] == 'H') {
				if (hm.containsKey(s[0])) {
					hm.put(s[0], hm.get(s[0]) + 1);
				} else {
					hm.put(s[0], 1);
				}
			}
		}

		List<Integer> list = new ArrayList<>(hm.values());

//		pr.println(list);
//		pr.flush();

		if (list.size() < 3) {
			pr.println(0);
		} else if (list.size() == 3) {
			long ans = 0;
			ans += (long)list.get(0) * list.get(1) * list.get(2);

			pr.println(ans);
		} else if (list.size() == 4) {
			long ans = 0;
			ans += (long)list.get(0) * list.get(1) * list.get(2);
			ans += (long)list.get(0) * list.get(1) * list.get(3);
			ans += (long)list.get(0) * list.get(2) * list.get(3);
			ans += (long)list.get(1) * list.get(2) * list.get(3);

			pr.println(ans);
		} else {
			long ans = 0;
			ans += (long)list.get(0) * list.get(1) * list.get(2);
			ans += (long)list.get(0) * list.get(1) * list.get(3);
			ans += (long)list.get(0) * list.get(1) * list.get(4);
			ans += (long)list.get(0) * list.get(2) * list.get(3);
			ans += (long)list.get(0) * list.get(2) * list.get(4);
			ans += (long)list.get(0) * list.get(3) * list.get(4);
			ans += (long)list.get(1) * list.get(2) * list.get(3);
			ans += (long)list.get(1) * list.get(2) * list.get(4);
			ans += (long)list.get(1) * list.get(3) * list.get(4);
			ans += (long)list.get(2) * list.get(3) * list.get(4);

			pr.println(ans);

		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
