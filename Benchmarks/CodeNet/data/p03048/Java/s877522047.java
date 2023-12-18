import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		System.out.println(solve(r, g, b, n));
		in.close();
	}

	private static int solve(int r, int g, int b, int n) {
		int ans = 0;
		for (; n >= 0; n -= r)
			for (int m = n; m >= 0; m -= g)
				if (m % b == 0)
					ans++;
		return ans;
	}
}