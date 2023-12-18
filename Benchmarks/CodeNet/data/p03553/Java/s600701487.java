import java.util.*;
import java.io.*;

public class Main {

	int[] a;
	int n;
	int[] count;
	
	long ans = Long.MAX_VALUE;
	
	void go(int pos, long sum) {
		if (pos * 3 > n) {
			for (int i = pos; i <= n; i++) {
				if (i % 2 == 0 && i / 2 >= pos) {
					continue;
				}
				if (i * 2 > n) {
					if (count[i] == 0 && a[i] < 0) {
						sum += a[i];
					}	
				} else {
					long cur1 = count[i] == 0 ? a[i] : 0;
					long cur2 = count[2 * i] == 0 ? a[2 * i] : 0;
					sum += Math.min(0, Math.min(cur1 + cur2, cur2));
				}
			}
			ans = Math.min(ans, sum);
			return;
		}
		go(pos + 1, sum);
		if (count[pos] == 0) {
			for (int i = pos; i <= n; i += pos) {
				if (count[i] == 0) {
					sum += a[i];
				}
				count[i]++;
			}
			go(pos + 1, sum);
			for (int i = pos; i <= n; i += pos) {
				count[i]--;
			}
		}
	}
	
	void solve() {
		n=  in.nextInt();
		a = new int[n + 1];
		count = new int[n + 1];
		long res = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
			res += a[i];
		}
		go(1, 0);
		out.println(res - ans);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
