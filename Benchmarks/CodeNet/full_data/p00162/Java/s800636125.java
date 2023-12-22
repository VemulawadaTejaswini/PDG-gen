import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		final int SIZE = 1000000 + 10;
		
		boolean[] is = new boolean[SIZE];
		is[1] = true;
		int[] count = new int[SIZE];
		for (int i = 1; i < SIZE; i++) {
			if (is[i]) {
				if (i * 2 < SIZE) is[i * 2] = true;
				if (i * 3 < SIZE) is[i * 3] = true;
				if (i * 5 < SIZE) is[i * 5] = true;
			}
			count[i] = count[i-1] + (is[i] ? 1 : 0);
		}
		
		for (;sc.hasNext();) {
			int from = sc.nextInt();
			if (from == 0) break;
			int to = sc.nextInt();
			
			int ans = count[to] - count[from-1];
			System.out.println(ans);
			
		}
	}
}