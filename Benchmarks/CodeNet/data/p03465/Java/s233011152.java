import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*; 
import java.util.*;
import java.util.regex.*;
/*
	  br = new BufferedReader(new FileReader("input.txt"));
	  pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
	  br = new BufferedReader(new InputStreamReader(System.in));
	  pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
 */

public class Main {
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//int qq = 1;
		int qq = Integer.MAX_VALUE;
		//int qq = readInt();
		for(int casenum = 1; casenum <= qq; casenum++)	{
			int n = readInt();
			int[] l = new int[n];
			for(int i = 0; i < n; i++) {
				l[i] = readInt();
			}
			pw.println(fast(l));
		}
		exitImmediately();
	}

	public static int fast(int[] l) {
		Arrays.sort(l);
		int ret = 0;
		for(int i = 0; i < l.length; i++) {
			ret += l[i];
		}
		if(l.length > 1) ret -= l[l.length-1];
		ret = Math.max(ret, l[l.length-1]);
		return ret;
	}
	
	public static int slow(int[] l) {
		int[] ret = new int[-1+(1<<l.length)];
		for(int mask = 1; mask < (1 << l.length); mask++) {
			for(int i = 0; i < l.length; i++) {
				if((mask&(1<<i)) != 0) {
					ret[mask-1] += l[i];
				}
			}
		}
		Arrays.sort(ret);
		return ret[ret.length/2];
	}
	
	private static void exitImmediately() {
		pw.close();
		System.exit(0);
	}

	private static long readLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private static double readDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private static String nextLine() throws IOException  {
		if(!br.ready()) {
			exitImmediately();
		}
		st = null;
		return br.readLine();
	}

	private static String nextToken() throws IOException  {
		while(st == null || !st.hasMoreTokens())  {
			if(!br.ready()) {
				exitImmediately();
			}
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}
}