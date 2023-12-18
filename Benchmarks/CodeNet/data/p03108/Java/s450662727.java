import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = in.nextInt() - 1;
			b[i] = in.nextInt() - 1;
		}
		solve(n, m, a, b);
		in.close();
	}

	private static void solve(int n, int m, int[] a, int[] b) {
		long[] ans = new long[m];
		ans[m - 1] = (long) n * (long) (n - 1) / 2L;

		int[] grp = new int[n];
		int[] mem = new int[n];
		for (int i = 0; i < n; i++) {
			grp[i] = -1;
			mem[i] = 1;
		}
		for (int i = m - 1; i > 0; i--) {
			if (getGrp(a[i], grp) == getGrp(b[i], grp)) {
				ans[i - 1] = ans[i];
				continue;
			}
			ans[i - 1] = ans[i] - (long) getMem(a[i], grp, mem) * (long) getMem(b[i], grp, mem);
			joinGrp(a[i], b[i], grp, mem);
		}
		for (int i = 0; i < m; i++)
			System.out.println(ans[i]);
	}

	private static void joinGrp(int i, int j, int[] grp, int[] mem) {
		mem[getGrp(i, grp)] += mem[getGrp(j, grp)];
		grp[getGrp(j, grp)] = getGrp(i, grp);
	}

	private static int getMem(int i, int[] grp, int[] mem) {
		return mem[getGrp(i, grp)];
	}

	private static int getGrp(int i, int[] grp) {
		if (grp[i] == -1)
			return i;
		if (grp[grp[i]] == -1)
			return grp[i];
		grp[i] = grp[grp[i]];
		return getGrp(grp[i], grp);
	}
}