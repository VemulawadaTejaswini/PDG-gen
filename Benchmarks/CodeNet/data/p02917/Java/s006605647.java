import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int[] b = new int[n - 1];
		for (int i = 0; i < n - 1; i++)
			b[i] = in.nextInt();
		System.out.println(solve(n, b));
		in.close();
	}

	private static int solve(int n, int[] b) {
		int r = b[0];
		for (int i = 0; i < n - 2; i++)
			if (b[i] <= b[i + 1])
				r += b[i];
			else
				r += b[i + 1];
		r += b[n - 2];
		return r;
	}
}