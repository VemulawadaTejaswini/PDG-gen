import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int m = in.nextInt();
		if (m == 0) {
			System.out.println(0);

		} else {
			int[] a = new int[m];
			int[] b = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = in.nextInt();
				b[i] = in.nextInt();
			}
			int[] f = new int[n + 1];
			int[] c = new int[n + 1];
			setFrend(f, c, a, b);
			int ans = 1;
			for (int i = 1; i <= n; i++)
				if (c[i] > ans)
					ans = c[i];
			System.out.println(ans);
		}
	}

	private static void setFrend(int[] f, int[] c, int[] a, int[] b) {
		for (int i = 0; i < a.length; i++)
			setPair(f, c, a[i], b[i]);
	}

	private static void setPair(int[] f, int[] c, int a, int b) {
		int at = getTop(f, c, a);
		int bt = getTop(f, c, b);
		if (at == bt)
			return;
		c[at] += c[bt];
		c[bt] = 0;
		f[bt] = at;
	}

	private static int getTop(int[] f, int[] c, int x) {
		if (f[x] == x)
			return x;
		if (f[x] == 0) {
			c[x] = 1;
			f[x] = x;
			return x;
		}
		int t = getTop(f, c, f[x]);
		f[x] = t;
		return t;
	}
}
