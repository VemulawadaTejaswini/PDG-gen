//package codeforces;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.TreeMap;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Stack;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static long cunt = 0;

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static FastReader s = new FastReader();

	public static void main(String[] args) throws IOException {
		/* TODO Auto-generated method stub*/
		// System.out.format("%.10f", ans);char c = sc.next().charAt(0);
		int t=scn.nextInt();
		if(t%2==0)
			System.out.println(t/2);
		else
			System.out.println(t/2+1);
	}
	

	public static String factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.toString();
	}

	public static int bs(int arr[], int k) {
		int high = 0, low = Integer.MIN_VALUE, ans = 0;
		for (int i = 0; i < arr.length; i++) {
			high += arr[i];
			if (arr[i] > low)
				low = arr[i];
		}
		while (low <= high) {
			int mid = (high + low) / 2;
			if (valid(arr, mid, k)) {
				ans = mid;
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return ans;
	}

	public static boolean valid(int arr[], int mid, int k) {
		int sum = 0, cs = 1;
		for (int i = 0; i < arr.length; i++) {
			if (sum + arr[i] > mid) {
				cs++;
				if (cs > k)
					return false;
				sum = arr[i];
			} else
				sum += arr[i];
		}
		return true;
	}

	public static long gcd(long a, long n) {

		if (a == 0)
			return n;
		return gcd(n % a, a);
	}

}
