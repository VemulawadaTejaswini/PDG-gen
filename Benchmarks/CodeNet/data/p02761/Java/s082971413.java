import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];
		for (int i = 0; i < m; i++) {
			s[i] = in.nextInt() - 1;
			c[i] = in.nextInt();
		}
		int r = solve(n, m, s, c);
		System.out.println(r);
		in.close();
	}

	private static int solve(int n, int m, int[] s, int[] c) {
		int[] r = new int[n];
		for (int i = 0; i < n; i++)
			r[i] = -1;
		for (int i = 0; i < m; i++)
			if (r[s[i]] == -1)
				r[s[i]] = c[i];
			else if (r[s[i]] != c[i])
				return -1;
		if (n > 1 && r[0] == 0)
			return -1;
		if (r[0] == -1)
			if (n > 1)
				r[0] = 1;
			else
				r[0] = 0;
		for (int i = 1; i < n; i++)
			if (r[i] == -1)
				r[i] = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans *= 10;
			ans += r[i];
		}
		return ans;
	}

}
