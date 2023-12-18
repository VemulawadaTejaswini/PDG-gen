import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int ab[][] = new int[n][2];

		for ( int i = 0; i < n; i++ ) {
			ab[i][0] = in.nextInt();
			ab[i][1] = in.nextInt();
		}
		Arrays.sort(ab, (a, b) -> Integer.compare(a[0], b[0]));

		long earn = 0;

		for ( int i1 = 1; i1 <= m; i1++ ) {

			int todayE = 0;
			int idx = -1;
			for ( int i2 = 0; i2 < n; i2++ ) {
				if(ab[i2][0] <= m - i1 + 1 && ab[i2][1] > todayE) {
					todayE = ab[i2][1];
					idx = i2;
				}
			}
			
			if(idx != -1) {
				ab[idx][1] = -1;
			}
			
			earn += todayE;
		}

		System.out.println(earn);

		in.close();
	}
}
