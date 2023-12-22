

import static java.util.Arrays.deepToString;

import java.util.Arrays;
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
			String[] ss = sc.nextLine().split(" ");
			if (ss.length == 1 && ss[0].equals("0")) break;
			int[] as = new int[ss.length];
			for (int i = 0; i < ss.length; i++) {
				as[i] = Integer.parseInt(ss[i]);
			}
			Arrays.sort(as);
			
			int ans = 0;
			int one = 0;
			for (int x : as) {
				if (x == 1) {
					ans += 1;
					one++;
				}
				else if (x >= 10) {
					ans += 10;
				}
				else {
					ans += x;
				}
			}
			for (int i = 0; i < one; i++) {
				if (ans + 10 <= 21) ans += 10;
			}
			if (ans > 21) ans = 0;
			System.out.println(ans);
		}
	}
}