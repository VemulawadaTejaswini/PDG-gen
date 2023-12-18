import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), a[] = new int[n];
		ArrayList<Integer> prefixMaxes = new ArrayList();
		int max = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] > max) {
				prefixMaxes.add(i);
				max = a[i];
			}
		}
		Collections.sort(prefixMaxes, (i, j) -> a[i] == a[j] ? i - j : a[j] - a[i]);
		int[] b = a.clone();
		sort(b);
		TreeMap<Integer, Integer> map = new TreeMap();
		for (int x : a)
			map.put(x, 0);
		map.put(0, 0);
		int id = 1;
		for (int x : map.keySet()) {
			map.put(x, id++);
		}
		FenwickTree cnt_ft = new FenwickTree(map.size()), sum_ft = new FenwickTree(map.size());
		int val = 0;
		long sum = 0;
		long cnt = 0;
		int k = n - 1;
		long[] ans = new long[n];
		for (int j = 0; j < prefixMaxes.size();) {
			int idx = prefixMaxes.get(j);

			int nxt = -1;
			j++;
			while (j < prefixMaxes.size()) {
				if (prefixMaxes.get(j) < idx) {
					nxt = prefixMaxes.get(j);
					break;
				} else
					j++;
			}
			ans[idx] = -(sum - cnt * 1L * val);
			val = nxt == -1 ? 0 : a[nxt];
			while (k >= 0 && b[k] >= val) {
				int ft_idx = map.get(b[k]);
				sum_ft.update(ft_idx, b[k]);
				cnt_ft.update(ft_idx, 1);
				k--;
			}
			sum = sum_ft.query(map.get(val), map.size());
			cnt = cnt_ft.query(map.get(val), map.size());

//			for (int k = idx; k < n; k++)
//				if (a[k] > val) {
//					cnt++;
//					sum += a[k];
//				}
			ans[idx] += sum - cnt * 1L * val;
		}
		for (long x : ans)
			out.println(x);
		out.close();

	}

	static class FenwickTree {
		long[] bit;

		FenwickTree(int n) {
			bit = new long[n + 1];
		}

		long query(int l, int r) {
			return query(r) - query(l - 1);
		}

		void update(int idx, int v) {
			while (idx < bit.length) {
				bit[idx] += v;
				idx += idx & -idx;
			}
		}

		long query(int idx) {
			long ans = 0;
			while (idx > 0) {
				ans += bit[idx];
				idx -= idx & -idx;
			}
			return ans;
		}
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

		int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}