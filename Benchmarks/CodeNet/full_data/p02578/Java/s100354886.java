import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long ans = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				int d = a[i - 1] - a[i];
				ans += d;
				a[i] += d;
			}
		}
		System.out.println(ans);
	}
}
