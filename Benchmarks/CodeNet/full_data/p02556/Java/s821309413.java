import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] pairs = new long[n][2];
		for (int i = 0; i < n; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			pairs[i][0] = x;
			pairs[i][1] = y;
		}
//		for (long[] pair : pairs) System.out.println(Arrays.toString(pair));
		solve(pairs, n);
	}

	private static void solve(long[][] pairs, int n) {
		// TODO Auto-generated method stub
		long ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (pairs[i][0] != pairs[j][0] && pairs[i][1] != pairs[j][1]) {
					long t1 = Math.abs(pairs[i][0] - pairs[j][0]);
					long t2 = Math.abs(pairs[i][1] - pairs[j][1]);
//					System.out.println(t1 + " " + t2);
					ans = Math.max(ans, t1 + t2);
				}
			}
		}
		System.out.println(ans);
	}

}
