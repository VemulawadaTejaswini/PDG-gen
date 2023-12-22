import java.io.PrintWriter;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		while (true) {
			int W = sc.nextInt();
			int n = sc.nextInt();
			if (W == 0 && n == 0)
				break;
			long[] accum = new long[n + 1];
			int[] x = new int[n];
			for (int i = 0; i < n; ++i) {
				x[i] = sc.nextInt();
			}
			for (int i = 0; i < n; ++i) {
				accum[i + 1] = accum[i] + x[i];
			}
			int lack = 0;
			int gap = 1;
			outer: for (int i = 15; i >= -1; --i) {
				int ngap = gap + (i >= 0 ? (1 << i) : 0);
				int[] vis = new int[n + 1];
				vis[0] = 1;
				vis[1] = -1;
				for (int j = 0; j < n; ++j) {
					vis[j] += (j > 0 ? vis[j - 1] : 0);
					if (vis[j] > 0) {
						if (accum[n] - accum[j] + (n - j - 1) <= W) {
							continue outer;
						}
						int left = j;
						int right = n;
						while (right - left > 1) {
							int middle = (right + left) / 2;
							if (accum[middle] - accum[j] + (middle - j - 1) <= W) {
								left = middle;
							} else {
								right = middle;
							}
						}
						int dmax = left;

						left = j;
						right = n;
						while (right - left > 1) {
							int middle = (right + left) / 2;
							if (W <= accum[middle] - accum[j] + (long) ngap * (middle - j - 1)) {
								right = middle;
							} else {
								left = middle;
							}
						}
						int dmin = right;
						
						if (dmin > dmax)
							continue;
						++vis[dmin];
						--vis[dmax + 1];
					}
				}
				++lack;
				gap = ngap;
			}
			if (lack > 0)
				++gap;
			pw.println(gap);
		}
		pw.close();
		sc.close();
	}

	
	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}