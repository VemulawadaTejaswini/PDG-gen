import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(solve(a));
		in.close();
	}

	private static int solve(int[] a) {
		int ans = 0;
		int[] l = new int[a.length];
		int[] r = new int[a.length];

		l[0] = a[0];
		for (int i = 1; i < a.length; i++)
			l[i] = gcm(l[i - 1], a[i]);

		r[r.length - 1] = a[a.length - 1];
		for (int i = r.length - 2; i >= 0; i--)
			r[i] = gcm(r[i + 1], a[i]);

		if (r[1] > l[l.length - 2])
			ans = r[1];
		else
			ans = r[l.length - 2];
		for (int i = 1; i < a.length - 1; i++)
			ans = Math.max(ans, gcm(l[i - 1], r[i + 1]));
		
		return ans;
	}

	private static int gcm(int a, int b) {
		if (a == b)
			return a;
		if (b == 0)
			return a;
		if (a == 0)
			return b;
		if (a > b)
			return gcm(a % b, b);
		else
			return gcm(a, b % a);
	}
}
