import java.io.*;
import java.util.*;

class Main {
	static final int M = 2;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer>[] ss = new List[m];

		for (int i = 0; i < m; i++) {
			int k = sc.nextInt();
			ss[i] = new ArrayList<>();
			while (k-- > 0) {
				ss[i].add(sc.nextInt());
			}
		}
		int[] ps = new int[m];
		for (int i = 0; i < m; i++) {
			ps[i] = sc.nextInt();
		}

		long count = 0;
		for (int i = 0; i < (1 << n); i++) {
			boolean ok = true;
			for (int j = 0; j < m; j++) {
				int p = 0;
				for (Integer s : ss[j]) {
					if (((i >> (s - 1)) & 1) == 1) {
						p++;
					}
				}
				if (p % 2 != ps[j]) {
					ok = false;
					break;
				}
			}
			if (ok) count++;
		}

		System.out.println(count);
	}
}
