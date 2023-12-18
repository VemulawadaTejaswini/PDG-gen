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
import java.util.TreeSet;


public class Main {
	
	public static class State implements Comparable<State> {
		int value, pos;
		
		public State (int value, int pos) {
			this.value = value;
			this.pos = pos;
		}

		@Override
		public int compareTo(State o) {
			return Integer.compare(this.value, o.value);
		}
	}
	
	public static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	public static long mod_pow(long a, long e, long m){
		long ret = 1;
		for(; e > 0; e /= 2){
			if(e % 2 != 0) ret = (ret * a) % m;
			a = (a * a) % m;
		}
		return ret;
	}
	public static long mod_inv(long a, long p){
		return mod_pow(a, p-2, p);
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			/*
			long answer = 0;
			for(int i = 1; i <= N; i++) {
				final String str = Integer.toString(i);
				final char str_fst = str.charAt(0);
				final char str_lst = str.charAt(str.length() - 1);
				final boolean str_same = (str_fst == str_lst);
				if(str_lst == '0') { continue; }
				
				final int rev_int = Integer.parseInt((new StringBuilder(str).reverse().toString()));
				final String rev = Integer.toString(rev_int);

				
				if(rev_int <= N) {
					answer += 1;
					System.out.println("rev : " + i + ", " + rev_int);
				}
				
				if(rev.length() != 1 && str_same) { 
					answer += 1; System.out.println("same : " + i + ", " + str_fst);
				}
				
				final int rest = Math.max(0, rev.length() - 2);
				
				if(rest >= 1) {
					answer += 1 << (rest - 1);
				}
			}
			*/
			
			final long MOD = 1000000007;
			long[] as = new long[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextLong();
			}
			
			boolean[] is_prime = new boolean[1000000 + 1];
			Arrays.fill(is_prime, true);
			is_prime[0] = is_prime[1] = false;
			ArrayList<Integer> primes = new ArrayList<Integer>(1000);
			
			for(int i = 0; i < is_prime.length; i++) {
				if(!is_prime[i]) { continue; }
				primes.add(i);
				
				for(int j = 2 * i; j < is_prime.length; j += i) {
					is_prime[j] = false;
				}
			}
			
			int[] counts = new int[is_prime.length];
			for(int i = 0; i < N; i++) {
				long a = as[i];
				for(final int prime : primes) {
					if(a < prime) { break; }
					
					int cnt = 0;
					while((a % prime) == 0) {
						a /= prime;
						cnt++;
					}
					
					counts[prime] = Math.max(counts[prime], cnt);
				}
			}
			
			long lcm = 1;
			for(int i = 0; i < is_prime.length; i++) {
				if(!is_prime[i]) { continue; }
				
				//if(counts[i] > 0) { System.out.println(i + " : " + counts[i]); }
				lcm *= mod_pow(i, counts[i], MOD);
				lcm %= MOD;
			}
			
			long answer = 0;
			for(int i = 0; i < N; i++) {
				final long a = as[i];
				final long b = (lcm * mod_inv(a, MOD)) % MOD;
				
				//System.out.println(lcm + " " + a + " " + b + " " + (a * b) % MOD);
				answer += b;
				answer %= MOD;
			}
			
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