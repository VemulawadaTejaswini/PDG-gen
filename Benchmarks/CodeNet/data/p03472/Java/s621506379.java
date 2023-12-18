import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int h = sc.nextInt();
		int[][] c = new int[n][2];
		int cnt = 0;

		int maxA = 0;
		int maxAindex = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a > maxA) {
				maxA = a;
				maxAindex = i;
			}
			c[i][0] = a;
			c[i][1] = b;
		}

		// Throw session
		for (int i = 0; i < n; i++) {
			// Special case: One wield and done
			if (h <= c[maxAindex][1]) {
				System.out.println(cnt + 1);
				return;
			}

			if (c[i][1] > maxA && i != maxAindex) {
				h -= c[i][1];
				cnt++;
			}
			if (h <= 0) {
				System.out.println(cnt);
				return;
			}
		}

		// Wield and throw session
		while (true) {
			if (h <= c[maxAindex][1]) {
				h -= c[maxAindex][1];
			} else {
				h -= c[maxAindex][0];
			}
			cnt++;
			if (h <= 0) {
				System.out.println(cnt);
				return;
			}
		}
  }
}
