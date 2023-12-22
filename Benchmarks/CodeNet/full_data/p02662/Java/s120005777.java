import java.util.*;
public class Main {
	public static void main(String[] $) {
		var c = new Scanner(System.in);
		int m = 998244353, n = c.nextInt(), s = c.nextInt();
		int[] a = new int[n], d = new int[3001];
		Arrays.setAll(a, i -> Integer.parseInt(c.next()));
		d[0] = 2; d[a[0]] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = s; j >= 0; j--) {
				d[j] <<= 1;
				if (d[j] >= m) d[j] -= m;
				if (j >= a[i]) {
					d[j] += d[j - a[i]];
					if (d[j] >= m) d[j] -= m;
				}
			}
		}
		System.out.print(d[s]);
	}
}