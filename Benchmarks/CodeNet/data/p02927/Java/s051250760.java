import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int d = in.nextInt();

		int ans = 0;
		for ( int month = 1; month <= m; month++ ) {
			for ( int day = 2; day <= d; day++ ) {
				int d10 = day / 10 != 0 ? day / 10 : 1;
				int d1 = day % 10;

				if ( d10 == 1 || d1 == 1 ) continue;
				else if ( month == d10 * d1 ) ans++;
			}
		}
		System.out.println(ans);
		in.close();
	}
}
