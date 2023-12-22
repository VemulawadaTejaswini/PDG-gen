import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int p = (int) 1e9 + 7;
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int k = Integer.parseInt(sc.next());
			long[] a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = Long.parseLong(sc.next());
			}
			Arrays.sort(a);
			int l = 0;
			int r = n - 1;
			long ans = k % 2 == 0 ? 1 : a[r--];
			int b = ans <= 0 ? -1 : 1;

			while (k > 1) {
				long numl = a[l] * a[l + 1] * b;
				long numr = a[r] * a[r - 1] * b;
				if (numl >= numr) {
					ans = ans * (numl % p) % p;
					l = l + 2;
				} else {
					ans = ans * (numr % p) % p;
					r = r - 2;
				}
				k = k - 2;
			}
			System.out.print((ans + p) % p);
		}
	}
}
