import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[]$) {
		int n = scanner.nextInt();
		long c = scanner.nextLong();
		long[][] a = new long[n][2];
		long a1max = 0;
		long a2max = 0;
		long b1max = 0;
		long b2max = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i][0] = scanner.nextInt();
			sum += a[i][1] = scanner.nextInt();
			a1max = Math.max(a1max, sum - a[i][0] * 2);
			a2max = Math.max(a2max, sum - a[i][0]);
			a[i][0] = c - a[i][0];
		}
		sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			sum += a[i][1];
			b1max = Math.max(b1max, sum - a[i][0] * 2);
			b2max = Math.max(b2max, sum - a[i][0]);
		}
		System.out.println(Math.max(Math.max(a2max, b2max), Math.max(a1max + b2max, b1max + a2max)));
		
	}
}