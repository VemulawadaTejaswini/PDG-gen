import java.util.*;

public class Main {

	public static int countAB(String str) {
		int cnt = 0;
		int start = 0;
		while(true) {
			int ix = str.indexOf("AB", start);
			if (ix < 0) {
				return cnt;
			}
			cnt++;
			start = ix + 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int incAB = 0;
		int endA = 0;
		int startB = 0;
		int bothAB = 0;
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			incAB += countAB(s);
			if (s.charAt(0) == 'B') {
				if (s.charAt(s.length() - 1) == 'A') {
					bothAB++;
				} else {
					startB++;
				}
			} else if (s.charAt(s.length() - 1) == 'A') {
				endA++;
			}
		}
		// System.out.println("incAB  = " + incAB);
		// System.out.println("endA   = " + endA);
		// System.out.println("startB = " + startB);
		// System.out.println("bothAB = " + bothAB);


		int ans = incAB;
		if (endA == 0 && startB == 0) {
			if (bothAB > 0) {
				ans += bothAB;
			}
		} else {
			ans += bothAB + Math.min(endA, startB);
		}
		System.out.println(ans);

		// System.out.println(Math.max(x, y));
	}
}
