import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}

		sc.close();

		long ans1x = 0;
		long ans1y = 0;

		for (int i = 0; i < N; i++) {
			int x = X[i];
			int y = Y[i];
			if (x >= 0 && y >= 0) { //第1象限なら使う
				ans1x += x;
				ans1y += y;
			} else if (x < 0 && y < 0) { //第3象限なら使わない
			} else if (x < 0 && y >= 0 && -x < y) { //第2象限なら
				ans1x += x;
				ans1y += y;
			} else if (x >= 0 && y < 0 && x > -y) {
				ans1x += x;
				ans1y += y;
			}
		}

		long ans2x = 0;
		long ans2y = 0;

		for (int i = 0; i < N; i++) {
			int x = X[i];
			int y = -Y[i];
			if (x >= 0 && y >= 0) { //第1象限なら使う
				ans2x += x;
				ans2y += y;
			} else if (x < 0 && y < 0) { //第3象限なら使わない
			} else if (x < 0 && y >= 0 && -x < y) { //第2象限なら
				ans2x += x;
				ans2y += y;
			} else if (x >= 0 && y < 0 && x > -y) {
				ans2x += x;
				ans2y += y;
			}
		}

		long ans3x = 0;
		long ans3y = 0;

		for (int i = 0; i < N; i++) {
			int x = -X[i];
			int y = Y[i];
			if (x >= 0 && y >= 0) { //第1象限なら使う
				ans3x += x;
				ans3y += y;
			} else if (x < 0 && y < 0) { //第3象限なら使わない
			} else if (x < 0 && y >= 0 && -x < y) { //第2象限なら
				ans3x += x;
				ans3y += y;
			} else if (x >= 0 && y < 0 && x > -y) {
				ans3x += x;
				ans3y += y;
			}
		}

		long ans4x = 0;
		long ans4y = 0;

		for (int i = 0; i < N; i++) {
			int x = -X[i];
			int y = -Y[i];
			if (x >= 0 && y >= 0) { //第1象限なら使う
				ans4x += x;
				ans4y += y;
			} else if (x < 0 && y < 0) { //第3象限なら使わない
			} else if (x < 0 && y >= 0 && -x < y) { //第2象限なら
				ans4x += x;
				ans4y += y;
			} else if (x >= 0 && y < 0 && x > -y) {
				ans4x += x;
				ans4y += y;
			}
		}

		double[] ans = new double[4];

		ans[0] = Math.sqrt(ans1x * ans1x + ans1y * ans1y);
		ans[1] = Math.sqrt(ans2x * ans2x + ans2y * ans2y);
		ans[2] = Math.sqrt(ans3x * ans3x + ans3y * ans3y);
		ans[3] = Math.sqrt(ans4x * ans4x + ans4y * ans4y);

		out.println(max(ans));
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private double max(double[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		double candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}
}
