import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int ac = 0;
		int wa = 0;

		TreeMap<Integer, String> ans = new TreeMap<>();

		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if (ans.containsKey(p)) {
				if (ans.get(p).equals("AC")) {
					continue;
				} else {
					ans.put(p, s);
					if (s.equals("AC")) {
						ac++;
					} else {
						wa++;
					}
				}
			} else {
				ans.put(p, s);
				if (s.equals("AC")) {
					ac++;
				} else {
					wa++;
				}
			}
		}

		System.out.println(ac);
		System.out.println(wa);

	}
}
