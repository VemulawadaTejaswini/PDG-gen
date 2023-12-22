import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextInt();
		// not exists 0
		long x = cal(9, n);
		long y = cal(8, n);
		long z = cal(10, n);
		long ans = (z - x - x + y) % 1000000007;
		System.out.println(x + " " + y + " " + z);
		System.out.println(ans);
	}

	private static long cal(long a, long n) {
		long ans = a;
		for (; n > 1; n--) {
			ans = (ans * a) % 1000000007;
		}
		return ans;
	}

}
