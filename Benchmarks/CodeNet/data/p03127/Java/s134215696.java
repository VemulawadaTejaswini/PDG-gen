import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				ans = gcl(a[i], a[i + 1]);
			} else {
				ans = gcl(a[i + 1], a[i]);
			}
			a[i + 1] = ans;
		}

		System.out.println(ans);

		sc.close();
	}

	public static int gcl(int max, int min) {
		if (max % min == 0) {
			return min;
		}
		return gcl(min, max % min);
	}
}
