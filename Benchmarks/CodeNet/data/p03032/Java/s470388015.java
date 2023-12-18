import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static Deque<Integer> dq = new ArrayDeque<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int minus = 0;
		int total = 0;
		for ( int i = 0; i < n; i++ ) {
			int inp = in.nextInt();
			dq.add(inp);
			if ( inp < 0 ) minus++;
			else total += inp;
		}
		in.close();

		// 全要素から自由に取捨選択できる場合
		if ( n + minus <= k ) {
			System.out.println(total);
			return;
		} else {
			System.out.println(brute(k, 0));
		}

	}

	public static int brute(int k, int sum) {
		// System.out.println("k:" + k + "  sum:" + sum);

		if ( k <= 0 || dq.isEmpty() ) return sum;

		int left = dq.pollFirst();
		int left_keep = brute(k - 1, sum + left);
		int left_drop = 0;
		if ( left < 0 ) {
			left_drop = brute(k - 2, sum);
		}

		dq.addFirst((Integer) left);

		int right = dq.pollLast();
		int right_keep = brute(k - 1, sum + right);
		int right_drop = 0;
		if ( right < 0 ) {
			right_drop = brute(k - 2, sum);
		}

		dq.addLast((Integer) right);

		int lmax = Math.max(left_keep, left_drop);
		int rmax = Math.max(right_keep, right_drop);
		int ret = Math.max(lmax, rmax);
		return ret;
	}
}