	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.PrintWriter;
	import java.math.BigDecimal;
	import java.math.BigInteger;
	import java.sql.Timestamp;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.ZoneOffset;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.BitSet;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Deque;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Random;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.Stack;
	import java.util.StringTokenizer;
	import java.util.TreeMap;
	import java.util.TreeSet;
	import java.util.concurrent.atomic.AtomicInteger;
	import java.util.stream.IntStream;
	import java.util.stream.Stream;
	import java.util.IdentityHashMap;
				
				
	/**
	 * for competitive programming
	 * @author BrolyCode
	 * @version 1.0.0
	 */
				
	public class Main {
		
		static Random random;
		
		private static void mySort(int[] s) {
			for (int i = 0; i < s.length; ++i) {
				int j = random.nextInt(i + 1);
				int t = s[i];
				s[i] = s[j];
				s[j] = t;
			}
			Arrays.sort(s);
		}
					
		static class Pair<A,B>{
			A x;
			B y;
			
			public Pair(A x, B y) {
				this.x=x;
				this.y=y;
			}
	
		}
					
		public static void pairSort(Pair[] p,  Comparator<? super Pair> c) {
			Arrays.sort(p, c);
		}							
				
		public static void main(String[] args) {
			random = new Random(543534151132L + System.currentTimeMillis());
			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			InputReader in = new InputReader(inputStream);
			PrintWriter out = new PrintWriter(outputStream);			        
			task(in,out);		        
			out.close();					
		}
	
		private static void task(InputReader in, PrintWriter out) {
			int n=in.nextInt();
			int w=in.nextInt();
			long dp[][]=new long[n+1][w+1];
			for(int i=1;i<=n;i++) {
				int a=in.nextInt();
				int b=in.nextInt();
				if(a<=w)dp[i][a]=Math.max(dp[i-1][a], b);
				for(int j=1;j<=w;j++) {
					dp[i][j]=Math.max(dp[i][j], dp[i-1][j]);
					if(dp[i-1][j]>0 && j+a<=w) {
						dp[i][j+a]=Math.max(dp[i][j+a], b+dp[i-1][j]);
					}
				}
			}
			long ans=0;
			for(int i=0;i<=w;i++)ans=Math.max(dp[n][i], ans);
			out.println(ans);
		}

		public static int gcd(int a, int b)  
		{ 
	       BigInteger b1 = BigInteger.valueOf(a); 
	       BigInteger b2 = BigInteger.valueOf(b); 
	       BigInteger gcd = b1.gcd(b2); 
	       return gcd.intValue(); 
		} 
				      
		public static long gcd(long a, long b)  
		{ 
			BigInteger b1 = BigInteger.valueOf(a); 
			BigInteger b2 = BigInteger.valueOf(b); 
			BigInteger gcd = b1.gcd(b2); 
			return gcd.longValue(); 
		} 
					
		static class InputReader {
			public BufferedReader reader;
			public StringTokenizer tokenizer;
				
			public InputReader(InputStream stream) {
				reader = new BufferedReader(new InputStreamReader(stream), 32768);
				tokenizer = null;
			}
				
			public String next() {
				while (tokenizer == null || !tokenizer.hasMoreTokens()) {
					try {
						tokenizer = new StringTokenizer(reader.readLine());
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				}
				return tokenizer.nextToken();
			}
				
			public int nextInt() {
				return Integer.parseInt(next());
			}
				        
			public long nextLong() {
				return Long.parseLong(next());
			}
				        
			public double nextDouble() {
				return Double.parseDouble(next());
			}
				        
			public float nextFloat() {
				return Float.parseFloat(next());
			}
				        
		}
				
	}
				
			  
			  