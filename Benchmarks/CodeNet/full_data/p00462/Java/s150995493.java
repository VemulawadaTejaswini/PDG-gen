import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int d, n, m;
		int store[], home;
		int sum, min, max;

		d = sc.nextInt();
		while (d != 0) {
			sum = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			store = new int[n + 1];
			store[0] = 0;
			store[n] = d;
			for (int i = 1; i < n; i++) {
				store[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				min = 0;
				max = d;
				home = sc.nextInt();
				for (int j = 0; j <= n; j++) {
					if (min < store[j] && store[j] <= home) {
						min = store[j];
					}
					if (home <= store[j] && store[j] < max) {
						max = store[j];
					}
				}
				sum += Math.min(Math.abs(home - min), Math.abs(home - max));
			}
			System.out.println(sum);
			d = sc.nextInt();
		}
	}
}