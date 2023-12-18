import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++)
			w[i] = in.nextInt();
		System.out.println(solve(w));
		in.close();
	}

	private static int solve(int[] w) {
		for (int i = 1; i < w.length; i++)
			w[i] = w[i - 1] + w[i];
		int r = 999;
		for (int i = 0; i < w.length; i++) {
			int t = Math.abs(w[w.length - 1] - 2 * w[i]);
			if (r > t)
				r = t;
		}
		return r;
	}
}