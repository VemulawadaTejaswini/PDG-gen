import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
		}

		int[] d1 = new int[n];
		int[] dn = new int[n];

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{0, 1});
		while (!q.isEmpty()) {
			int[] x = q.poll();
			if (d1[x[0]] > 0) continue;
			d1[x[0]] = x[1];
			for (int i = 0; i < g[x[0]].size(); i++) {
				q.offer(new int[]{g[x[0]].get(i), x[1] + 1});
			}
		}

		q.add(new int[]{n - 1, 1});
		while (!q.isEmpty()) {
			int[] x = q.poll();
			if (dn[x[0]] > 0) continue;
			dn[x[0]] = x[1];
			for (int i = 0; i < g[x[0]].size(); i++) {
				q.offer(new int[]{g[x[0]].get(i), x[1] + 1});
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (d1[i] <= dn[i]) count++;
		}

		if (count > n / 2) {
			System.out.println("Fennec");
		} else {
			System.out.println("Snuke");
		}
	}
}
