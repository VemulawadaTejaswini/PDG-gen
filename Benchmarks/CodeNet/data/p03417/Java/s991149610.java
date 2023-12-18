import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextInt();
		long m = in.nextInt();
		System.out.println(solve(n, m));
		in.close();
	}

	private static long solve(long n, long m) {
		if (n == 1 && m == 1)
			return 1;
		if (n == 1)
			return m - 2;
		if (m == 1)
			return n - 2;
		return (n - 2) * (m - 2);
	}
}