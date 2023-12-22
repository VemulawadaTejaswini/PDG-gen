import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		int ans = solve(s.toCharArray(), t.toCharArray());
		System.out.println(ans);
	}

	public static int solve(char[] s, char[] t) {
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != t[i]) {
				ans++;
			}
		}
		return ans;
	}
}
