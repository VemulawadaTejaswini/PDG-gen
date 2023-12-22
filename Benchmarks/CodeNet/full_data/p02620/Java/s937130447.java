import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int n = 26, d;
	static int[] c, last;
	static int[][] s;

	public static void main(String[] args) throws Exception {
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
		int[] t = inputB(br);

		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int k = Integer.parseInt(sa[0]) - 1;
			int q = Integer.parseInt(sa[1]) - 1;
			t[k] = q;
			System.out.println(calc(t, d - 1));
		}
		br.close();
	}

	static int[] inputB(BufferedReader br) throws Exception {
		int[] t = new int[d];
		for (int i = 0; i < d; i++) {
			t[i] = Integer.parseInt(br.readLine()) - 1;
		}
		return t;
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
}
