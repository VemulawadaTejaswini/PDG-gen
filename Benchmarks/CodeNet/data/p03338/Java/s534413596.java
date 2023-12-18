import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int ans = 0;
		for (int i = 0; i <= N; i++) {
			int tmp = func(S.substring(0, i), S.substring(i));
			ans = Math.max(ans, tmp);
		}

		System.out.println(ans);
	}

	static int func(String s, String t) {
		int ans = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			boolean founds = false, foundt = false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c) {
					founds = true;
				}
			}
			for (int i = 0; i < t.length(); i++) {
				if (t.charAt(i) == c) {
					foundt = true;
				}
			}
			if(founds && foundt) ans++;
		}

		return ans;
	}
}