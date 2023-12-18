import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int X = sc1.nextInt();
		int[] x = new int[n];

		for ( int i = 0 ; i < n ; i++ ) {
			x[i] = sc1.nextInt() - X;
		}

		int ans = gcd(x);

		System.out.println(ans);

		sc1.close();

	}

	    public static int gcd(int[] x) {
	        int gcd = IntStream.of(x)
	            .mapToObj(BigInteger::valueOf)
	            .reduce(BigInteger::gcd)
	            .orElse(BigInteger.ZERO)
	            .intValue();

	        //System.out.println(gcd);

	        return gcd;
	    }

}