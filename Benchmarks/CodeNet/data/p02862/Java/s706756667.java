import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();

		BigInteger MOD = BigInteger.valueOf(1000000007L);
		if ( (X + Y) % 3 != 0 ) {
			System.out.println(0);
		} else {
			int N = (X + Y) / 3;
			int x = X - N;
			int y = Y - N;
			
			if ( x < 0 || y < 0 ) {
				System.out.println(0);
			} else {
				BigInteger ans = BigInteger.ONE;
				for ( int i = N ; i > x ; i-- ) {
					ans = ans.multiply(BigInteger.valueOf(i)).mod(MOD);
				}
				for ( int i = 1 ; i <= x ; i++ ) {
					ans = ans.multiply(BigInteger.valueOf(i).modInverse(MOD)).mod(MOD);
				}
				System.out.println(ans.toString());
			}
		}
	}
}
