import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.nextInt();
		}
		Arrays.sort(s);
		boolean f = true;;
		for (int i = 0; i < n; i++) {
			if (s[i] % 10 != 0) {
				f = false;
			}
		}

		int ans = 0;
		if (f) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < n; i++) {
			ans += s[i];
		}
		if (ans % 10 != 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < n; i++) {
			ans -= s[i];
			if (ans % 10 != 0) {
				System.out.println(ans);
				return;
			} else {
				ans += s[i];
			}
		}
	}
}
