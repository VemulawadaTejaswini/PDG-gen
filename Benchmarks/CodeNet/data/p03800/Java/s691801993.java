import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = (sc.next() + "*").toCharArray();
		s[n] = s[0];
		sc.close();

		char[] ans = new char[n + 2];
		ans[0] = 'S';
		ans[1] = 'S';
		if (judge(n, s, ans)) return;

		ans[0] = 'S';
		ans[1] = 'W';
		if (judge(n, s, ans)) return;

		ans[0] = 'W';
		ans[1] = 'W';
		if (judge(n, s, ans)) return;

		ans[0] = 'W';
		ans[1] = 'S';
		if (!judge(n, s, ans)) System.out.println(-1);
	}

	static boolean judge(int n, char[] s, char[] ans) {
		for (int i = 2; i < n + 2; i++) {
			if (ans[i - 1] == 'S') {
				if (s[i - 1] == 'o') {
					ans[i] = ans[i - 2];
				} else {
					ans[i] = not(ans[i - 2]);
				}
			} else {
				if (s[i - 1] == 'o') {
					ans[i] = not(ans[i - 2]);
				} else {
					ans[i] = ans[i - 2];
				}
			}
		}
		if (ans[n] == ans[0] && ans[n + 1] == ans[1]) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				sb.append(ans[i]);
			}
			System.out.println(sb.toString());
			return true;
		}
		return false;
	}

	static char not(char c) {
		if (c == 'S') {
			return 'W';
		} else {
			return 'S';
		}
	}
}
