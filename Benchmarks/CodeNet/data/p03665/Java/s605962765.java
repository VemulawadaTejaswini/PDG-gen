import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);

	static long nCk(int n, int k) {
		long res = 1;
		for (int i=0; i<k; i++) {
			res = res * (n-i) / (i+1);
		}
		return res;
	}

	static void solve() {
		int n = in.nextInt();
		int p = in.nextInt();
		int[] a = new int[n];
		int x = 0;
		int y = 0;
		for (int i=0; i<n; i++) {
			a[i] = in.nextInt();
			if (a[i] % 2 == 0) {
				x += 1;
			} else {
				y += 1;
			}
		}
		long ans = 0;
		for (int i=p; i<=y; i+=2) {
			ans += nCk(y, i);
		}
		ans *= (long)1<<x;
		out.println(ans);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		solve();
		out.flush();

		long end = System.currentTimeMillis();
		//trace(end-start + "ms");
		in.close();
		out.close();
	}

	static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}