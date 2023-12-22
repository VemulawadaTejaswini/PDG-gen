import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int k = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int ans = 0;
		int sum = 0;
		int j = -1;
		for (int i = 0; i < m; i++) {
			if (sum + b[i] <= k) {
				sum += b[i];
				j = i;
			} else {
				break;
			}
		}
		ans = j + 1;

		for (int i = 0; i < n; i++) {
			sum += a[i];
			while (j >= 0 && sum > k) {
				sum -= b[j];
				j--;
			}
			if (sum <= k) {
				ans = Math.max(ans, i + j + 2);
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
