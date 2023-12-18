import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			Long[] a = new Long[n];
			Long[] b = new Long[n];
			Long[] c = new Long[n];
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(sc.next());
			}
			for (int i = 0; i < n; i++) {
				b[i] = Long.parseLong(sc.next());
			}
			for (int i = 0; i < n; i++) {
				c[i] = Long.parseLong(sc.next());
			}
			Arrays.sort(a);
			Arrays.sort(b);
			Arrays.sort(c);
			long ans = 0;
			for (Long e : b) {
				int u = Arrays.binarySearch(a, e, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
				int l = Arrays.binarySearch(c, e, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
				ans += (~u) * (n - ~l);
			}
			System.out.print(ans);
		}
	}
}