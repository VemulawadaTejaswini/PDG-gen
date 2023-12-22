import java.util.*;

public class Main {

	public static boolean[] s;
	public static long result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		s = new boolean[200000];
		for (int i = 0; i < k; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			for (int j = l; j <= r; j++) {
				s[j] = true;
			}
		}

		// ゴールからさかのぼって深さ優先探索
		result = 0;
		saiki(n);
		System.out.println(result);

	}

	public static void saiki(long value) {

		// System.out.println(value);

		if (value == 1) {
			result++;
			if (result == 998244353) {
				result = 0;
			}

		}

		for (int i = 1; i < value; i++) {
			if (s[i]) {
				saiki(value - i);
			}
		}

	}
}