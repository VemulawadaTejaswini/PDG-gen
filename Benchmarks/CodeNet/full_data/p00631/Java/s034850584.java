import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[], b[], c[];
		int sum, max;

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			sum = 0;
			max = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			b = new int[sum / 2];
			c = new int[sum / 2];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < sum / 2; j++) {
					if (j < a[i] - 1) {
						c[j] = b[j];
					} else if (j == a[i] - 1) {
						c[j] = a[i];
					} else {
						c[j] = b[j - a[i]] + a[i];
					}
				}
				if (max < c[sum / 2 - 1]) {
					max = c[sum / 2 - 1];
				}
				for (int j = 0; j < sum / 2; j++) {
					b[j] = c[j];
				}
			}
			System.out.println(sum - 2 * max);
			n = sc.nextInt();
		}
	}
}