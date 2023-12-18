import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static long mod_pow(long a, long e, long m){
		if(e == 0){
		return 1;
		}else if(e % 2 == 0){
			long ret = mod_pow(a, e / 2, m);
			return (ret * ret) % m;
		}else{
			return (mod_pow(a, e - 1, m) * a) % m;
		}
	}
	
	public static long mod_inv(long a, long m){
		return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	public static long nCk (long n, long k, final long MOD) {
		long upper = 1;
		long lower = 1;
		
		for(long i = n; i > (n - k); i--) {
			upper *= i;
			upper %= MOD;
		}
		
		for(long i = 1; i <= k; i++) {
			lower *= i;
			lower %= MOD;
		}
		
		//System.out.println(n + " " + k + " " + upper + " " + lower);
		
		return (upper * mod_inv(lower, MOD)) % MOD;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final long N = sc.nextLong();
			
			final long a = sc.nextLong();
			final long b = sc.nextLong();
			
			final long MOD = 1000000007;
			
			long ALL = mod_pow(2, N, MOD);
			ALL = ((ALL + MOD) - 1) % MOD;
			
			final long A = nCk(N, a, MOD);
			final long B = nCk(N, b, MOD);
			
			final long answer = (ALL + MOD - ((A + B) % MOD)) % MOD;
			
			System.out.println(answer);
			
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}