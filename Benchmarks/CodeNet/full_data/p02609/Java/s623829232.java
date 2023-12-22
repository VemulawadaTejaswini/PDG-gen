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
import java.util.LinkedList;
import java.util.ListIterator;
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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			char[] numbers = sc.next().toCharArray();
			
			int popcnt = 0;
			for(final char c : numbers) {
				if(c == '1') { popcnt++; }
			}

			final int plus_popcnt = popcnt + 1;
			final int minus_popcnt = popcnt - 1;
			int plus_index = -1;
			int minus_index = -1;
			long plus_mod = 0, minus_mod = 0;
			
			
			for(int i = 0; i < numbers.length; i++) {
				final char old = numbers[i]; 
				
				if(old == '1') { numbers[i] = '0'; popcnt--; }
				else { numbers[i] = '1'; popcnt++; }
				
				if(old == '1') {
					// minus
					if(minus_index < 0) {
						for(int j = 0; j < N; j++) {
							minus_mod *= 2;
							minus_mod %= minus_popcnt;
							minus_mod += numbers[j] == '1' ? 1 : 0;
							minus_mod %= minus_popcnt;
						}
					}else {
						minus_mod += mod_pow(2, minus_index, minus_popcnt);
						minus_mod %= minus_popcnt;
						minus_mod += (minus_popcnt - mod_pow(2, (numbers.length - 1) - i, minus_popcnt));
						minus_mod %= minus_popcnt;
					}
					minus_index = (numbers.length - 1) - i;
					
					int count = 1;
					long mod = minus_mod;
					while(mod > 0) { count++; mod %= Long.bitCount(mod); }
					System.out.println(count);
				}else {
					// plus
					if(plus_index < 0) {
						for(int j = 0; j < N; j++) {
							plus_mod *= 2;
							plus_mod %= plus_popcnt;
							plus_mod += numbers[j] == '1' ? 1 : 0;
							plus_mod %= plus_popcnt;
						}
					}else {
						plus_mod += (plus_popcnt - mod_pow(2, plus_index, plus_popcnt));
						plus_mod %= plus_popcnt;
						plus_mod += mod_pow(2, (numbers.length - 1) - i, plus_popcnt);
						plus_mod %= plus_popcnt;
					}
					plus_index = (numbers.length - 1) - i;
					
					int count = 1;
					long mod = plus_mod;
					while(mod > 0) { count++; mod %= Long.bitCount(mod); }
					System.out.println(count);
				}
				
				numbers[i] = old;
				if(old == '1') { popcnt++; }
				else { popcnt--; }
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
