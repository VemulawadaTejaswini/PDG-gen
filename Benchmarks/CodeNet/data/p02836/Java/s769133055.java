// preparation for N log^2 N

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int s = 0, t = cs.length - 1;
		int ans = 0;
		while (s < t) {
			if (cs[s] != cs[t])
				++ans;
			++s;
			--t;
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
