import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long d = (a - b);

		long[] h = new long[n];
		long hi = 0;
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextLong();
			hi = Math.max(hi, h[i]);
		}

		long lo = -1;
		while ((hi - lo) > 1) {
			long m = (hi + lo) / 2;
			long count = 0;
			for (int i = 0; i < n; i++) {
				if (h[i] < m * b) continue;
				count += (h[i] - (m * b)) / d;
				count += ((h[i] - (m * b)) % d > 0) ? 1 : 0;
				if (count > m) break;
			}

			if (count <= m) {
				hi = m;
			} else {
				lo = m;
			}
		}

		System.out.println(hi);
	}
}
