import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Long[][] ab = new Long[n][3]; // 0:cost 1:limit 2:cumulative sum

		for ( int i = 0; i < n; i++ ) {
			ab[i][0] = in.nextLong();
			ab[i][1] = in.nextLong();
		}
		in.close();

		Arrays.sort(ab, new Comparator<Long[]>() {
			@Override
			public int compare(Long[] p1, Long[] p2) {
				return Long.compare(p1[1], p2[1]);
			}
		});

		ab[0][2] = ab[0][0];
		if ( ab[0][2] > ab[0][1] ) {
			System.out.println("No");
			return;
		}
		for ( int i = 1; i < n; i++ ) {
			ab[i][2] = ab[i - 1][0] + ab[i - 1][2];

			if ( ab[i][2] > ab[i][1] ) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}
}
