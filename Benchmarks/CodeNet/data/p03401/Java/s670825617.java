import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 2];

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += Math.abs(a[i + 1] - a[i]);
		}

		for (int i = 1; i <= n; i++) {
			int tmp = sum;
			int ans = tmp - (Math.abs(a[i + 1] - a[i]) + Math.abs(a[i] - a[i - 1])) + Math.abs(a[i + 1] - a[i - 1]);
			System.out.println(ans);
		}

		sc.close();
	}
}