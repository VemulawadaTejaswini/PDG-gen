import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[][] edges = new int[n - 1][2];
		for (int i = 0; i < edges.length; i++) {
			sa = br.readLine().split(" ");
			edges[i][0] = Integer.parseInt(sa[0]) - 1;
			edges[i][1] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		Rerooting3<Long> r = new Rerooting3<Long>(n, edges, 1L, 
				(o, i) -> {
					return o + 1;
				},
				(o1, o2) -> {
					return o1 * o2 % m;
				},
				(o, i) -> {
					return o;
				});
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(r.query(i));
		}
		pw.flush();
	}

	static class Rerooting3<T> {
		public int nodeCnt;
		private T identity;
		private BiFunction<T, Integer, T> beforeMerge;
		private BiFunction<T, T, T> merge;
		private BiFunction<T, Integer, T> afterMerge;
		private List<List<Integer>> adjacents;
		private List<List<Integer>> indexForAdjacent;
		private Object[][] dp;
		private Object[] res;

		public Rerooting3(int nodeCnt, int[][] edges, T identity, BiFunction<T, Integer, T> beforeMerge,
				BiFunction<T, T, T> merge, BiFunction<T, Integer, T> afterMerge) {
			this.nodeCnt = nodeCnt;
			this.identity = identity;
			this.beforeMerge = beforeMerge;
			this.merge = merge;
			this.afterMerge = afterMerge;

			adjacents = new ArrayList<>(nodeCnt);
			indexForAdjacent = new ArrayList<>(nodeCnt);
			for (int i = 0; i < nodeCnt; i++) {
				adjacents.add(new ArrayList<>());
				indexForAdjacent.add(new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int[] edge = edges[i];
				indexForAdjacent.get(edge[0]).add(adjacents.get(edge[1]).size());
				indexForAdjacent.get(edge[1]).add(adjacents.get(edge[0]).size());
				adjacents.get(edge[0]).add(edge[1]);
				adjacents.get(edge[1]).add(edge[0]);
			}

			dp = new Object[nodeCnt][];
			res = new Object[nodeCnt];
			for (int i = 0; i < nodeCnt; i++) {
				dp[i] = new Object[adjacents.get(i).size()];
			}
			if (nodeCnt == 1) {
				res[0] = afterMerge.apply(identity, 0);
			} else {
				initialize();
			}
		}

		@SuppressWarnings("unchecked")
		public T query(int node) {
			return (T) res[node];
		}

		@SuppressWarnings("unchecked")
		private void initialize() {
			int[] parents = new int[nodeCnt];
			int[] order = new int[nodeCnt];

			// InitOrderedTree
			int index = 0;
			Deque<Integer> stack = new ArrayDeque<>();
			stack.addFirst(0);
			parents[0] = -1;
			while (!stack.isEmpty()) {
				int current = stack.pollFirst();
				order[index++] = current;
				for (int adjacent : adjacents.get(current)) {
					if (adjacent == parents[current]) continue;
					stack.addFirst(adjacent);
					parents[adjacent] = current;
				}
			}

			// FromLeaf
			for (int i = order.length - 1; i >= 1; i--) {
				int node = order[i];
				int parent = parents[node];
				T accum = identity;
				int parentIndex = -1;
				for (int j = 0; j < adjacents.get(node).size(); j++) {
					if (adjacents.get(node).get(j) == parent) {
						parentIndex = j;
						continue;
					}
					accum = merge.apply(accum, beforeMerge.apply((T) dp[node][j], adjacents.get(node).get(j)));
				}
				dp[parent][indexForAdjacent.get(node).get(parentIndex)] = afterMerge.apply(accum, node);
			}

			// ToLeaf
			for (int node : order) {
				T accum = identity;
				Object[] accumsFromTail = new Object[adjacents.get(node).size()];
				accumsFromTail[accumsFromTail.length - 1] = identity;
				for (int j = accumsFromTail.length - 1; j >= 1; j--) {
					accumsFromTail[j - 1] = merge.apply(
							(T) accumsFromTail[j],
							beforeMerge.apply((T) dp[node][j], adjacents.get(node).get(j)));
				}
				for (int j = 0; j < accumsFromTail.length; j++) {
					dp[adjacents.get(node).get(j)][indexForAdjacent.get(node).get(j)] =
							afterMerge.apply(merge.apply(accum, (T) accumsFromTail[j]), node);
					accum = merge.apply(accum, beforeMerge.apply((T) dp[node][j], adjacents.get(node).get(j)));
				}
				res[node] = afterMerge.apply(accum, node);
			}
		}
	}
}
