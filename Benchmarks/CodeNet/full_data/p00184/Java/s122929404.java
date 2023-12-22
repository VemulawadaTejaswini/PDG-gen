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
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			int[] count = new int[7];
			while (n-->0) {
				int x = sc.nextInt();
				if (x >= 60) x = 60;
				count[x/10]++;
			}
			for (int x : count) System.out.println(x);
		}
	}
}