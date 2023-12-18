import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] vis;
	static PriorityQueue<Integer> list;
	static ArrayList<Integer>[] adj;
	static int[] v;

	static void go(int node) {
		vis[node] = true;
		list.add(v[node]);
		for (int x : adj[node]) {
			if (!vis[x])
				go(x);
		}
	}

	public static void main(String[] args) {
		InputReader r = new InputReader(System.in);
		int n = r.nextInt();
		int m = r.nextInt();
		v = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = r.nextInt();
		}
		adj = new ArrayList[n];
		vis = new boolean[n];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int from = r.nextInt();
			int to = r.nextInt();
			adj[from].add(to);
			adj[to].add(from);
		}
		PriorityQueue<Integer> all = new PriorityQueue<Integer>();
		int components = 0;
		long res = 0;
		for (int i = 0; i < adj.length; i++) {
			if (!vis[i]) {
				components++;
				list = new PriorityQueue<Integer>();
				go(i);
				res += list.poll();
				for (int x : list)
					all.add(x);
			}
		}
		if (components == 1) {
			System.out.println(0);
			return;
		}
		if (all.size() < components - 2) {
			System.out.println("Impossible");
			return;
		}
		for (int i = 0; i < components - 2; i++)
			res += (long) all.poll();
		System.out.println(res);
	}

	static class InputReader {
		private BufferedReader reader;
		private StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}

		public InputReader(FileReader stream) {
			reader = new BufferedReader(stream);
			tokenizer = null;
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
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

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
