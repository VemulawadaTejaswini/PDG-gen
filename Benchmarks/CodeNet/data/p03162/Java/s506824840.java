//package godiji;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.io.BufferedReader;
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
	static ArrayList<String>list=new ArrayList<String>();
	
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
		
		int n=scn.nextInt();
		int arr[][]=new int[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		long memo[][]=new long[n+1][3];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<3;j++)
				memo[i][j]=-1;
		}
		System.out.println(vacation(arr, -1, 0,memo));
		
		
		
	}
	public static int vacation(int arr[][],int j,int i,long memo[][])
	{
		if(i==arr.length)
			return 0;
		if(memo[i][Math.max(0, j)]!=-1)
			return (int)memo[i][Math.max(0, j)];
		int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
		
		for(int k=0;k<3;k++)
		{
			if(k!=j)
			{
				b=vacation(arr, k, i+1,memo)+arr[i][k];
			}
			a=Math.max(a, b);
			
		}
		memo[i][Math.max(0, j)]=a;
		return a;
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
	int x;
	int y;

	pair(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

class sorting implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		// TODO Auto-generated method stub

		
			return 0;
	}

}
