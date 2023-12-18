import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(), WL = in.nextInt();

		long dp[] = new long[WL + 1];
		for ( int i = 1; i < num; i++ ) {
			int weight = in.nextInt(), value = in.nextInt();

			for ( int limit = WL; limit - weight >= 0; limit-- ) {
				if ( dp[limit] < dp[limit - weight] + value ) {
					dp[limit] = dp[limit - weight] + value;
				}

			}
		}
		System.out.println(dp[WL]);
		in.close();
	}
}