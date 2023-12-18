//package src;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static ArrayList<Integer> adj[];
	static int mod = 1000000007;

	public static void main(String[] args) {

		int h = scn.nextInt(), w = scn.nextInt();
		char arr[][] = new char[h][w];
		for(int i=0;i<h;i++)
		{
			String str=scn.next();
			arr[i]=str.toCharArray();
		}
		long memo[][]=new long[h][w];
		//Arrays.fill(memo, (long)-1);
		System.out.println(countpath(arr, 0, 0, h, w,memo));

	}

	public static int countpath(char arr[][], int i, int j, int h, int w,long memo[][]) {
		if (i == h-1 && j == w-1) 
		{
			return 1;
		}
		if(i>=h||j>=w)
			return 0;
		if (arr[i][j] == '#') {
			return 0;
		}
		if(memo[i][j]!=0)
			return (int)memo[i][j];
		int a = 0, b = 0;
		if (arr[i][j] == '.') {
			a = (countpath(arr, i + 1, j, h, w,memo)) % mod;
			b = (countpath(arr, i, j + 1, h, w,memo)) % mod;
			memo[i][j]=(a+b)%mod;
		}

		return (a + b) % mod;

	}

	public static String binary(long n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		sb.reverse();
		return sb.toString();
	}

	public static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static String factorial(int n) {
		BigInteger fac = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
		}
		return fac.toString();
	}

}

class pair {
	int a;
	int b;
	int c;

	pair(int x, int y, int z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}
}

class sorting implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		// TODO Auto-generated method stub
		int dif = o1.b - o2.b, str = o1.a - o2.a;
		if (dif == 0) {
			if (str < 0)
				return -1;
			else
				return 1;

		} else if (dif < 0) {
			return -1;
		} else
			return 1;
	}

}
