import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int max = a[0];
		int gcd = a[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, a[i]);
			gcd = BigInteger.valueOf(gcd).gcd(BigInteger.valueOf(a[i])).intValue();
		}

		if (k % gcd == 0 && k <= max) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
