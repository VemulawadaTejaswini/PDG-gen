import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = in.nextInt();
		System.out.println(solve(n, k, v));
		in.close();
	}

	private static int solve(int n, int k, int[] v) {
		int a = 0;
		for (int l = 0; l <= k && l <= n; l++)
			for (int r = 0; r <= k - l && r <= n - l; r++) {
				int x = vSum(k, v, l, r);
				if (x > a)
					a = x;
			}
		return a;
	}

	private static int vSum(int k, int[] v, int l, int r) {
		int a = 0;
		int[] m = new int[l + r];
		int mi = 0;
		for (int i = 0; i < l; i++) {
			a += v[i];
			if (v[i] < 0)
				m[mi++] = v[i];
		}
		for (int i = v.length - 1; i > v.length - 1 - r; i--) {
			a += v[i];
			if (v[i] < 0)
				m[mi++] = v[i];
		}
		Arrays.sort(m);
		for (int i = 0; i < k - l - r && i < m.length; i++)
			a -= m[i];
		return a;
	}

}