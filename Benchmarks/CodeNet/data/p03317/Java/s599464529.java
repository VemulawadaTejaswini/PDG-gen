import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		for (int i = 0; i < n; i++)
			in.nextInt();
		System.out.println(solve(n, k));
		in.close();
	}

	private static int solve(int n, int k) {
		int r = (n - 1) / (k - 1);
		if ((n - 1) % (k - 1) == 0)
			return r;
		else
			return r + 1;
	}
}