import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		int[] dist = new int[n - k + 1];

		for (int i = 0; i < n - k + 1; i++) {
			dist[i] = Math.abs(x[i + k - 1] - x[i]);
			dist[i] += Math.min(Math.abs(x[i + k - 1]), Math.abs(x[i]));

		}

		System.out.println(haimin(dist));

	}

	public static int haimin(int a[]) {
		int d;
		d = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (d >= a[i]) {
				d = a[i];
			}

		}
		return d;
	}

}
