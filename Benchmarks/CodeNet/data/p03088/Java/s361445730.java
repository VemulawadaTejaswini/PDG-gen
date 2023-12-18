import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		System.out.println(solve(n));
		in.close();
	}

	static int[][][][] h = new int[4][4][4][100];
	static int[] hi = new int[256];

	private static int solve(int n) {
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				for (int k = 0; k < 4; k++)
					for (int l = 0; l < 100; l++)
						h[i][j][k][l] = -1;
		hi['A'] = 0;
		hi['G'] = 1;
		hi['C'] = 2;
		hi['T'] = 3;
		char[] s = new char[n];
		return fnc(s, 0);
	}

	private static int fnc(char[] s, int i) {
		if (!chk(s, i - 1))
			return 0;
		if (i == s.length)
			return 1;
		if (hist(s, i) >= 0)
			return hist(s, i);
		int c = 0;
		s[i] = 'A';
		c += fnc(s, i + 1);
		c %= 1000000007;
		s[i] = 'G';
		c += fnc(s, i + 1);
		c %= 1000000007;
		s[i] = 'T';
		c += fnc(s, i + 1);
		c %= 1000000007;
		s[i] = 'C';
		c += fnc(s, i + 1);
		c %= 1000000007;
		histSave(s, i, c);
		return c;
	}

	private static void histSave(char[] s, int m, int c) {
		if (m > 3)
			h[hi[s[m - 3]]][hi[s[m - 2]]][hi[s[m - 1]]][m] = c;
	}

	private static int hist(char[] s, int m) {
		if (m < 4)
			return -1;
		return h[hi[s[m - 3]]][hi[s[m - 2]]][hi[s[m - 1]]][m];
	}

	private static boolean chk(char[] s, int r) {
		if (r < 2)
			return true;
		if (s[r - 2] == 'A' && s[r - 1] == 'G' && s[r] == 'C')
			return false;
		if (s[r - 2] == 'A' && s[r - 1] == 'C' && s[r] == 'G')
			return false;
		if (s[r - 2] == 'G' && s[r - 1] == 'A' && s[r] == 'C')
			return false;
		if (r < 3)
			return true;
		if (s[r - 3] == 'A' && s[r - 1] == 'G' && s[r] == 'C')
			return false;
		if (s[r - 3] == 'A' && s[r - 2] == 'G' && s[r] == 'C')
			return false;
		return true;
	}
}