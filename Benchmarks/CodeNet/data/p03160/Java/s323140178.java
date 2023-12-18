import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] h = new int[n];
		for ( int i = 0; i < h.length; i++ ) {
			h[i] = in.nextInt();
		}

		// 各番目までの最適コストを格納する配列 dp[] とするのが慣例？
		int[] idealCost = new int[n];
		Arrays.fill(idealCost, Integer.MAX_VALUE);
		idealCost[0] = 0;
		idealCost[1] = Math.abs(h[1] - h[0]);

		// ある杭に飛び移るには、一本前か二本前から飛び移るしかない → コストの小さいほうから飛んでくる
		for ( int i = 2; i < idealCost.length; i++ ) {

			// 一歩前からくる場合
			if ( Math.abs(h[i] - h[i - 1]) < Math.abs(h[i] - h[i - 2]) ) {
				idealCost[i] = idealCost[i - 1] + Math.abs(h[i] - h[i - 1]);
			}
			// 二歩前からくる場合
			else {
				idealCost[i] = idealCost[i - 2] + Math.abs(h[i] - h[i - 2]);
			}
		}

		System.out.println(idealCost[n-1]);
		in.close();
	}
}
