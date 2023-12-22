import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		if (n == 0 && m == 0) return;

		V[] vs = new V[n];
		for (int i = 0; i < n; i++) {
			V v = new V();
			v.id = i+1;
			vs[i] = v;
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			int c = sc.nextInt();
			vs[a].add(vs[b], c);
			vs[b].add(vs[a], c);
		}

		PriorityQueue<State> pq = new PriorityQueue<State>();
		State start = new State();
		start.to = vs[0];
		start.w = 0;
		start.fc = 0;
		start.to.memo[0] = 0;
		pq.add(start);
		int ans = -1;
		while (!pq.isEmpty()) {
			State cur = pq.poll();
//			tr(cur.to.id, cur.w, cur.w);
			if (cur.to == vs[n-1] && (cur.fc == 0 || cur.fc == 2)) {
				ans = cur.w;
				break;
			}
			for (E e : cur.to.es) {
				if (cur.fc == 0) {
					{
						State s = new State();
						s.to = e.to;
						s.fc = cur.fc;
						s.w = cur.w + e.w;
						if (s.to.memo[s.fc] > s.w) {
							s.to.memo[s.fc] = s.w;
							pq.add(s);
						}
					}
					{
						State s = new State();
						s.to = e.to;
						s.fc = cur.fc + 1;
						s.w = cur.w;
						if (s.to.memo[s.fc] > s.w) {
							s.to.memo[s.fc] = s.w;
							pq.add(s);
						}
					}
				}
				if (cur.fc == 1) {
					State s = new State();
					s.to = e.to;
					s.fc = cur.fc + 1;
					s.w = cur.w;
					if (s.to.memo[s.fc] > s.w) {
						s.to.memo[s.fc] = s.w;
						pq.add(s);
					}
				}
				if (cur.fc == 2) {
					State s = new State();
					s.to = e.to;
					s.fc = cur.fc;
					s.w = cur.w + e.w;
					if (s.to.memo[s.fc] > s.w) {
						s.to.memo[s.fc] = s.w;
						pq.add(s);
					}
				}
			}

		}
		System.out.println(ans);
	}

	class State implements Comparable<State>{
		V to;
		int fc;
		int w;
		@Override
		public int compareTo(State o) {
			return w - o.w;
		}
	}

	static final int INF = 1001001001;
	class V {
		ArrayList<E> es = new ArrayList<E>();
		int id;
		int[] memo = {INF, INF, INF};
		void add(V to, int w) {
			this.es.add(new E(to, w));
		}
	}
	class E {
		V to;
		int w;
		E(V to, int w) {
			this.to = to;
			this.w = w;
		}
	}


	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}