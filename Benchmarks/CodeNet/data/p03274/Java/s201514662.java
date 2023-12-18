import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int K = Integer.parseInt(tokens[1]);
		int[] x = new int[N];
		tokens = in.nextLine().split(" ");
		List<Integer> rights = new ArrayList<>();
		List<Integer> lefts = new ArrayList<>();
		boolean originExists = false;
		for (int i = 0; i < N; ++i) {
			x[i] = Integer.parseInt(tokens[i]);
			if (x[i] < 0) {
				lefts.add(x[i]);
			} else if (x[i] > 0) {
				rights.add(x[i]);
			} else {
				originExists = true;
			}
		}
		Collections.reverse(lefts);

		// 原点から左と右にある点の座標列を求める．
		int k = originExists ? K - 1 : K;
		int result = Integer.MAX_VALUE;
		for (int r = 0; r <= Math.min(k, rights.size()); ++r) {
			int l = k - r;
			if (l > k || l < 0 || l > lefts.size()) {
				continue;
			}
			// 右側からとる数: r, 左側からとる数: l
			// System.out.println(l + ", " + r);
			result = Math.min(result, calcDistance(rights, lefts, r, l));
		}
		System.out.println(result);
		in.close();
	}

	public static int calcDistance(List<Integer> rights, List<Integer> lefts, int r, int l) {
		int rightFirst = 0, leftFirst = 0;
		if (r > 0) {
			rightFirst += rights.get(r - 1) * 2;
			leftFirst += rights.get(r - 1);
		}
		if (l > 0) {
			rightFirst += lefts.get(l - 1) * -1;
			leftFirst += lefts.get(l - 1) * -2;
		}
		return Math.min(rightFirst, leftFirst);
	}
}