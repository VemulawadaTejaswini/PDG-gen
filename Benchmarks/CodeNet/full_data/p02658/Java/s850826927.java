import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] a = new BigInteger[n];
		BigInteger ans = BigInteger.ONE;
		boolean boo = true;
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextBigInteger();
			if(a[i] == BigInteger.ZERO) {
				boo = false;
				ans = BigInteger.ZERO;
			}
		}

		long s = (long)Math.pow(10, 18);
		if(boo) {
			for(int i = 0; i < n; i++) {
				ans = ans.multiply(a[i]);
				if(ans.compareTo(BigInteger.TEN.pow(18)) > 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(ans);
	}

}