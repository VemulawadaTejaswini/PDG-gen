import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] f = new int[n];
		int sz = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			if (sz == 0) {
				f[sz] = a[0];
				++sz;
			} else {

				int ok = -1;
				int ng = sz;
				while (ng - ok > 1) {
					int middle = (ok + ng) / 2;
					if (f[middle] < a[i]) {
						ok = middle;
					} else {
						ng = middle;
					}
				}

				f[ok + 1] = a[i];
				if (ok + 1 == sz)
					++sz;
			}
		}
		
		System.out.println(sz);

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}