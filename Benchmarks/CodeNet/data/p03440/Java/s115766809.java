
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int uf[] = new int[n];
		for (int i = 0; i < n; i++) {
			uf[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			uf[uf[x]] = uf[y];
		}
		// System.err.println(Arrays.toString(uf));
		for (int i = 0; i < n; i++) {
			find(uf, i);
		}
		// System.err.println(Arrays.toString(uf));

		Map<Integer, List<Integer>> costs = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < n; i++) {
			List<Integer> pq;
			if (costs.containsKey(uf[i])) {
				pq = costs.get(uf[i]);
			} else {
				pq = new LinkedList<Integer>();
			}
			pq.add(a[i]);
			costs.put(uf[i], pq);
		}

		PriorityQueue<E> queue = new PriorityQueue<E>();

		for (List<Integer> list : costs.values()) {
			// System.err.println("new E");
			// System.err.println(" "+ list.toString());

			E e = new E();
			e.pq = list.toArray(new Integer[0]);
			Arrays.sort(e.pq);
			e.priority = e.pq[0];
			queue.add(e);

			// System.err.println(Arrays.toString(e.pq));
		}

		int res = 0;
		for (;;) {
			if (queue.size() == 1) {
				System.out.println(res);
				return;
			}

			E first = queue.poll();
			if (first.pq.length == 0) {
				System.out.println("Impossible");
				return;
			}

			E second;
			Set<E> temp = new HashSet<E>();

			if (queue.size() == 2) {
				if (queue.isEmpty()) {
					System.out.println("Impossible");
					return;
				}
				second = queue.poll();
				if (second.pq.length == 0) {
					System.out.println("Impossible");
					return;
				}
			} else {
				for (;;) {
					if (queue.isEmpty()) {
						System.out.println("Impossible");
						return;
					}
					E cand = queue.poll();
					if (first.pq.length + cand.pq.length > 2) {
						second = cand;
						break;
					} else {
						temp.add(cand);
					}
				}
			}
			queue.addAll(temp);

			// System.err.println("merge ");
			// System.err.println(" e1 " + Arrays.toString(first.pq));
			// System.err.println(" e2 " + Arrays.toString(second.pq));

			res += first.pq[0];
			res += second.pq[0];

			E e = new E();

			Integer[] pq = new Integer[first.pq.length + second.pq.length - 2];
			// System.err.println(pq.length);
			int firstInd = 1;
			int secondInd = 1;
			for (int pqInd = 0; pqInd < pq.length; pqInd++) {
				if (firstInd >= first.pq.length) {
					pq[pqInd] = second.pq[secondInd];
					secondInd++;
				} else if (secondInd >= second.pq.length) {
					pq[pqInd] = first.pq[firstInd];
					firstInd++;
				} else if (first.pq[firstInd] < second.pq[secondInd]) {
					pq[pqInd] = first.pq[firstInd];
					firstInd++;
				} else {
					pq[pqInd] = second.pq[secondInd];
					secondInd++;
				}
			}
			e.pq = pq;
			e.priority = pq.length > 0 ? pq[0] : 0;

			queue.add(e);
		}

	}

	class E implements Comparable<E> {
		int priority;
		Integer[] pq;

		@Override
		public int compareTo(E o) {
			return this.priority - o.priority;
		}
	}

	int find(int[] uf, int i) {
		if (i != uf[i]) {
			uf[i] = find(uf, uf[i]);
		}
		return uf[i];
	}
}
