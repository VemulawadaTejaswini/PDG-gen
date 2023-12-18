import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);

		System.out.println(solve(n, x));
	}

	static long solve(int n, long x) {
		if (n == 0)
			return 1;
		long len = (1L << (n + 1)) - 3;
		long num = (1L << n) - 1;
		if (x == 1)
			return 0;
		else if (x <= len + 1)
			return solve(n - 1, x - 1);
		else if (x == len + 2)
			return num + 1;
		else if (x <= (len + 1) * 2)
			return num + 1 + solve(n - 1, x - len - 2);
		else
			return num * 2 + 1;
	}
}