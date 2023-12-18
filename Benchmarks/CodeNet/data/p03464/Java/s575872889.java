import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		String[] sa = br.readLine().split(" ");
		int[] a = new int[k];
		for (int i = 0; i < k; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long min = 2;
		long max = 2;
		for (int i = k - 1; i >= 0; i--) {
			long x = min / a[i];
			long y = max / a[i];
			if (x == y && min % a[i] != 0) {
				System.out.println(-1);
				return;
			}
			if (min % a[i] != 0) {
				x++;
			}
			if (max % a[i] == 0) {
				y++;
			}
			if (x >= y) {
				y = x + 1;
			}
			min = a[i] * x;
			max = a[i] * y - 1;
		}
		System.out.println(min + " " + max);
	}
}
