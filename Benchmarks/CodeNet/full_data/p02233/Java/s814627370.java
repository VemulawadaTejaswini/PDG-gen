import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		long[] f = new long[n + 1];

		System.out.println(Fib(n, f));

		scan.close();
		System.exit(0);
	}

	private static long Fib(int n, long[] f) {
		if (n <= 1)
			return 1;
		if (f[n] != 0)
			return f[n];
		long r = Fib(n - 2, f) + Fib(n - 1, f);
		return r;
	}
}