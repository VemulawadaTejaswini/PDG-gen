
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if (n == 0 && m == 0)
				break;
			int[][] cost = new int[m][3];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < 3; j++) {
					cost[i][j] = scanner.nextInt();
				}

			}
			int[] p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			Arrays.sort(cost, new Comparator<int[]>() {
				@Override
				public int compare(int[] a, int[] b) {
					return a[2] - b[2];
				}
			});
			int ans = 0;
			for (int i = 0; i < m; i++) {
				int a = cost[i][0];
				int b = cost[i][1];
				a = root(a, p);
				b = root(b, p);
				if (a == b) {
					continue;
				}
				merge(a, b, p);
				ans += cost[i][2];
			}
			System.out.println(ans);

		}
	}

	private static void merge(int a, int b, int[] p) {
		/*a = root(a, p);
		b = root(b, p);*/
		p[a] = b;
	}

	private static int root(int a, int[] p) {
		if (a == p[a]) {
			return a;
		} else {
			return p[a] = root(p[a], p);
		}
	}
}