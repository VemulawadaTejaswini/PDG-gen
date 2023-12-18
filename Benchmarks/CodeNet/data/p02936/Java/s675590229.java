import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int q = sc.nextInt();
	static int[][] ab = new int[n][2];
	//	static int[] b = new int[n];
	static int[] p = new int[q + 1];
	static int[] x = new int[q + 1];
	static long[] cnt = new long[n + 1];

	public static void main(String[] args) {

		//どの配列も1-indexed
		for (int i = 1; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}

		Arrays.sort(ab, (a, b) -> Integer.compare(a[0], b[0]));

		for (int i = 1; i < p.length; i++) {
			p[i] = sc.nextInt();
			x[i] = sc.nextInt();
		}

				for (int i = 1; i < p.length; i++) {
					cnt[p[i]] += (long) x[i];
				}

				for (int i = 1; i < n; i++) {
					cnt[ab[i][1]] += (long) cnt[ab[i][0]];
				}

				for (int i = 1; i < cnt.length; i++) {
					System.out.println(cnt[i]);
				}

		//		for (int i = 1; i < n; i++) {
		//			System.out.println(ab[i][0] + " " + ab[i][1]);
		//		}
		sc.close();

	}

}