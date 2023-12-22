import java.io.*;

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;

public class Main {
	public static long gcd(long n, long m){ if(m > n) return gcd(m,n); if(m == 0) return n; return gcd(m, n%m);}
	public static long lcm(long m, long n){ return (m/gcd(m,n))*n;}
	static int mod = 1000000007;
	static int INF = Integer.MAX_VALUE;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int[] dx8 = {0,0,1,-1,1,1,-1,-1};
	static int[] dy8 = {1,-1,0,0,1,-1,-1,1};
	public static void main(String[] args){
		FastScanner scanner = new FastScanner();
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		int max = 0;
		boolean[] used = new boolean[n];
		for(int i = 0; i < n; i++){
			if(used[i]) continue;
			int now = i;
			int v = a[now];
			int tmp = 0;
			while(now < n-1){
				now++;
				if(Math.abs(v-a[now]) <= k){
					tmp++;
					v = a[now];
					used[now] = true;
				}
			}
			max = Math.max(max,tmp);
		}
		System.out.println(max);
	}
	private static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
				if (ptr < buflen) {
						return true;
				}else{
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
		private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
		private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
		public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
		public String next() {
				if (!hasNext()) throw new NoSuchElementException();
				StringBuilder sb = new StringBuilder();
				int b = readByte();
				while(isPrintableChar(b)) {
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
				while(true){
						if ('0' <= b && b <= '9') {
								n *= 10;
								n += b - '0';
						}else if(b == -1 || !isPrintableChar(b)){
								return minus ? -n : n;
						}else{
								throw new NumberFormatException();
						}
						b = readByte();
				}
		}
		public int nextInt() {
				long nl = nextLong();
				if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
				return (int) nl;
		}
		public double nextDouble() { return Double.parseDouble(next());}
	}
}
