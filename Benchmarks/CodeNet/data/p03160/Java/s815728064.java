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
		int arr[] = new int[n];
		int memo[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		Arrays.fill(memo, 1000000);
		memo[0] = arr[0];
		System.out.println(mincost(arr, 0, n, 0, memo));

	}

	public static int mincost(int arr[], int i, int n, int sum, int memo[]) {
		if (i == n - 1) {
			return sum;
		}
		if (i >= n) {
			return Integer.MAX_VALUE;
		}
//		if (memo[i] != -1)
//			return memo[i];

		int a = mincost(arr, i + 1, n, sum + Math.abs(arr[Math.min(n - 1, i + 1)] - arr[i]), memo);
		// memo[Math.min(n - 1, i + 1)] = Math.min(a, memo[Math.min(n - 1, i + 1)]);
		int b = mincost(arr, i + 2, n, sum + Math.abs(arr[i] - arr[Math.min(i + 2, n - 1)]), memo);
		// memo[Math.min(n - 1, i + 2)] = Math.min(memo[Math.min(n - 1, i + 2)], b);

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
