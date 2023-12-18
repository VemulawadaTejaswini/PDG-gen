import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] s = new int[n + 1];
		s[0] = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			s[i + 1] = s[i] + a[i];
		}
		Arrays.sort(s);
		int t = s[0];
		int cnt = 1;
		int ans = 0;
		for (int i = 1; i < n + 1; i++) {
			if (t == s[i]) {
				cnt++;
			} else {
				ans += cnt * (cnt - 1) / 2;
				t = s[i];
				cnt = 1;
			}
		}
		ans += cnt * (cnt - 1) / 2;
		System.out.println(ans);
	}
}
