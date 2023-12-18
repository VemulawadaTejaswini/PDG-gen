
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int d = scn.nextInt();
		int a[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i) - '0';
		}
		long dp[][][] = new long[a.length][d][2];
		for (long v[][] : dp) {
			for (long c[] : v) {
				Arrays.fill(c, -1);
			}
		}
		long ans = (solve(0, 0, 1, a, dp, d) - 1+mod)%mod;
		System.out.println(ans);

	}

	private static long solve(int pos, int rem, int flag, int[] a, long[][][] dp, int d) {
		if (pos == a.length) {
			return rem == 0 ? 1 : 0;
		}
		if (dp[pos][rem][flag] != -1) {
			return dp[pos][rem][flag];
		}
		long res = 0;
		int limit = (flag == 1) ? a[pos] : 9;
		for (int i = 0; i <= limit; i++) {
			if (i == limit && flag==1) {
				res = (res + solve(pos + 1, (rem + i) % d, 1, a, dp, d)) % mod;
			} else {
				res = (res + solve(pos + 1, (rem + i) % d, 0, a, dp, d)) % mod;
			}

		}
		dp[pos][rem][flag] = res%mod;
		return res;
	}

}