import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		System.out.println(solve(a));
		in.close();
	}

	private static long solve(int[] a) {
		long ans = 0;
		int chk = 0;
		int e = 0;
		for (int s = 0; s < a.length; s++) {
			for (; e < a.length; e++) {
				if ((chk & a[e]) > 0)
					break;
				chk |= a[e];
			}
			ans += (e - s);
			chk ^= a[s];
		}
		return ans;
	}
}
