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
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		solve(a);
		in.close();
	}

	private static void solve(int[] a) {
		// 2*a1=x1+x2
		// 2*a2=x2+x3
		// 2*a3=x3+x4
		// 2*a4=x4+x5
		// 2*a5=x5+x1
		// a1-a2+a3-a4+a5=x1
		long x = 0;
		int f = 1;
		for (int i = 0; i < a.length; i++) {
			x = x + a[i] * f;
			f *= -1;
		}
		System.out.print(x);
		// x2=2*a1-x1
		for (int i = 0; i < a.length - 1; i++) {
			x = 2 * a[i] - x;
			System.out.print(" " + x);
		}
	}
}
