import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int h = sc.nextInt();
		int[][] c = new int[n][2];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			c[i][0] = sc.nextInt();
			c[i][1] = sc.nextInt();
		}

		// Sort c by b
		Comp comp = new Comp();
		comp.setIndex(1);
		Arrays.sort(c, comp);

		int maxA = 0;
		int maxAindex = 0;
		for (int i = 0; i < n; i++) {
			if (c[i][0] > maxA) {
				maxA = c[i][0];
				maxAindex = i;
			}
		}

		// Throw session
		for (int i = n - 1; i >= 0; i--) {
			if (h <= c[maxAindex][1]) {
				h -= c[maxAindex][1];
				cnt++;
			} else if (c[i][1] > maxA && i != maxAindex) {
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

	static class Comp implements Comparator {
		int index = 0;

		public void setIndex(int i) {
			index = i;
		}

		public int compare(Object a, Object b) {
			int[] intA = (int[]) a;
			int[] intB = (int[]) b;
			return (intA[index] - intB[index]);
		}
	}
}
