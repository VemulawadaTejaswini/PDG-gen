import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;

			Set<Integer> set1 = map.get(a);
			if (set1 == null) {
				set1 = new HashSet<>();
				map.put(a, set1);
			}
			set1.add(b);

			Set<Integer> set2 = map.get(b);
			if (set2 == null) {
				set2 = new HashSet<>();
				map.put(b, set2);
			}
			set2.add(a);
		}
		br.close();

		if (m % 2 == 1) {
			System.out.println(-1);
			return;
		}

		int[] dep = new int[n];
		Queue<Integer> que = new ArrayDeque<Integer>();
		que.add(0);
		dep[0] = 1;
		while (!que.isEmpty()) {
			Integer cur = que.poll();
			Set<Integer> set = map.get(cur);
			for (int next : set) {
				if (dep[next] == 0) {
					que.add(next);
					dep[next] = dep[cur] + 1;
				}
			}
		}

		TreeSet<Node> ts = new TreeSet<>();
		for (int i = 0; i < dep.length; i++) {
			ts.add(new Node(i, dep[i]));
		}
		for (Node cur : ts) {
			Set<Integer> set = map.get(cur.idx);
			Integer[] arr = set.toArray(new Integer[0]);
			int size = arr.length;
			int min = Integer.MAX_VALUE;
			int p = -1;
			if (size % 2 == 1) {
				for (int i = 0; i < size; i++) {
					if (min > dep[arr[i]]) {
						min = dep[arr[i]];
						p = i;
					}
				}
			}
			for (int i = 0; i < size; i++) {
				if (i == p) {
					continue;
				}
				System.out.println((cur.idx + 1) + " " + (arr[i] + 1));
				map.get(arr[i]).remove(cur.idx);
			}
		}
	}

	static class Node implements Comparable<Node> {
		int idx, dep;

		public Node (int idx, int dep) {
			this.idx = idx;
			this.dep = dep;
		}

		public int compareTo(Node o) {
			return o.dep - dep;
		}
	}
}
