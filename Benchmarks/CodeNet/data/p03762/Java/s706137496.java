import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] y = new int[m];
		for (int i = 0; i < m; i++) {
			y[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int mod = 1000000007;
		long sumx = calc(x, mod);
		long sumy = calc(y, mod);
		System.out.println(sumx * sumy % mod);
	}

	static long calc(int[] x, int mod) {
		int n = x.length;
		long ret = 0;
		for (int i = 1; i < n; i++) {
			long d = x[i] - x[i - 1];
			d *= i;
			d %= mod;
			d *= (n - i);
			d %= mod;
			ret += d;
		}
		ret %= mod;
		return ret;
	}
}
