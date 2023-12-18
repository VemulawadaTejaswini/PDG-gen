import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		long sum = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
			if (i % 2 != 0) {
				odd += a[i];
			}
		}
		long[] x = new long[n];
		x[0] = sum - 2 * odd;
		sb.append(x[0]);
		for (int i = 1; i < n; i++) {
			x[i] = 2 * a[i - 1] - x[i - 1];
			sb.append(" " + x[i]);
		}
		System.out.println(sb);
	}
}