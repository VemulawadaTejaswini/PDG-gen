import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++)
			a[i] = in.nextInt();
		if (solve(n, a) < 0)
			System.out.println(-1);
		in.close();
	}

	private static int solve(int n, int[] a) {
		boolean[] b = new boolean[n + 1];
		int m = 0;
		for (int i = n; i > 0; i--) {
			int r = 0;
			for (int j = i; j <= n; j += i)
				if (b[j])
					r++;
			if (r == a[i])
				continue;
			else if (r == a[i] - 1) {
				b[i] = true;
				m++;
			} else
				return -1;
		}
		System.out.println(m);
		for (int i = 1; i <= n; i++)
			if (b[i])
				System.out.println(i);
		return 0;
	}
}
