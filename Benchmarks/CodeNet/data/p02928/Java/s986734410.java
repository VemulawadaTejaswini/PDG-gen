import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long mod = (long) 10e9 + 7;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long k = in.nextInt();
		int a[] = new int[n];

		for ( int i = 0; i < a.length; i++ ) {
			a[i] = in.nextInt();
		}

		long ans = 0;
		for ( int i1 = 0; i1 < a.length; i1++ ) {
			for ( int i2 = i1 + 1; i2 < a.length; i2++ ) {
				if ( a[i1] > a[i2] ) {
					ans++;
				}
			}
		}
		ans = ans * ( (k * (k + 1) / 2)) % mod;
		System.out.println(ans);
		in.close();
	}
}