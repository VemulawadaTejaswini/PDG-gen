import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int[] a = nextIntArray(sc, n);

		sc.close();

		int ans1 = max(a);

		int x = ans1/2;
		int minD = Integer.MAX_VALUE;
		int ans2=0;

		for(int i=0;i<n;i++) {
			if(a[i] == ans1) {
				continue;
			}
			if(minD > Math.abs(x-a[i])) {
				minD = Math.abs(x-a[i]);
				ans2 = a[i];
			}
		}

		out.println(ans1 + " " + ans2);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
