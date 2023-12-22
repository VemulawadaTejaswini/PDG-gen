//package com.daimens.algorithm.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author DemonSong
 * 
 *         5.GCD and LCM
 * 
 *         GCD and LCM Time Limit : 1 sec, Memory Limit : 65536 KB Japanese
 *         version is here GCD and LCM Write a program which computes the
 *         greatest common divisor (GCD) and the least common multiple (LCM) of
 *         given a and b.
 * 
 *         Input Input consists of several data sets. Each data set contains a
 *         and b separated by a single space in a line. The input terminates
 *         with EOF.
 * 
 *         Constraints 0 < a, b ??? 2,000,000,000 LCM(a, b) ??? 2,000,000,000 The
 *         number of data sets ??? 50 Output For each data set, print GCD and LCM
 *         separated by a single space in a line.
 * 
 *         Sample Input 8 6 50000000 30000000 Output for the Sample Input 2 24
 *         10000000 150000000
 * 
 *
 */
public class Main{

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		System.out.println(gcd(a, b) + " " + lcm(a, b));
	}
	
	private static long gcd(long a, long b){
		if (b == 0) return a;
		return gcd(b, a % b);
	}
	
	private static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	static class Scanner {

		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
			getLine();
		}

		private void getLine() throws IOException {
			while (tok == null || !tok.hasMoreTokens()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok.hasMoreTokens();
		}

		public String next() throws IOException {
			if (hasNext()) {
				return tok.nextToken();
			} else {
				getLine();
				return tok.nextToken();
			}
		}

		public int nextInt() throws IOException {
			if (hasNext()) {
				return Integer.parseInt(tok.nextToken());
			} else {
				getLine();
				return Integer.parseInt(tok.nextToken());
			}
		}

		public long nextLong() throws IOException {
			if (hasNext()) {
				return Long.parseLong(tok.nextToken());
			} else {
				getLine();
				return Long.parseLong(tok.nextToken());
			}
		}

		public double nextDouble() throws IOException {
			if (hasNext()) {
				return Double.parseDouble(tok.nextToken());
			} else {
				getLine();
				return Double.parseDouble(tok.nextToken());
			}
		}
	}

}