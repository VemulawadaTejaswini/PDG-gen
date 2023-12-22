
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
			int A = sc.nextInt();
			if (A == 0) break;
			double a = 0;
			
			int remain = 360;
			for (int i = 0; i < A - 1; i++) {
				int x = sc.nextInt();
				a += Math.sin(Math.PI * x / 180);
				remain -= x;
			}
			a += Math.sin(Math.PI * remain / 180);
			
			int B = sc.nextInt();
			remain = 360;
			for (int i = 0; i < B - 1; i++) {
				int x = sc.nextInt();
				a -= Math.sin(Math.PI * x / 180);
				remain -= x;
			}
			a -= Math.sin(Math.PI * remain / 180);

			final double EPS = 1e-10;
			int ans = a > EPS ? 1:
				a < -EPS ? 2 : 0;
			System.out.println(ans);
		}
	}
}