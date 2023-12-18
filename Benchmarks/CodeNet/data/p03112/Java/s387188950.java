import java.util.*;

public class Main {

	static int a, b;
	static long s[][];

	public static int half(int at, long x) {
		int l = 0, r = a + 1;
		if (at == 1)
			r = b + 1;
		int mid;
		while (l + 1 < r) {
			mid = (r + l) / 2;
			if (s[at][mid] >= x)
				r = mid;
			else
				l = mid;
		}
		return r;
	}

	public static long solve(long x) {
		long ans = 0;
		int sa, sb, ta, tb;
		long min = (long) Math.pow(10, 18);
		sb = half(0, x);
		sa = sb - 1;
		tb = half(1, x);
		ta = tb - 1;
		//System.out.println(sb + " " + tb + "?");
		for (int i = sa; i <= sb; ++i) {
			for (int j = ta; j <= tb; ++j) {
				ans = Math.abs(s[0][i] - x) + Math.abs(s[1][j] - s[0][i]);
				//System.out.println(ans + " ?");
				min = Math.min(ans, min);
				ans = Math.abs(s[1][j] - x) + Math.abs(s[0][i] - s[1][j]);
				min = Math.min(ans, min);
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int q = sc.nextInt();
		s = new long[2][Math.max(a, b) + 2];
		for (int i = 1; i <= a; ++i)
			s[0][i] = sc.nextLong();
		s[0][a + 1] = (long) Math.pow(10, 18);
		s[0][0] = -1 * s[0][a + 1];
		for (int i = 1; i <= b; ++i)
			s[1][i] = sc.nextLong();
		s[1][b + 1] = (long) Math.pow(10, 18);
		s[1][0] = -1 * s[1][b + 1];
		long x;
		for (int i = 0; i < q; ++i) {
			x = sc.nextLong();
			//System.out.println(x + "??");
			System.out.println(solve(x));
		}
		sc.close();
	}

}
