import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		int[] a = new int[n];
		long[] d = new long[100001];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			d[a[i]] += Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		if (k <= d[a[0]]) {
			System.out.println(a[0]);
			return;
		}
		long[] c = new long[n];
		c[0] = d[a[0]];
		for (int i = 1; i < n; i++) {
			c[i] = c[i - 1] + d[a[i]];
			if (c[i] >= k) {
				System.out.println(a[i]);
				return;
			}
		}
	}
}