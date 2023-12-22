import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int q = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		BIT bit = new BIT(n);
		for (int i = 0; i < n; i++) {
			bit.add(i + 1, a[i]);
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			sa = br.readLine().split(" ");
			int t = Integer.parseInt(sa[0]);
			if (t == 0) {
				int p = Integer.parseInt(sa[1]) + 1;
				int x = Integer.parseInt(sa[2]);
				bit.add(p, x);
			} else {
				int l = Integer.parseInt(sa[1]);
				int r = Integer.parseInt(sa[2]);
				pw.println(bit.sum(r) - bit.sum(l));
			}
		}
		pw.flush();
		br.close();
	}

	static class BIT {
		int n;
		long[] arr;

		public BIT(int n) {
			this.n = n;
			arr = new long[n + 1];
		}

		void add(int idx, long val) {
			for (int i = idx; i <= n; i += i & -i) {
				arr[i] += val;
			}
		}

		long sum(int idx) {
			long sum = 0;
			for (int i = idx; i > 0; i -= i & -i) {
				sum += arr[i];
			}
			return sum;
		}
	}
}
