import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		long[] x = new long[n];
		for (int i = 0; i < n; i++) {
			long a = in.nextInt();
			long b = in.nextInt();
			x[i] = 1000000001 * b + a;
		}
		System.out.println(solve(n, x));
		in.close();
	}

	private static String solve(int n, long[] x) {
		Arrays.sort(x);
		long r = 0;
		for (int i = 0; i < n; i++) {
			r += x[i] % 1000000001;
			if (r > x[i] / 1000000001)
				return "No";
		}
		return "Yes";
	}
}
