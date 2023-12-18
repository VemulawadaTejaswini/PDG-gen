import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int p = in.nextInt();
		int q = in.nextInt();
		int r = in.nextInt();
		System.out.println(solve(p, q, r));
		in.close();
	}

	private static int solve(int p, int q, int r) {
		int a = p + q;
		if (a > q + r)
			a = q + r;
		if (a > r + p)
			a = r + p;
		return a;
	}
}