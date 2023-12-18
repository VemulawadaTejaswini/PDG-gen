import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(), finalLimit = in.nextInt();

		int vmax = 100;
		long dp[] = new long[vmax + 1];
		Arrays.fill(dp, 1, vmax + 1, Integer.MAX_VALUE);
		for ( int i = 1; i <= num; i++ ) {
			int weight = in.nextInt(), value = in.nextInt();

			for ( int v = vmax; v - value >= 0; v-- ) {
				if ( dp[v] > dp[v - value] + weight ) {
					dp[v] = dp[v - value] + weight;
				}
			}
		}
		in.close();

		for ( int v = vmax; 0 <= v; v-- ) {
//			System.out.println(dp[v]);
			if ( dp[v] <= finalLimit ) {
				System.out.println(v);
				return;
			}
		}
		
	}
}