//package godiji;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

import src.Knapsack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int mod = 1000000007;
	

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

	public static void main(String[] args) {
		int t = s.nextInt(), count = 0;
		while (t-- > 0) {
			
			int n=s.nextInt(),w=s.nextInt();
			int val[]=new int[n],wt[]=new int[n];
			long memo[][]=new long[n][w+1];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<w+1;j++)
					memo[i][j]=-1;
			}
			
			for(int i=0;i<n;i++)
			{
				wt[i]=s.nextInt();
				val[i]=s.nextInt();
			}
			System.out.println(knapsack(wt, val, w ,0,0,memo));
		}

	}
	public static long knapsack(int wt[],int val[],int w,int sum,int ind,long memo[][])
	{if(sum==w)
		return 0;
	if(sum>w)
		return Integer.MIN_VALUE;
	if(ind==val.length)
		return 0;
	if(memo[ind][sum]!=-1)
		return memo[ind][sum];
		long a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
		a=knapsack(wt, val, w, sum+wt[ind], ind+1,memo)+val[ind];
		b=knapsack(wt, val, w, sum, ind+1,memo);
		memo[ind][sum]=Math.max(a, b);
		return Math.max(a, b);
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

	public static long string(int n, String str, long memo[]) {
		if (str.length() == n) {
			boolean bl = true;
			for (int i = 0; i < n - 1; i++) {
				if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
					bl = false;
					break;
				}
			}
			if (bl)
				return 1;
			else
				return 0;
		}

		long a = (string(n, str + "0", memo)) % mod;
		long b = (string(n, str + "1", memo)) % mod;
		return (a + b) % mod;
	}

	public static long gcd(long a, long n) {

		if (a == 0)
			return n;
		return gcd(n % a, a);
	}

	public static long lcm(long a, long b) {
		long s = (a * b) / gcd(a, b);
		return s;
	}
}

class pair {
	char x;
	int y;

	pair(char a, int b) {
		this.x = a;
		this.y = b;
	}
}

class sorting implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		// TODO Auto-generated method stub
		int a = (int) (o1.x - o2.x), b = o1.y - o2.y;
		if (a == 0) {
			if (b < 0)
				return -1;
			else
				return 1;
		} else if (a > 0)
			return -1;
		else
			return 1;
	}

}
