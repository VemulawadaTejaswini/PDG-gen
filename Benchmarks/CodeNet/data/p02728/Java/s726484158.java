import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] edges = new int[n - 1][2];
		for (int i = 0; i < n - 1; i++) {
			String[] sa = br.readLine().split(" ");
			edges[i][0] = Integer.parseInt(sa[0]) - 1;
			edges[i][1] = Integer.parseInt(sa[1]) - 1;
		}
		br.close();

		int mod = 1000000007;
		Kaijou kai = new Kaijou(200000, mod);

		Rerooting<Node> r = new Rerooting<>(n, edges, new Node(),
				(o1, o2) -> {
					Node ret = new Node();
					ret.size = o1.size + o2.size;
					long val1 = o1.val * kai.pi[o1.size] % mod;
					long val2 = o2.val * kai.pi[o2.size] % mod;
					ret.val = kai.p[ret.size] * val1 % mod * val2 % mod;
					return ret;
				},
				(o, node) -> {
					Node ret = new Node();
					ret.size = o.size + 1;
					ret.val = o.val;
					return ret;
				});

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(r.query(i).val);
		}
		pw.flush();
	}

	static class Node {
		int size = 0;
		long val = 1;
	}

	static class Kaijou {
		long[] p, pi;
		int m;

		public Kaijou(int n, int mod) {
			n++;
			m = mod;
			p = new long[n];
			pi = new long[n];
			p[0] = 1;
			pi[0] = 1;
			for (int i = 1; i < n; i++) {
				p[i] = p[i - 1] * i % m;
			}
			pi[n - 1] = BigInteger.valueOf(p[n - 1])
					.modInverse(BigInteger.valueOf(m)).longValue();
			for (int i = n - 1; i > 1; i--) {
				pi[i - 1] = pi[i] * i % m;
			}
		}
	}

	/**
	 * 全方位木DP
	 */
	static class Rerooting<T> {
		public int nodeCnt;
		private T identity;
		private BiFunction<T, T, T> merge;
		private BiFunction<T, Integer, T> addNode;
		private List<List<Integer>> adjacents;
		private List<List<Integer>> indexForAdjacent;
		private Object[][] dp;
		private Object[] res;

		/**
		 * 初期化
		 * @param nodeCnt 頂点数（≧1）
		 * @param edges 木構造の辺の配列  例：{{0,1},{0,2},{1,3}}
		 * @param identity 単位元
		 * @param merge 部分木のマージ関数（戻り値は新規オブジェクト）
		 * @param addNode 指定頂点（部分木の根）の分を加算する関数（戻り値は新規オブジェクト）
		 */
		public Rerooting(int nodeCnt, int[][] edges, T identity,
				BiFunction<T, T, T> merge, BiFunction<T, Integer, T> addNode) {
			this.nodeCnt = nodeCnt;
			this.identity = identity;
			this.merge = merge;
			this.addNode = addNode;

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
				res[0] = addNode.apply(identity, 0);
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
					accum = merge.apply(accum, (T) dp[node][j]);
				}
				dp[parent][indexForAdjacent.get(node).get(parentIndex)] = addNode.apply(accum, node);
			}

			// ToLeaf
			for (int node : order) {
				T accum = identity;
				Object[] accumsFromTail = new Object[adjacents.get(node).size()];
				accumsFromTail[accumsFromTail.length - 1] = identity;
				for (int j = accumsFromTail.length - 1; j >= 1; j--) {
					accumsFromTail[j - 1] = merge.apply((T) dp[node][j], (T) accumsFromTail[j]);
				}
				for (int j = 0; j < accumsFromTail.length; j++) {
					dp[adjacents.get(node).get(j)][indexForAdjacent.get(node).get(j)] =
							addNode.apply(merge.apply(accum, (T) accumsFromTail[j]), node);
					accum = merge.apply(accum, (T) dp[node][j]);
				}
				res[node] = addNode.apply(accum, node);
			}
		}
	}
}
