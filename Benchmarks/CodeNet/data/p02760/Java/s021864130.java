///package codeforces;

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
		/* TODO Auto-generated method stub */
		// System.out.format("%.10f", ans);char c = sc.next().charAt(0);
		int arr[][] = new int[3][3];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scn.nextInt();

			}
		}
		int n = scn.nextInt();
		int brr[][] = new int[3][3];
		while (n-- > 0) {
			int a = scn.nextInt();
			map.put(a, 1);
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (map.containsKey(arr[i][j]))
					brr[i][j] = 1;
			}
		}
		int count=0,oh=0;
		for(int i=0;i<3;i++)
		{	count=0;
			for(int j=0;j<3;j++)
			{
				if(brr[i][j]==1)
					count++;
			}
			if(count==3)
			{oh=1;
				break;
			}
		}
		if(count==3||oh==1) {
			System.out.println("Yes");
			return;
		}	count=0;oh=0;
		for(int j=0;j<3;j++)
		{	count=0;
			for(int i=0;i<3;i++)
			{
				if(brr[i][j]==1)
					count++;
			}
			if(count==3)
			{oh=1;
				break;
			}
		}
		if(count==3||oh==1) {
			System.out.println("Yes");
			return;
		}count=0;
		for(int i=0;i<3;i++)
		{
			if(brr[i][i]==1)
				count++;
		}
		if(count==3)
			System.out.println("Yes");
		else
			System.out.println("No");
		

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
