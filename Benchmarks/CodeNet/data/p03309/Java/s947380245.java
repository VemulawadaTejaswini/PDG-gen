import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt() - (i + 1);
		}
		Arrays.sort(a);
		int mid = Math.round((a[0] + a[n - 1]) / 2);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - mid);
		}

		System.out.println(ans);
	}
}
