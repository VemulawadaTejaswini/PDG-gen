import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int m = a[n - 1];
		boolean sieve[] = new boolean[m + 1], taken[] = new boolean[m + 1];
		for (int i = 0; i < m + 1; i++)
			sieve[i] = true;
		for (int i = 0; i < n; i++)
			if (sieve[a[i]] && !taken[a[i]]) {
				taken[a[i]] = true;
				for (int j = a[i] * 2; j < m + 1; j = j + a[i])
					sieve[j] = false;
			}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (i > 0 && a[i] == a[i - 1])
				continue;
			if (i < n - 1 && a[i] == a[i + 1])
				continue;
			if (sieve[a[i]])
				++ans;
		}
		System.out.println(ans);
	}
}
