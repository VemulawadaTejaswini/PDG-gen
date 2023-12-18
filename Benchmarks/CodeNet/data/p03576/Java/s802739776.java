import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		long[] x = new long[n];
		long[] y = new long[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		Arrays.parallelSort(x);
		Arrays.parallelSort(y);

		long ans = Long.MAX_VALUE;
		for (int a = 0; a < n - 1; a++) {
			for (int b = a + 1; b < n; b++) {
				for (int c = 0; c < n - 1; c++) {
					for (int d = c + 1; d < n; d++) {
						int cnt = 0;
						for (int i = 0; i < n; i++) {
							if (x[a] <= x[i] && x[i] <= x[b]
									&& y[c] <= y[i] && y[i] <= y[d]) {
								cnt++;
							}
						}
						if (cnt >= k) {
							ans = Math.min(ans, (x[b] - x[a]) * (y[d] - y[c]));
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
