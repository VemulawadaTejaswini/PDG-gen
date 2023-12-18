
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long ans = 1;
		int mod = 1000000007;
		for(int i = 1; i <= n; i++) {
			ans = ans % mod * i % mod;
		}

		System.out.println(ans);
	}
}

