import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sa[i]);
		}
		br.close();

		long xor = 0;
		for (int i = 2; i < n; i++) {
			xor ^= a[i];
		}

		long sum = a[0] + a[1];
		sum -= xor;
		if (sum % 2 == 1) {
			System.out.println(-1);
			return;
		}
		sum /= 2;
		if ((sum & xor) != 0 || sum > a[0]) {
			System.out.println(-1);
			return;
		}

		long b = sum;
		for (int i = 41; i >= 0; i--) {
			if ((xor >> i & 1) == 1) {
				if (b + (1L << i) <= a[0]) {
					b += (1L << i);
				}
			}
		}
		if (b == 0) {
			System.out.println(-1);
		} else {
			System.out.println(a[0] - b);
		}
	}
}
