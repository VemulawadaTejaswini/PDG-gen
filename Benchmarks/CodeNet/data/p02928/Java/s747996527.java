import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.println(solve(n, k, a));
		in.close();
	}

	private static long solve(int n, int kk, int[] a) {
		long ret = 0;
		long k = kk;
		for (int i = 0; i < n; i++) {
			long r1 = 0;
			long r2 = 0;
			for (int j = 0; j < i; j++)
				if (a[i] < a[j])
					r1++;
			for (int j = i + 1; j < n; j++)
				if (a[i] < a[j])
					r2++;
			ret += r1 * k;
			ret += (r1 + r2) * (k - 1) * k / 2;
			ret %= 1000000007;
		}
		return ret;
	}
}
