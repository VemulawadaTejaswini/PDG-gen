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

		solve_abc162_d();
	}
  
  	public static void solve_abc162_d(){

		FastScanner sc = new FastScanner(System.in);
		
		
		int n = sc.nextInt();
		String s = sc.next();
		
		char[] colors = {'R', 'G', 'B'};
		int[] countColor = new int[3];
		Arrays.fill(countColor, 0);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<colors.length;j++){
				if(s.charAt(i) == colors[j]){
					countColor[j] += 1;
					break;
				}
			}
		}
		
		long countC1 = 1;
		for(int i=0;i<countColor.length;i++){
			countC1 *= countColor[i];
		}
		
		long countC2 = 0;
		
		for(int i=0;i<n-1;i++){
			for(int j=i;j<n;j++){
				int idxk = j + (j - i);
				if(idxk < n){
					char colori = s.charAt(i);
					char colorj = s.charAt(j);
					char colork = s.charAt(idxk);
					
					if((colori != colorj) && (colori != colork) && (colorj != colork)) countC2++;
				}
				else{
					break;
				}
			}
		}
		
		long ans = countC1 - countC2;
		System.out.println(ans);

	}	
}