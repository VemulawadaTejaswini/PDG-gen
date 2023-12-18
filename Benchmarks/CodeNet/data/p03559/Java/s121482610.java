import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(sa[i]);
		}
		sa = br.readLine().split(" ");
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		long ans = 0;
		for (int i = 0; i < n; i++) {
			long idxa = binarySearch(a, b[i] - 0.5);
			long idxc = binarySearch(c, b[i] + 0.5);
			ans += idxa * (n - idxc);
		}
		System.out.println(ans);
	}

	static int binarySearch(int[] array, double val) {
		int ng = -1;
		int ok = array.length;

		while (ok - ng > 1) {
			int mid = (ok + ng) / 2;
			if (array[mid] >= val) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		return ok;
	}
}
