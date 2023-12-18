import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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

		solve_abc077_c();
	}

  
  	public static void solve_abc077_c(){

		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
		}

		for(int i=0;i<N;i++){
			b[i] = sc.nextInt();
		}

		for(int i=0;i<N;i++){
			c[i] = sc.nextInt();
		}


		//long[] aCount = new long[N];
		long[] bCount = new long[N];
		int[] idxC = new int[N];

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);


		//==for b==
		for(int i=N-1;i>=0;i--){
			int bi = b[i];

			//search index of c that b > c
				//binary search
			int left = -1;
			int right;
			if(i == N-1) right	= N;
			else right = idxC[i+1] + 1;

			int mid = 0;

			if(bi < c[left + 1]) idxC[i] = left + 1;
			else if(bi > c[right - 1]) idxC[i] = right;
			else if(right - left == 3) idxC[i] = right - 1;
			else{
				while(left+1 < right){
					mid = (left + right) / 2;

					if(bi == c[mid]){
						right = mid + 1;
						break;
					}
					else if(bi > c[mid]) left = mid;
					else if(bi < c[mid]) right = mid;

				};

				idxC[i] = right;
			}

//			System.out.println("left:" + left + "\t right:" + right + "\t mid:" + mid + "\tidxC[i]:" + idxC[i]);


			//bCount[i] = bCount[i-1] + (bCount[i-1] + (idxC[i] - idxC[i-1])
			if(i == N-1){
				bCount[i] = N -idxC[i];
			}
			else if(i == N-2){
				bCount[i] = bCount[i+1] + (bCount[i+1] + (idxC[i+1] - idxC[i]));
			}
			else{
				bCount[i] = bCount[i+1] + ((bCount[i+1] -bCount[i+2]) + (idxC[i+1] - idxC[i]));
			}
		}

		/*
		for(int i=0;i<N;i++){
			System.out.print(idxC[i] + " ");
		}
		System.out.println();

		for(int i=0;i<N;i++){
			System.out.print(bCount[i] + " ");
		}
		System.out.println();
		*/

		long sum = 0;

		//for a
		for(int i=0;i<N;i++){

			int ai = a[i];

			//search index of b that a > b

			//binary search
			int left	= -1;
			int right	= N;
			int mid = 0;
			int idxB = 0;

			if(ai < b[left + 1]) idxB = left + 1;
			else if(ai > b[right - 1]) idxB = right;
			else if(right - left == 3) idxB = right - 1;
			else{
				while(left+1 < right){
					mid = (left + right) / 2;

					if(ai == b[mid]){
						right = mid+1;
						break;
					}
					else if(ai > b[mid]) left = mid;
					else if(ai < b[mid]) right = mid;
				}
				idxB = right;
			}
//			System.out.println("left:" + left + "\t right:" + right + "\tidxB:" + idxB);

			if(idxB != N){
//				System.out.println("bCount[idxB]:" + bCount[idxB]);	
				sum += bCount[idxB];
			}
		}


		System.out.println(sum);
	}
}