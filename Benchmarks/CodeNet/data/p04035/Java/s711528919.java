import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
		int n = in.nextInt();
		int L = in.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n+1];
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			sum[i+1] = a[i];
			sum[i+1] += sum[i];
		}

		int l = 0, r = n-1;
		ArrayList<Integer> ans = new ArrayList<>();
		while (r - l > 0) {
			if (r - l == 1) {
				if (sum[r+1] - sum[l] >= L) {
					ans.add(l+1);
				}
				break;
			}

			if (sum[r+1] - sum[l+1] >= L) {
				ans.add(l+1);
				l++;
				continue;
			}

			if (sum[r] - sum[l] >= L) {
				ans.add(r);
				r--;
				continue;
			}

			break;
		}

		if (ans.size() == n-1) {
			out.println("Possible");
			for (int i : ans) {
				out.println(i);
			}
		} else {
			out.println("Impossible");
		}
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}