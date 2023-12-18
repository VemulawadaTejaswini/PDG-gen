
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		double r = solve(n, x, y);
		System.out.println(r);
		in.close();
	}

	private static double solve(int n, int[] x, int[] y) {
		float r = 0;
		for (int i = 0; i < n; i++)
			r += sum(i, 1 << i, n, x, y);
		return r / n;
	}

	private static double sum(int p, int st, int n, int[] x, int[] y) {
		double r = 0;
		int c = 0;
		for (int i = 0; i < n; i++)
			if ((st & (1 << i)) == 0) {
				c++;
				r += sum(i, st | (1 << i), n, x, y)
						+ Math.pow(Math.pow(x[p] - x[i], 2) + Math.pow(y[p] - y[i], 2), 0.5);
			}
		if (c > 0)
			return r / c;
		else
			return 0;
	}

}