
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MODULO = 1_000_000_000 + 7;

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] vis = new int[n];
		Arrays.fill(vis, 999);
		vis[0] = 0;
		for (int i = 0; i < m; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
		}
		for (int t = 0; t <= 1; ++t) {
			for (int i = 0; i < m; ++i) {
				if (vis[a[i]] == t || vis[b[i]] == t) {
					vis[a[i]] = Math.min(vis[a[i]], t + 1);
					vis[b[i]] = Math.min(vis[b[i]], t + 1);
				}
			}
		}

		if (vis[n - 1] <= 2) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
