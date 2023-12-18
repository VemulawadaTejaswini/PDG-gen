import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long x = Long.parseLong(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			b[i] = a[i];
		}
		if (a[0] > x)
			a[0] = x;
		for (int i = 1; i < n; i++)
			a[i] = Math.min(a[i], x - a[i - 1]);
		long ans = 0;
		for (int i = 0; i < n; i++)
			ans += b[i] - a[i];
		System.out.println(ans);
	}
}