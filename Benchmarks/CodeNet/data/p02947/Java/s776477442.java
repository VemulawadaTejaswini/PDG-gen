import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = true;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			char[] t = in.next().toCharArray();
			Arrays.sort(t);
			s[i] = String.valueOf(t);
		}
		System.out.println(solve(n, s));
		in.close();
	}

	private static long solve(int n, String[] s) {
		long ans = 0;
		Arrays.sort(s);
		int p = 0;
		for (int i = 1; i < n; i++)
			if (!s[p].equals(s[i])) {
				long l = i - p;
				if (l > 1)
					ans += l * (l - 1) / 2;
				p = i;
			}
		long l = n - p;
		if (l > 1)
			ans += l * (l - 1) / 2;
		return ans;
	}
}
