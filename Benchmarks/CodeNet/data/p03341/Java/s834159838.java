import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		int[] right = new int[N];
		int[] left = new int[N];
		for (int i = 0; i < N; ++i) {
			right[i] = (i > 0 ? right[i - 1] : 0) + (str.charAt(i) == 'W' ? 1 : 0);
		}
		for (int i = N - 1; i >= 0; --i) {
			left[i] = (i + 1 < N ? left[i + 1] : 0) + (str.charAt(i) == 'E' ? 1 : 0);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; ++i) {
			ans = Math.min(ans, right[i] + left[i] - 1);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
