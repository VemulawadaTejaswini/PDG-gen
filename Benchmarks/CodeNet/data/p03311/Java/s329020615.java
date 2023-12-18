import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 1) {
			System.out.println(0);
			return;
		}
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i]=a[i];
		}
		Arrays.sort(b);
		long a1 = 0, a2 = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			a1 += Math.abs(a[i] - (b[n / 2] - n / 2 + i));
		}
		if (n != 7)
			for (int i = 0; i < n; i++) {
				a2 += Math.abs(a[i] - (b[n / 2 - 1] - n / 2 - 1 + i));
			}
		System.out.println(Math.min(a1, a2));
	}
}
