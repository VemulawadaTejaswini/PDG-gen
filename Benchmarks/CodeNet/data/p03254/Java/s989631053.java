import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long x = Integer.parseInt(sa[1]);
		long[] a = new long[n];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);

		int ans = 0;
		for (int i = 0; i < n; i++) {
			x -= a[i];
			if (x >= 0) {
				ans++;
			} else {
				break;
			}
		}
		if (x > 0) {
			ans--;
		}
		System.out.println(ans);
	}
}
