import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int ans = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			boolean isPrevA = false;
			for (int j = 0; j < s[i].length(); j++) {
				if (isPrevA && s[i].charAt(j) == 'B') {
					ans++;
				}
				if (s[i].charAt(j) == 'A')
					isPrevA = true;
				else
					isPrevA = false;
			}
			if (s[i].charAt(0) == 'B')
				end++;
			if (s[i].charAt(s[i].length() - 1) == 'A')
				start++;
		}
		sc.close();
		ans += Math.min(Math.min(start, end), n - 1);
		System.out.println(ans);
	}
}
