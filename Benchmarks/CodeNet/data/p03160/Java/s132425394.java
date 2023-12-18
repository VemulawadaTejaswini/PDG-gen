//package codeforces;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Set;

public class Main {
	// Integer.bitCount(i); count no of 1 bit in a given number
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;

	public static void main(String[] args) {
		// System.out.format("%.10f", ans);char c = sc.next().charAt(0);
		// code
		int n = scn.nextInt();
		long arr[] = new long[n];
		long memo[] = new long[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextLong();
		Arrays.fill(memo,-1);
		System.out.println(mincost(arr, 0, n,  memo));

	}

	public static long mincost(long arr[], int i, int n, long memo[]) {
		if (i == n - 1) {
			return 0;
		}
		if (i >= n) {
			return Integer.MAX_VALUE;
		}
		if (memo[i] != -1)
			return memo[i];

		long a = mincost(arr, i + 1, n,  memo)+ Math.abs(arr[Math.min(n - 1, i + 1)] - arr[i]);
		
		long b = mincost(arr, i + 2, n, memo)+ Math.abs(arr[i] - arr[Math.min(i + 2, n - 1)]);
		
		memo[i]=Math.min(a, b);
		return Math.min(a,b);
	}

	public static boolean[] sieveOfEratosthenes(int n) {

		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				// list.add(i);
			}

		}
		return prime;
	}

	public static class Pair implements Comparable {
		int x;
		int y;
		int z;

		Pair(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public int compareTo(Object o) {
			Pair pp = (Pair) o;
			if (pp.x == x)
				return 0;
			else if (x > pp.x)
				return 1;
			else
				return -1;
		}

	}

}
