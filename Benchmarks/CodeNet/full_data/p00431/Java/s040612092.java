import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static int[] dfs(int[][] edge, int root) {
		Map<Integer, ArrayDeque<Integer>> m = new HashMap<Integer, ArrayDeque<Integer>>();
		int max = 0;
		for (int i = 0; i < edge.length; i++) {
			ArrayDeque<Integer> el = m.get(edge[i][0]);
			if (el == null)
				el = new ArrayDeque<Integer>();
			el.addLast(i);
			m.put(edge[i][0], el);
			if (edge[i][0] > max)
				max = edge[i][0];
			if (edge[i][1] > max)
				max = edge[i][1];
		}
		int[] r = new int[max + 1];
		Arrays.fill(r, -1);
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.addLast(root);
		while (!ad.isEmpty()) {
			Integer n = ad.getLast();
			if (r[n] == -1)
				r[n] = ad.size();
			ArrayDeque<Integer> el = m.get(n);
			boolean found = false;
			while (el != null && !el.isEmpty()) {
				int nn = edge[el.pollFirst()][1];
				if (r[nn] == -1) {
					ad.addLast(nn);
					found = true;
					break;
				}
			}
			if (!found)
				ad.pollLast();
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int n = s.nextInt();
			if (n == 0)
				break;
			int[][] p = new int[n * 2][2];
			int max = 0;
			for (int i = 0; i < n; i++) {
				p[i * 2 + 1][1] = p[i * 2][0] = s.nextInt();
				p[i * 2 + 1][0] = p[i * 2][1] = s.nextInt();
				if (p[i * 2][0] > max)
					max = p[i * 2][0];
				if (p[i * 2][1] > max)
					max = p[i * 2][1];
			}
			int d = 0;
			for (int i = 1; i <= max; i++) {
				int[] r = dfs(p, i);
				for (int j = 1; j <= max; j++) {
					if (d < r[j]) {
						d = r[j];
					}
				}
			}
			System.out.println(d);
		}
	}
}