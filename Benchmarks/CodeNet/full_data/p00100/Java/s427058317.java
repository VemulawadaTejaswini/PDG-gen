
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			boolean na = true;
			int[] order = new int[n];
			long[] map = new long[4001];
			boolean[] end = new boolean[4001];
			for (int i = 0; i < n; i++) {
				int b = sc.nextInt();
				int at = sc.nextInt();
				int p = sc.nextInt();
				map[b] += at * p;
				order[i] = b;
			}

			for (int i = 0; i < n; i++) {
				if (order[i] != 0) {
					int e = order[i];
					if (!end[e]) {
						if (map[e] >= 1000000) {
							end[e] = true;
							na = false;
							System.out.println(e);
						}
					}
				}
			}
			if (na)
				System.out.println("NA");
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}