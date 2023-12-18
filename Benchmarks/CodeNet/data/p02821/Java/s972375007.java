
// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.
import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		long ok = 0, ng = (long) 2e5 + 1;
		while (ng - ok > 1) {
			long middle = (ok + ng) / 2;
			if (check(A, middle)[0] >= M) {
				ok = middle;
			} else {
				ng = middle;
			}
		}
		long[] get = check(A, ok);
		System.out.println(get[1] - (get[0] - M) * ok);
	}

	long[] check(long[] A, long middle) {
		int N = A.length;
		int t = 0;
		int sz = 0;
		long sum = 0;
		long add = 0;
		for (int i = 0; i < N; ++i)
			add += A[i];
		for (int i = N - 1; i >= 0; --i) {
			add -= A[i];
			while (t < N && A[i] + A[t] < middle) {
				add -= A[t];
				++t;
			}
			if (t > i)
				break;
			sz += 2 * (i - t + 1) - 1;
			sum += 2 * add + 2 * (i - t + 1) * A[i];
		}
		return new long[] { sz, sum };
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
