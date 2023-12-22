import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n = 26, d;
	static int[] c;
	static int[][] s;

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		d = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sa[i]);
		}
		s = new int[d][n];
		for (int i = 0; i < d; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				s[i][j] = Integer.parseInt(sa[j]);
			}
		}
		br.close();

		int[] t = new int[d];
		int[] last = new int[n];
		for (int i = 0; i < d; i++) {
			int max = -1;
			int idx = -1;
			for (int j = 0; j < n; j++) {
				int val = s[i][j] + c[j] * (i + 1 - last[j]);
				if (val > max) {
					max = val;
					idx = j;
				}
			}
			t[i] = idx;
		}

		for (int i = 0; i < d; i++) {
			int max = Integer.MIN_VALUE;
			int idx = t[i];
			for (int j = 0; j < n; j++) {
				t[i] = j;
				int val = calc(t, i);
				if (val > max) {
					max = val;
					idx = j;
				}
			}
			t[i] = idx;
		}

		long mt = 0;
		while (System.currentTimeMillis() - start < 1900 - mt) {
			long l = System.currentTimeMillis();
			for (int i = 0; i < d; i++) {
				int max = Integer.MIN_VALUE;
				int idx = t[i];
				for (int j = 0; j < n; j++) {
					t[i] = j;
					int val = calc(t, d - 1);
					if (val > max) {
						max = val;
						idx = j;
					}
				}
				t[i] = idx;
			}
			mt = Math.max(mt, System.currentTimeMillis() - l);
		}

		for (int i = 0; i < d; i++) {
			System.out.println(t[i] + 1);
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	static int calc(int[] t, int end) {
		int[] last = new int[n];
		int ret = 0;
		for (int i = 0; i <= end; i++) {
			ret += s[i][t[i]];
			last[t[i]] = i + 1;
			for (int j = 0; j < n; j++) {
				ret -= c[j] * (i + 1 - last[j]);
			}
		}
		return ret;
	}

//	static int[] calc(int[] t, int end) {
//		int[] last = new int[n];
//		int[] ret = new int[end];
//		for (int i = 0; i < end; i++) {
//			if (i > 0) {
//				ret[i] += ret[i - 1];
//			}
//			ret[i] += s[i][t[i]];
//			last[t[i]] = i + 1;
//			for (int j = 0; j < n; j++) {
//				ret[i] -= c[j] * (i + 1 - last[j]);
//			}
//		}
//		return ret;
//	}
}
