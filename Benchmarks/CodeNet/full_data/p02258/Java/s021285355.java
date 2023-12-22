import java.util.Arrays;
import java.util.List;

import util.FastReader;

/**
 * @see <a href='http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_1_D'>?????§?????????</a>
 */
public class ALDS1_1_D {
	static FastReader in = new FastReader();

	public static void main(String[] args) throws Exception {
		ALDS1_1_D main = new ALDS1_1_D();
		main.run();
	}

	void run() {
		int n = in.nextInt();
		List<Integer> nums = in.nextIntList(n);
		int[] a = nums.stream().map(i -> new int[]{i, Integer.MIN_VALUE, Integer.MAX_VALUE})
				.reduce(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
						(ints, integer) -> new int[]{Math.max(ints[0], integer[0] - ints[1]), Math.min(ints[1], integer[0])});
		System.out.println(a[0]);
	}
}