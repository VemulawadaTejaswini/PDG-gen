import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		if (n == 1)
			System.out.println("0");
		else {
			n -= 1;
			int[] u = new int[n];
			int[] v = new int[n];
			int[] w = new int[n];
			for (int i = 0; i < n; i++) {
				u[i] = in.nextInt() - 1;
				v[i] = in.nextInt() - 1;
				w[i] = in.nextInt();
			}
			solve(u, v, w);
		}
		in.close();
	}

	private static void solve(int[] u, int[] v, int[] w) {
		int[] c = new int[w.length + 1];
		c[0] = 1;
		boolean rem = true;
		while (rem) {
			rem = false;
			for (int i = 0; i < w.length; i++)
				if (c[u[i]] == 0 && c[v[i]] == 0)
					rem = true;
				else if (c[u[i]] == 0)
					c[u[i]] = c[v[i]] + 1;
				else if (c[v[i]] == 0)
					c[v[i]] = c[u[i]] + 1;
		}
		for (int i = 0; i < c.length; i++)
			System.out.println(c[i] % 2);
	}
}