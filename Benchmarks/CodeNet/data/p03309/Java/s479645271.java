import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			a[i] -= i + 1;
			sum += a[i];
		}

		long sadness = 0;
		long b = sum / n;

		for (int i = 0; i < n; i++) {
			sadness += Math.abs(a[i] - b);
		}

		long t = 0;
		for (int i = 0; i < n; i++) {
			t += Math.abs(a[i] - (b + 1));
		}
		if (t < sadness) sadness = t;
		t = 0;
		for (int i = 0; i < n; i++) {
			t += Math.abs(a[i] - (b - 1));
		}
		if (t < sadness) sadness = t;

		System.out.println(sadness);
	}
}
