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
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
		}
		solve(n, a);
		in.close();
	}

	private static void solve(int n, int[] a) {
		boolean[] b = new boolean[n + 1];
		int m = 0;
		for (int i = n; i > 0; i--) {
			int r = 0;
			for (int j = i; j <= n; j += i)
				if (b[j])
					r++;
			r %= 2;
			if (r == a[i])
				continue;
			else {
				b[i] = true;
				m++;
			}
		}
		System.out.println(m);
		for (int i = 1; i <= n; i++)
			if (b[i])
				System.out.println(i);
	}
}
