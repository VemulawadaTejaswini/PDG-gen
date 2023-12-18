import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final boolean TEST = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++)
			v[i] = in.nextInt();
		for (int i = 0; i < n; i++)
			c[i] = in.nextInt();
		System.out.println(solve(v, c));
		in.close();
	}

	private static int solve(int[] v, int[] c) {
		int ans = 0;
		for (int i = 0; i < v.length; i++)
			if (v[i] > c[i])
				ans += v[i] - c[i];
		return ans;
	}
}