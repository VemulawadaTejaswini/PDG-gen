import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String s = in.next();
		System.out.println(solve(n, s));
		in.close();
	}

	private static int solve(int n, String s) {
		int w2 = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '.')
				w2++;
		int b2 = s.length() - w2;
		if (w2 == 0 || b2 == 0)
			return 0;
		int w1 = 0;
		int b1 = 0;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '.') {
				w2--;
//				w1++;
			} else {
//				b2--;
				b1++;
			}
			if (b1 + w2 < ans)
				ans = b1 + w2;
		}
		return ans;
	}
}
