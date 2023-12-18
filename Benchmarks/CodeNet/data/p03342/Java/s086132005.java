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
		int left = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			while (sum + a[i] != (sum ^ a[i])) {
				ans += i - left;
				sum -= a[left];
				left++;
			}
			sum += a[i];
		}
		while (left < n) {
			ans += n - left;
			sum -= a[left];
			left++;
		}
		System.out.println(ans);
	}
}
