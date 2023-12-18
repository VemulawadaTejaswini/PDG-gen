import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int x = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.println(solve(n, x, a));
		in.close();
	}

	private static int solve(int n, int x, int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < n; i++)
			if (x < a[i])
				return i;
			else
				x -= a[i];
		if (x > 0)
			return n - 1;
		else
			return n;
	}
}