import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args){

		solve_abc161_d_2();
	}
  
  	public static class solve_abc161_d_2_comparator implements Comparator {

		public int compare(Object s1, Object s2){

			String str1 = (String)s1;
			String str2 = (String)s2;

			if(str1.length() > str2.length()){
				return 1;
			}
			else if(str1.length() < str2.length()){
				return -1;
			}
			else{
				return str1.compareTo(str2);
			}
		}
	}

	public static void solve_abc161_d_2(){

		FastScanner sc = new FastScanner(System.in);

		int k = sc.nextInt();
		long count = 0;
		String ans = "";

		Set<String> m = new HashSet<>();

		Queue<String> q = new PriorityQueue<>(1, new solve_abc161_d_2_comparator());

		for(long i=0;i<10;i++){
			String s = Long.toString(i);
			q.add(s);
			m.add(s);
		}


		while(count < k){

			String a = q.poll();
			long c = Character.getNumericValue(a.charAt(0));

			if(c!=0) count += 1;
			
			//System.out.println("a:" + a + "\t c:" + c);


			for(long i=c-1;i<=c+1;i++){
				String next = Long.toString(i) + a;
				//System.out.println("\t a:" + a + "\t next:" + next);

				if((i<0) || (i >= 10)||(m.contains(next))) continue;

//				System.out.println("\t\t a:" + a + "\t next:" + next);
				m.add(next);
				q.add(next);


			}

			ans = a;
//			System.out.println(ans);
		}

		System.out.println(ans);


	}
}