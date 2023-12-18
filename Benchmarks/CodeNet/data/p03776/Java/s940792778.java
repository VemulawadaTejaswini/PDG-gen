import java.math.BigInteger;
import java.lang.Object;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();

		Long[] a = new Long[n];

		for (int i = 0; i < n; i++) {
			a[i] = new Long(sc.nextLong());
		}

		Arrays.sort(a);
		Collections.reverse(Arrays.asList(a));

		BigInteger c[][] = new BigInteger[60][60];
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 60; j++) {
				c[i][j] = BigInteger.ZERO;
			}
		}
		c[0][0] = BigInteger.ONE;
		for (int i = 0; i < 59; i++) {
			for (int j = 0; j < 59; j++) {
				c[i + 1][j] = c[i + 1][j].add(c[i][j]);
				c[i + 1][j + 1] = c[i + 1][j + 1].add(c[i][j]);
			}
		}

		int x = l;
		int y = l;

		while (x > 0 && a[x-1].equals(a[x])) x--;
		while (y + 1 < n && a[y+1].equals(a[y])) y++;

		BigInteger cnt = BigInteger.ZERO;

		int all = y - x + 1;

		if (x == 0) {
			for (int i = l; i <= r; i++) {
				cnt = cnt.add(c[all][i]);
			}
		} else {
			cnt = c[all][l-x+1];
		}

		long sum = 0;
		for (int i = 0; i < l; i++) {
			sum += a[i];
		}
		System.out.format("%.10f\n", (double) sum / l);
		System.out.println(cnt);
	}
}
