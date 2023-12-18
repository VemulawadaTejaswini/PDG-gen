import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		long s = 0;
		for (int i = n - 1; i >= 0; --i) {
			if ((a[i] + s) % b[i] == 0)
				continue;
			s += b[i] - (a[i] + s) % b[i];
		}
		System.out.println(s);
	}
}
