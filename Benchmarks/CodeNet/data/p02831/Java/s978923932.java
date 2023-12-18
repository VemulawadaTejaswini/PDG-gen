import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	static String matrix[][];
	static int dist[][];
	static boolean used[][];

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	static int w;
	static int h;

	static int min = Integer.MAX_VALUE;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		long gcd = lcm(a, b);
		System.out.println(gcd);
	}

	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}
}