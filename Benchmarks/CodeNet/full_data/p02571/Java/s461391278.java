import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		String t = in.next();
		int ans = 9999;
		for (int i = 0; i <= s.length() - t.length(); i++) {
			int x = countUnmatch(s.substring(i, i + t.length()), t);
			if (x < ans)
				ans = x;
		}
		System.out.println(ans);
	}

	private static int countUnmatch(String s, String t) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != t.charAt(i))
				ans++;
		return ans;
	}
}
