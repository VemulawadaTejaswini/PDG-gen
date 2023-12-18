import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static long MOD = 1000000007;
	static BigInteger BMOD = new BigInteger(Long.toString(MOD));

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int q = sc.nextInt();
		long[] d = new long[k];

		for ( int i = 0 ; i < k ; i++ ) {
			d[i] = sc.nextLong();
		}

		long[] n = new long[q];
		long[] x = new long[q];
		long[] m = new long[q];
		for ( int j = 0 ; j < q ; j++ ) {
			n[j] = sc.nextLong();
			x[j] = sc.nextLong();
			m[j] = sc.nextLong();
		}

		for ( int j = 0 ; j < q ; j++ ) {
			long[] pcnt = new long[k + 1];
			long[] psum = new long[k + 1];
			psum[0] = 0;
			pcnt[0] = 0;
			for ( int i = 0 ; i < k ; i++ ) {
				long dd = d[i] % m[j];
				psum[i + 1] = psum[i] + dd;
				if ( dd > 0 ) {
					pcnt[i + 1] = pcnt[i] + 1;
				} else {
					pcnt[i + 1] = pcnt[i];
				}
			}
			long goal = (x[j] % m[j]) + psum[k] * ((n[j] - 1) / k) + psum[(int)((n[j] - 1) % k)];

			System.out.println(pcnt[k] * ((n[j] - 1) / k) + pcnt[(int)((n[j] - 1) % k)] - goal / m[j] + (x[j] % m[j]) / m[j]);
		}
	}
}
