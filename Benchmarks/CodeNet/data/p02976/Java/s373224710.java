import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer>[] edges = new Set[N];
		for (int i = 0; i < N; i++) {
			edges[i] = new HashSet<>();
		}
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edges[a].add(b);
			edges[b].add(a);
		}
		TreeSet<Node> nodes = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			nodes.add(new Node(edges[i].size(), i));
		}
		int ans = -1;
		if (M % 2 == 0) {
			boolean[] need = new boolean[N];
			while (!nodes.isEmpty()) {
				Node cur = nodes.first();
				int me = cur.index;
				int from = me, to = edges[me].iterator().next();
				if (cur.degre == 1) {
					if (!need[me]) {
						int tmp = from;
						from = to;
						to = tmp;
					}
				}
				need[from] = !need[from];
				out.println((from + 1) + " " + (to + 1));
				edges[from].remove(to);
				edges[to].remove(from);
				nodes.remove(new Node(edges[from].size() + 1, from));
				nodes.remove(new Node(edges[to].size() + 1, to));
				if (!edges[from].isEmpty()) {
					nodes.add(new Node(edges[from].size(), from));
				}
				if (!edges[to].isEmpty()) {
					nodes.add(new Node(edges[to].size(), to));
				}
			}
		} else {
			out.println(ans);
		}
		
		out.flush();
	}
	
	static class Node implements Comparable<Node> {
		int degre, index;
		
		public Node(int degre, int index) {
			this.degre = degre;
			this.index = index;
		}
		
		@Override
		public int compareTo(Node o) {
			int cmp = Integer.compare(degre, o.degre);
			if (cmp != 0) return cmp;
			return Integer.compare(index, o.index);
		}
	}
	
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
