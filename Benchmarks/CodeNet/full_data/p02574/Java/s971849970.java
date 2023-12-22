import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			int[] as = new int[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextInt();
			}
			Arrays.sort(as);
			
			final int LIMIT = 1000000;
			boolean[] is_prime = new boolean[LIMIT + 1];
			Arrays.fill(is_prime, true);
			is_prime[0] = is_prime[1] = false;
			
			ArrayList<Integer> primes = new ArrayList<Integer>();
			for(int i = 2; i <= LIMIT; i++) {
				if(!is_prime[i]){ continue; }
				primes.add(i);
				
				for(int j = 2 * i; j <= LIMIT; j += i) {
					is_prime[j] = false;
				}
			}
			
			boolean pairwise_coprime = true;
			boolean[] used_primes = new boolean[LIMIT + 1];

			LOOP: for(int a : as) {
				for(final int prime : primes) {
					if(a < prime) { break; }
					if(a % prime != 0) { continue; }
					
					if(used_primes[prime]) {
						pairwise_coprime = false;
						break LOOP;
					}
					
					used_primes[prime] = true;
					while(a % prime == 0) { a /= prime; }
				}
			}
			
			if(pairwise_coprime) {
				System.out.println("pairwise coprime");
				return;
			}
			
			long gcd = as[0];
			for(int i = 1; i < N; i++) {
				gcd = gcd(gcd, as[i]);
			}
			
			if(gcd == 1) {
				System.out.println("setwise coprime");
			}else {
				System.out.println("not coprime");
			}
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
