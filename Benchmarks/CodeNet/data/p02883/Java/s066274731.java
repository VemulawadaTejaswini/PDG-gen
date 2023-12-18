import java.io.*;
import java.util.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] F = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; ++i) {
			F[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(F);
		long ok = (long) 1e12 + 1;
		long ng = -1;
		while (ok - ng > 1) {
			long middle = (ok + ng) / 2;
			long s = 0;
			for (int i = 0; i < N; ++i) {
				long diff = middle - (long) A[i] * F[N - 1 - i];
				if (diff >= 0)
					continue;
				diff = Math.abs(diff);
				s += (diff + F[N - 1 - i] - 1) / F[N - 1 - i];
			}
			if (s <= K)
				ok = middle;
			else
				ng = middle;
		}
		System.out.println(ok);
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
