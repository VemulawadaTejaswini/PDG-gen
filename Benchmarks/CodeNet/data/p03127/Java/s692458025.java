import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int imin = -1;
		int ans = a[0];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int mod = a[j] % a[i];
				if (mod != 0 && mod < ans) {
					ans = mod;
					imin = j;
				}
			}
		}

		if (imin < 0) {
			System.out.println(ans);
			sc.close();
			return;
		}

		a[imin] = ans;
		outer:
		while (true) {
			imin = -1;
			for (int i = 0; i < n; i++) {
				int mod = a[i] % ans;
				if (mod != 0 && mod < ans) {
					ans = mod;
					imin = i;
				}
			}
			if (imin < 0) {
				break outer;
			}
			if (imin >= 0) {
				a[imin] = ans;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
