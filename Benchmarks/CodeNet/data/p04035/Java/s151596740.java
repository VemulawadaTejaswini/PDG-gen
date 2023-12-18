import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	public void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long l = sc.nextLong();
		long[] a = new long[n];
		long tot = 0;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
			tot += a[i];
		}
		int s = 0, t = n;
		ArrayList<Integer> lis = new ArrayList<>();
		while (t - s > 1) {
			if (tot < l) {
				System.out.println("Impossible");
				return;
			} else {
				if (a[s] < a[t - 1]) {
					tot -= a[s];
					lis.add(s + 1);
					++s;
				} else {
					tot -= a[t - 1];
					lis.add(t - 1);
					--t;
				}
			}
		}
		System.out.println("Possible");
		for (int v : lis) {
			System.out.println(v);
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
