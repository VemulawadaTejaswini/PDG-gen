import static java.util.Arrays.deepToString;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			Set<Integer> S = new HashSet<Integer>();
			for (int i = 1; i < n; i++) {
				int x = (i * i) % n;
				S.add(x);
			}
			int H = (n-1)/2;
			Integer[] L = S.toArray(new Integer[0]);
			int[] count = new int[H + 1];
			for (int a : L) {
				for (int b : L) {
					if (a != b) {
						int d = a - b;
						if (d < 0) d += n;
						if (d > H) d = n - d;
						count[d]++;
					}
				}
			}
			for (int i = 1; i <= H; i++) System.out.println(count[i]);
		}
	}
}