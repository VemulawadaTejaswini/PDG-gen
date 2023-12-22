import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

import java.math.BigInteger;

class Main {
    static final int Mod = 998244353;
    static final BigInteger MOD = BigInteger.valueOf(998244353);
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        combinationInit();
        BigInteger ans = BigInteger.ZERO;
        for(int allow = 0;allow<=K;allow++){
            BigInteger tmp = BigInteger.valueOf(M);
            tmp = tmp.multiply(BigInteger.valueOf(M-1).modPow(BigInteger.valueOf(N-(allow+1)), MOD));
            // tmp = tmp.multiply(BigInteger.valueOf(M).modPow(BigInteger.valueOf(allow), MOD));
            tmp = tmp.multiply(BigInteger.valueOf(combination(N-1, allow)));
            tmp = tmp.mod(MOD);
            ans = ans.add(tmp).mod(MOD);
            // System.out.println(ans);
        }
        System.out.println(ans);
    }

	static int MAX = 510000;
	static long[] fac = new long[MAX], finv = new long[MAX], inv = new long[MAX];

	static void combinationInit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < MAX; i++) {
			fac[i] = fac[i - 1] * i % Mod;
			inv[i] = Mod - inv[(int) Mod % i] * (Mod / i) % Mod;
			finv[i] = finv[i - 1] * inv[i] % Mod;
		}
	}

	static long combination(int n, int k) {
		if (n < k)
			return 0;
		if (n < 0 || k < 0)
			return 0;
		return fac[n] * (finv[k] * finv[n - k] % Mod) % Mod;
	}

    public static void main(String[] args) {
        new Main();
    }
}
