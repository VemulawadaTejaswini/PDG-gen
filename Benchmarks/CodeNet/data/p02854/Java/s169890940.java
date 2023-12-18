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

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		long s2 = sum / 2;
		long sum1 = 0;
		int idx = 0;
		while (sum1 < s2) {
			sum1 += a[idx];
			idx++;
		}
		if (idx == n) {
			sum1 -= a[n - 1];
		}
		long sum2 = sum - sum1;
		System.out.println(Math.abs(sum1 - sum2));
	}
}
