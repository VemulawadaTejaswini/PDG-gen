//package codeforces;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class main {
	// Integer.bitCount(i); count no of 1 bit in a given number
	static Scanner scn = new Scanner(System.in);
//	static class FastReader {
//	BufferedReader br;
//	StringTokenizer st;
//
//	public FastReader() {
//		br = new BufferedReader(new InputStreamReader(System.in));
//	}
//
//	String next() {
//		while (st == null || !st.hasMoreElements()) {
//			try {
//				st = new StringTokenizer(br.readLine());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return st.nextToken();
//	}
//
//	int nextInt() {
//		return Integer.parseInt(next());
//	}
//
//	long nextLong() {
//		return Long.parseLong(next());
//	}
//
//	double nextDouble() {
//		return Double.parseDouble(next());
//	}
//
//	String nextLine() {
//		String str = "";
//		try {
//			str = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return str;
//	}
//}
//
//static FastReader s = new FastReader();
	

	
	public static void main(String[] args) {
		/* TODO Auto-generated method stub */
		// System.out.format("%.10f", ans);char c = sc.next().charAt(0);
		
		
		String str=scn.next();
		String t=scn.next();
		int n=str.length(),m=t.length();
		boolean bl=true;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)!=t.charAt(i))
			{
				bl=false;
				break;
			}
		}
		if(bl)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		
		
}
}
	class pair
	{
		int x;
		int y;
		
		pair(int a,int b)
		{
			this.x=a;
			this.y=b;
			
		}
		public int hashCode()
		 {
		  return x*31+y*31;
		 }
		 
		 public boolean equals(Object other)
		 {
		  if(this==other) return true;
		  
		  if(other instanceof pair)
		  {
		   pair pt = (pair)other;
		   
		   return pt.x==this.x && pt.y==this.y;
		  }
		  else return false;
		 }
	}
	class sorting implements Comparator<pair>
	{

		@Override
		public int compare(pair o1, pair o2) {
			// TODO Auto-generated method stub
			int a=Math.max(o1.x,o2.x),b=o1.y-o2.y;
			return o1.x-o2.x;
		}
		
	}

