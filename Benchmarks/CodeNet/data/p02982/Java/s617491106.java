import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int d = in.nextInt();
		int[][] x = new int[n][d];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < d; j++)
				x[i][j] = in.nextInt();
		System.out.println(solve(x));
		in.close();
	}

	private static int solve(int[][] x) {
		int r = 0;
		for (int i = 0; i < x.length; i++)
			for (int j = i + 1; j < x.length; j++)
				if (isOk(x[i], x[j]))
					r++;
		return r;
	}

	private static boolean isOk(int[] a, int[] b) {
		long r = 0;
		for (int i = 0; i < a.length; i++)
			r += Math.pow(a[i] - b[i], 2);
		long r2 = (long) Math.pow(r, 0.5);
		if (r2 * r2 == r)
			return true;
		else
			return false;
	}
}
