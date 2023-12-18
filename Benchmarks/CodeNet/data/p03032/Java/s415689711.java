import java.util.*;

public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static int dp(int left, int right, int step, int[] V) {
		assert 0 <= left;
		assert left <= right;
		assert right < V.length;

		if (left == right) {
			return 0;
		}
		if (step >= 1) {
			int v = Math.max(
				dp(left + 1, right, step - 1, V) + V[left],
				dp(left, right - 1, step - 1, V) + V[right]
			);
			v = Math.max(v, 0);
			if (step >= 2) {
				int v2 = Math.max(
					dp(left + 1, right, step - 2, V),
					dp(left, right - 1, step - 2, V)
				);
				return Math.max(v, v2);
			}
			return v;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 50
		int K = sc.nextInt(); // 100
		int[] V = new int[N];
		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}

		int result = dp(0, N-1, K, V);

		System.out.println(result);
	}
}
