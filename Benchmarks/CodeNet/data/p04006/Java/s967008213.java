import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long x = Integer.parseInt(sa[1]);

		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] mins = new int[n];
		System.arraycopy(a, 0, mins, 0, n);

		long ans = Long.MAX_VALUE;
		for (int k = 0; k < n; k++) {
			long sum = 0;
			for (int i = 0; i < n; i++) {
				mins[i] = Math.min(mins[i], a[minus(i, k, n)]);
				sum += mins[i];
			}
			ans = Math.min(ans, sum + k * x);
		}
		System.out.println(ans);
	}

	static int minus(int a, int b, int n) {
		int c = a - b;
		if (c < 0) {
			c += n;
		}
		return c;
	}

	static int plus(int a, int b, int n) {
		int c = a + b;
		if (c >= n) {
			c -= n;
		}
		return c;
	}
}
