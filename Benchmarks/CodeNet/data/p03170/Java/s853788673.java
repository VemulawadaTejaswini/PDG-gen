import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int a[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			a[i] = in.nextInt();
		}
		in.close();

		char dp[] = new char[k + 1];
		Arrays.fill(dp, 's');
		for ( int di = 0; di <= k; di++ ) {
			if ( dp[di] == 'f' ) continue;

			for ( int ai = 0; ai < n; ai++ ) {
				dp[di + a[ai]] = 'f';
			}
		}

		if ( dp[k] == 'f' ) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}
}