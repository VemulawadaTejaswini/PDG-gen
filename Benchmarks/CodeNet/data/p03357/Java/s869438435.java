import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] v = new int[2 * n + 1];
		char[] c = new char[2 * n + 1];
		int[] mapw = new int[n + 1];
		int[] mapb = new int[n + 1];
		for (int i = 1; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
			v[i] = sc.nextInt();
			if (c[i] == 'W') {
				mapw[v[i]] = i;
			} else
				mapb[v[i]] = i;
		}
		FenwickTree ft = new FenwickTree(2 * n);
		for (int i = 1; i <= 2 * n; i++)
			ft.point_update(i, 1);

		int minw = 1;
		int minb = 1;
		long ans = 0;
		while (minw != n + 1 && minb != n + 1) {
			if (mapw[minw] < mapb[minb]) {
				ft.point_update(mapw[minw], -1);
				ans += ft.rsq(mapw[minw]);
				minw++;
			} else {
				ft.point_update(mapb[minb], -1);
				ans += ft.rsq(mapb[minb]);
				minb++;
			}
		}
		while (minw != n + 1) {
			ft.point_update(mapw[minw], -1);
			ans += ft.rsq(mapw[minw]);
			minw++;
		}
		while (minb != n + 1) {
			ft.point_update(mapb[minb], -1);
			ans += ft.rsq(mapb[minb]);
			minb++;
		}
		pw.println(ans);
		pw.close();

	}

	static class FenwickTree { // one-based DS

		int n;
		int[] ft;

		FenwickTree(int size) {
			n = size;
			ft = new int[n + 1];
		}

		int rsq(int b) // O(log n)
		{
			int sum = 0;
			while (b > 0) {
				sum += ft[b];
				b -= b & -b;
			} // min?
			return sum;
		}

		int rsq(int a, int b) {
			return rsq(b) - rsq(a - 1);
		}

		void point_update(int k, int val) // O(log n), update = increment
		{
			while (k <= n) {
				ft[k] += val;
				k += k & -k;
			} // min?
		}

		int point_query(int idx) // c * O(log n), c < 1
		{
			int sum = ft[idx];
			if (idx > 0) {
				int z = idx ^ (idx & -idx);
				--idx;
				while (idx != z) {
					sum -= ft[idx];
					idx ^= idx & -idx;
				}
			}
			return sum;
		}

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
