import java.util.Scanner;

public class Main {
	static int n;
	static char[] s;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.next().toCharArray();
		sc.close();

		char[] ans = new char[n + 2];
		ans[0] = 'S';
		ans[1] = 'S';
		exec(ans);
		if (ans[0] == ans[n] && ans[1] == ans[n + 1]) {
			System.out.println(new String(ans).substring(0, n));
			return;
		}

		ans[1] = 'W';
		exec(ans);
		if (ans[0] == ans[n] && ans[1] == ans[n + 1]) {
			System.out.println(new String(ans).substring(0, n));
			return;
		}

		ans[0] = 'W';
		ans[1] = 'S';
		exec(ans);
		if (ans[0] == ans[n] && ans[1] == ans[n + 1]) {
			System.out.println(new String(ans).substring(0, n));
			return;
		}

		ans[1] = 'W';
		exec(ans);
		if (ans[0] == ans[n] && ans[1] == ans[n + 1]) {
			System.out.println(new String(ans).substring(0, n));
			return;
		}
		System.out.println(-1);
	}

	static void exec(char[] a) {
		for (int i = 2; i < n + 2; i++) {
			if ((a[i - 1] == 'S') ^ (s[(i - 1) % n] == 'o')) {
				a[i] = other(a[i - 2]);
			} else {
				a[i] = a[i - 2];
			}
		}
	}

	static char other(char c) {
		if (c == 'S') {
			return 'W';
		} else {
			return 'S';
		}
	}
}
