import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigDecimal[] a = new BigDecimal[n];
		for (int i = 0; i < n; i++) {
			a[i] = new BigDecimal(br.readLine());
		}
		br.close();

		BigDecimal b = BigDecimal.valueOf(1000000000);
		int[] c2 = new int[n];
		int[] c5 = new int[n];
		for (int i = 0; i < n; i++) {
			long v = a[i].multiply(b).longValue();
			while (v % 2 == 0) {
				v /= 2;
				c2[i]++;
			}
			while (v % 5 == 0) {
				v /= 5;
				c5[i]++;
			}
		}

		int[][] sum = new int[50][50];
		for (int i = 0; i < n; i++) {
			sum[c2[i]][c5[i]]++;
		}
		for (int i = 49; i >= 0; i--) {
			for (int j = 48; j >= 0; j--) {
				sum[i][j] += sum[i][j + 1];
			}
		}
		for (int i = 48; i >= 0; i--) {
			for (int j = 49; j >= 0; j--) {
				sum[i][j] += sum[i + 1][j];
			}
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			int m2 = Math.max(18 - c2[i], 0);
			int m5 = Math.max(18 - c5[i], 0);
			ans += sum[m2][m5];
			if (m2 <= c2[i] && m5 <= c5[i]) {
				ans--;
			}
		}
		System.out.println(ans / 2);
	}
}
