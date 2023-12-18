import java.util.*;

public class Main {
	static class Node {
		public int max;
		public int nodeId;
		public int selectIx;
		public Node child;
		public Node sibling;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static<T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static class Triple implements Comparable<Triple> {
		public int A, B, C;
		Triple(int A, int B, int C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d, %d)", A, B, C);
		}

		@Override
		public int compareTo(Triple o) {
			int a = this.A - o.A;
			if (a != 0) return a;
			int b = this.B - o.B;
			if (b != 0) return b;
			return this.C - o.C;
		}
	}

	static class Tuple {
		int nodeId;
		int parentValue;
		boolean[] used;

		public Tuple(int nodeId, int parentValue, boolean[] used) {
			this.nodeId = nodeId;
			this.parentValue = parentValue;
			this.used = used;
		}

		public int hashCode() {
			return nodeId ^ parentValue ^ used.hashCode();
		}

		public boolean equals(Object obj) {
			if (obj instanceof Tuple) {
				Tuple that = (Tuple)obj;
				if (this.nodeId == that.nodeId && this.parentValue == that.parentValue && Arrays.equals(this.used, that.used));
			}
			return false;
		}
	}

	static HashMap<Tuple, Node> cache = new HashMap<>();

	static Node solve(int nodeId, int parentValue, boolean[] used, ArrayList<Integer>[] edge, int[] C, int[] ord) {
		Tuple key = new Tuple(nodeId, parentValue, used.clone());
		Node cacheNode = cache.get(key);
		if (cacheNode != null) return cacheNode;

		int max = 0;
		int myOrd = ord[nodeId];
		Node maxNode = new Node();
		maxNode.nodeId = nodeId;
		for (int i = 0; i < used.length; i++) {
			if (used[i]) continue;
			used[i] = true;
			int val = C[i];
			int sum = Math.min(parentValue, val);

			Node child = null;
			for (int next : edge[nodeId]) {
				if (ord[next] < myOrd) continue;
				Node node = solve(next, val, used, edge, C, ord);
				node.sibling = child;
				child = node;
				sum += node.max;
			}
			if (sum > max) {
				max = sum;
				maxNode.child = child;
				maxNode.max = sum;
				maxNode.selectIx = i;
			}
			while (child != null) {
				used[child.selectIx] = false;
				child = child.sibling;
			}
			used[i] = false;
		}
		used[maxNode.selectIx] = true;
		cache.put(key, maxNode);
		return maxNode;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 10000
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] edge = new ArrayList[N];
		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if (edge[a] == null) {
				edge[a] = new ArrayList<>();
			}
			if (edge[b] == null) {
				edge[b] = new ArrayList<>();
			}
			edge[a].add(b);
			edge[b].add(a);
		}
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			int c = sc.nextInt();
			C[i] = c;
		}
		int[] ord = new int[N];
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.push(0);
		int depth = 1;
		while (q.size() > 0) {
			int v = q.poll();
			ord[v] = depth++;
			for (int n : edge[v]) {
				if (ord[n] == 0) {
					q.push(n);
				}
			}
		}
		Node node = solve(0, 0, new boolean[N], edge, C, ord);
		System.out.println(node.max);
		int[] ans = new int[N];
		fill(ans, node, C);
		for (int i = 0; i < ans.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(ans[i]);
		}
		System.out.println();
	}

	static void fill(int[] ans, Node node, int[] C) {
		while (node != null) {
			// ans[node.nodeId] = node.selectIx;
			ans[node.nodeId] = C[node.selectIx];
			fill(ans, node.child, C);
			node = node.sibling;
		}
	}
}
