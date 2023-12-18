import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] cnt = new int[n];
		int kind = 0;
		Arrays.fill(cnt, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			if (cnt[a[i] - 1] == Integer.MAX_VALUE) {
				cnt[a[i] - 1] = 1;
				kind++;
			} else {
				cnt[a[i] - 1]++;
			}
		}

		Arrays.sort(cnt);

		int ans = 0;
		for (int i = 0; i < kind - k; i++) {
			ans += cnt[i];
		}

		System.out.println(ans);

		sc.close();
	}
}