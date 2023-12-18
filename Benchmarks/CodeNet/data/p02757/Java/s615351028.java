import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		String S = sc.next();
		sc.close();

		if ( P == 2 || P == 5 ) {
			long ans = 0;
			for ( int i = N - 1 ; i >= 0 ; i-- ) {
				int digit = S.charAt(i) - '0';
				if ( digit % P == 0 ) {
					ans += i + 1;
				}
			}
			System.out.println(ans);
		} else {
			int[] mods = new int[P];
			mods[0] = 1;
			int D = 1;
			int last = 0;
			long ans = 0;
			for ( int i = N - 1 ; i >= 0 ; i-- ) {
				int digit = S.charAt(i) - '0';
				last = (D * digit + last) % P;
				ans += mods[last];
				mods[last]++;
				D = (D * 10) % P;
			}
			System.out.println(ans);
		}
	}
}
