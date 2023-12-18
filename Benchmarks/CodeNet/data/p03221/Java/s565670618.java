import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		PriorityQueue<Long>[] py = new PriorityQueue[n];
		for (int i = 0; i < n; i++) py[i] = new PriorityQueue<>();

		Map<Long, Map<Integer, Integer>> h = new HashMap<>();
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt() - 1;
			long y = sc.nextLong();
			py[p].add(y);
			h.put(y, new HashMap<>());
			h.get(y).put(p, i);
		}

		long[] order = new long[n];
		Arrays.fill(order, 1);

		String[] a = new String[m];
		for (int i = 0; i < py.length; i++) {
			while (!py[i].isEmpty()) {
				long y = py[i].poll();
				a[h.get(y).get(i)] = String.format("%06d%06d", i + 1, order[i]++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]).append("\n");
		}

		System.out.print(sb.toString());
	}
}
