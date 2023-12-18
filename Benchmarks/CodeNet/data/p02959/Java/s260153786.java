import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		int ans = 0;
		int rest[] = new int[n + 1], i;
		for (i = 0; i < n; i++) {

			if (a[i] < b[i]) {
				ans += a[i];
				rest[i + 1] = rest[i] + b[i] - a[i];
			} else if (a[i] >= b[i] && rest[i] > 0) {
				ans += b[i];
				rest[i + 1] = rest[i];
			} else {
				ans += b[i];
			}
		}

		if (a[n] < rest[n])
			ans += a[n];
		else
			ans += rest[n];

		System.out.println(ans);}}