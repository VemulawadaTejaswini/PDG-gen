import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		Arrays.parallelSort(a);

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] * 2 >= a[i + 1]) {
				ans++;
			}
			a[i + 1] += a[i];
		}
		System.out.println(ans);
	}
}
