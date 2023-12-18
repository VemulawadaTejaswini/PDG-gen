
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
		int K = sc.nextInt();
		int[] p = new int[3];
		for (int i = 0; i < 3; ++i)
			p[i] = sc.nextInt();
		char[] T = sc.next().toCharArray();
		long[][] dp = new long[N / K + 1][3];
		long ans = 0;
		for (int mod = 0; mod < K; ++mod) {
			for (int i = 0; i < dp.length; ++i)
				for (int j = 0; j < dp[i].length; ++j)
					dp[i][j] = 0;
			int last = 0;
			for (int i = 0; i * K + mod < N; ++i) {
				for (int j = 0; j < 3; ++j) {
					for (int k = 0; k < 3; ++k) {
						if (j == k)
							continue;
						long add = 0;
						if (T[i * K + mod] == 'r' && j == 0)
							add += p[2];
						else if (T[i * K + mod] == 's' && j == 1)
							add += p[0];
						else if (T[i * K + mod] == 'p' && j == 2)
							add += p[1];
						dp[i][j] = Math.max(dp[i][j], (i > 0 ? dp[i - 1][k] : 0) + add);
					}
				}
				last = i;
			}
			ans += Math.max(dp[last][0], Math.max(dp[last][1], dp[last][2]));
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
