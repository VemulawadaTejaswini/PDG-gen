import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		long ans = 0;
		long startWithB = 0;
		long endWithA = 0;
		long both = 0;
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
				startWithB++;
			if (s[i].charAt(s[i].length() - 1) == 'A')
				endWithA++;
			if ((s[i].charAt(0) == 'B') && (s[i].charAt(s[i].length() - 1) == 'A'))
				both++;
		}
		sc.close();
		if (!((both == startWithB) && (both == endWithA)))
			ans += Math.min(Math.min(startWithB, endWithA), n - 1);
		else if (both == 0)
			ans += Math.min(Math.min(startWithB, endWithA), 0);
		else
			ans += Math.min(Math.min(startWithB, endWithA), both - 1);
		System.out.println(ans);
	}
}
