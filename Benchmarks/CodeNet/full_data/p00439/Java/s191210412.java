import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int a[];
		int num;
		int sum, max;

		n = sc.nextInt();
		k = sc.nextInt();
		while (n + k != 0) {
			sum = 0;
			max = 0;
			a = new int[n];
			for (int i = 0; i < k; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
				max = sum;
			}
			for (int i = k; i < n; i++) {
				a[i] = sc.nextInt();
				sum -= a[i - k];
				sum += a[i];
				if (max < sum) {
					max = sum;
				}
			}
			System.out.println(max);
			n = sc.nextInt();
			k = sc.nextInt();
		}
	}
}