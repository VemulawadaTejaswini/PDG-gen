import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<List<Integer>> edges = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			edges.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edges.get(a).add(b);
			edges.get(b).add(a);
		}

		int ret = Integer.MAX_VALUE;
		Set<Integer> v = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int root = i;
			int[] parent = new int[n];
			int[] used = new int[n];
			Deque<Integer> st = new ArrayDeque<>();
			st.push(root);
			parent[root] = -1;
			used[root] = 0;
			int max = 0;
			Set<Integer> maxv = new HashSet<>();
			while (!st.isEmpty()) {
				int e = st.pop();
				int pe = parent[e];

				for (int ne : edges.get(e)) {
					if (ne == pe) {
						continue;
					}
					st.push(ne);
					parent[ne] = e;
					used[ne] = used[e] + 1;
					if (used[ne] > max) {
						max = used[ne];
						maxv = new HashSet<>();
						maxv.add(ne);
					} else if (used[ne] == max) {
						maxv.add(ne);
					}
				}
			}
			v.addAll(maxv);
		}

		for (int i : v) {
			int root = i;
			int[] parent = new int[n];
			int[] used = new int[n];
			Deque<Integer> st = new ArrayDeque<>();
			st.push(root);
			parent[root] = -1;
			used[root] = 0;

			int[] cnt = new int[n];
			cnt[0] = 1;
			while (!st.isEmpty()) {
				int e = st.pop();
				int pe = parent[e];

				for (int ne : edges.get(e)) {
					if (ne == pe) {
						continue;
					}
					st.push(ne);
					parent[ne] = e;
					used[ne] = used[e] + 1;
					cnt[used[ne]]++;
				}
			}

			int[] sum = new int[n];
			sum[0] = cnt[0];
			for (int j = 1; j < n; j++) {
				sum[j] = sum[j - 1] + cnt[j];
			}

			for (int j = 0; cnt[j] == 1 && k - j >= 0; j++) {
				ret = Math.min(ret, sum[n - 1] - sum[k - j]);
			}
		}

		pr.println(ret);

		pr.close();
		sc.close();
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;

		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}

		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
//					it = Arrays.asList(br.readLine().split(" ")).iterator();
					it = Arrays.asList(br.readLine().split("\\p{javaWhitespace}+")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}

		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
