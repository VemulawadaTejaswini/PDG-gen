import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	private Scanner sc;
	private BigInteger getLoopSteps( int a, int m ) {
		int counter = 1;
		for( int x = a % m; x != 1; x = a * x % m, counter++ );
		return new BigInteger( counter + "" );
	}
	private void run() {
		sc = new Scanner( System.in );
		while( sc.hasNext() ) {
			int a1, m1, a2, m2, a3, m3;
			a1 = sc.nextInt();
			m1 = sc.nextInt();
			a2 = sc.nextInt();
			m2 = sc.nextInt();
			a3 = sc.nextInt();
			m3 = sc.nextInt();
			if( a1 == 0 && m1 == 0 && a2 == 0 && m2 == 0 && a3 == 0 && m3 == 0 ) {
				break;
			}
			BigInteger xc = getLoopSteps( a1, m1 );
			BigInteger yc = getLoopSteps( a2, m2 );
			BigInteger zc = getLoopSteps( a3, m3 );
			BigInteger gcdxy  = xc.gcd( yc );
			BigInteger lcmxy = xc.multiply( yc ).divide( gcdxy );
			BigInteger lcmxyz = lcmxy.multiply( zc ).divide( lcmxy.gcd( zc ) );
			System.out.println( lcmxyz );
		}
		sc.close();
	}
	public static void main( String[] args ) {
		new Main().run();
	}
}