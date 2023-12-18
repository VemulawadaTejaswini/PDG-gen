import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		String S = sc.next();
		sc.close();

		int[][] map = new int[10][];
		for ( int i = 0 ; i < 10 ; i++ ) {
			map[i] = new int[P];
			for ( int p = 0 ; p < P ; p++ ) {
				map[i][p] = (10 * p + i) % P;
			}
		}


		long[][] mods = new long[2][];
		mods[0] = new long[P];
		mods[1] = new long[P];
		long ans = 0;
		for ( int i = 0 ; i < N ; i++ ) {
			int last = S.charAt(i) - '0';
			int idx = i % 2;
			int prev = 1 - idx;
			Arrays.fill(mods[idx], 0);
			for ( int j = 0 ; j < P ; j++ ) {
				mods[idx][map[last][j]] += mods[prev][j];
			}
			mods[idx][last % P] += 1;
			ans += mods[idx][0];
		}
		System.out.println(ans);
	}
}
