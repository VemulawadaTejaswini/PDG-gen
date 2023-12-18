import java.util.*;

public class Main {
	static int MAX = 100000;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Q = in.nextInt();
		int[] primes = new int[MAX+1];
		int[] yes = new int[MAX+1];
		int[] wooh = new int[MAX+1];
		primes[0] = 1;
		primes[1] = 1;
		for( int i = 2; i <= MAX; i++ ) {
			if(primes[i] == 0) {
				for( int j = i*2; j <= MAX; j+=i ) {
					if(primes[i] == 0 ) primes[j] = 1;
				}
			}
		}
		yes[1] = 0;
		for( int i = 2; i <= MAX; i++ ) {
			if( primes[i] == 0 && primes[(int)((i+1)/2)] == 0 ) {
				yes[i] = 1;
			}
		}
		yes[2017] = 1;
		for( int i = 1; i <= MAX; i++ ) {
			wooh[i] = wooh[i-1] + yes[i];
		}
		// for( int i = 19; i <= 51; i++ ) {
		// 	System.out.print(yes[i]+", ");
		// }
		// System.out.println();
		// for( int i = 19; i <= 51; i++ ) {
		// 	System.out.print(wooh[i]+", ");
		// }
		// System.out.println();
		while( Q-- > 0 ) {
			int l = in.nextInt();
			int r = in.nextInt();
			System.out.println(wooh[r]-wooh[l-1]);
		}
	}
}