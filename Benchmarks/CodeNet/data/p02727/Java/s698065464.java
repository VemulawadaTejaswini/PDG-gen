import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

		solve_abc160_e();
	}
  
  	public static void solve_abc160_e(){

		FastScanner sc = new FastScanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		long[] p = new long[A];
		long[] q = new long[B];
		
		
		int XC = Math.min(X, C);
		int YC = Math.min(Y, C);
		
		long[] r = new long[C + XC + YC];
		
		long sum = 0;
		
		for(int i=0;i<A;i++){
			p[i] = sc.nextLong();
		}
		for(int i=0;i<B;i++){
			q[i] = sc.nextLong();
		}
		for(int i=0;i<C;i++){
			r[i] = sc.nextLong();
			//sum += r[i];
		}
		
		Arrays.sort(p);
		Arrays.sort(q);

		for(int i=A-X;i<A;i++){
			
			if(X >= C){
				if(i<A-X+C){
					r[C+i-A+Y]=p[i];
				}
				else{
					sum+=p[i];
				}
			}
			else{
				r[C+i-A+X]=p[i];
			}
			
		}

		for(int i=B-Y;i<B;i++){
			
			if(Y >= C){
				if(i<B-Y+C){
					r[C+XC+i-B+Y]=q[i];
				}
				else{
					sum+=q[i];
				}
			}
			else{
				r[C+XC+i-B+Y]=q[i];
			}
			
		}

		
		Arrays.sort(r);
		
		//System.out.println(sum);
		
		for(int i=C;i<C+XC+YC;i++){
//			System.out.print(r[i] + " ");
			sum += r[i];
		}
		//System.out.println();
		
		System.out.println(sum);

	}
}