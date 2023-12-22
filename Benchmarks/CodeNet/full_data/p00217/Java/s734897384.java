import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) break;
			P[] ps = new P[n]; 
			for (int i = 0; i < n; i++) {
				ps[i] = new P();
				ps[i].id = sc.nextInt();
				ps[i].v = sc.nextInt() + sc.nextInt();
			}
			Arrays.sort(ps);
			System.out.println(ps[n-1].id + " " + ps[n-1].v);
		}
	}
	
	class P implements Comparable<P> {
		int v;
		int id;
		@Override
		public int compareTo(P o) {
			return v - o.v;
		}
	}
}