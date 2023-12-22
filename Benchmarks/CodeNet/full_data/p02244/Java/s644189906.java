import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	static final long MOD=1000000007;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int k=sc.nextInt();
		int[] r=new int[k];
		int[] c=new int[k];
		for (int i = 0; i < k; i++) {
			r[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		int[] arr=new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		do{
			boolean flag=true;
			for (int i = 0; i < k; i++) {
				if (arr[r[i]]!=c[i]) {
					flag=false;
					break;
				}
			}
			HashSet<Integer> hashSet1=new HashSet<>();
			HashSet<Integer> hashSet2=new HashSet<>();
			if (flag) {
				for (int i = 0; i < arr.length; i++) {
					hashSet1.add(arr[i]-i);
					hashSet2.add(arr[i]+i);
				}
				if (hashSet1.size()==8&&hashSet2.size()==8) {
					for (int i = 0; i < 8; i++) {
						for (int j = 0; j < 8; j++) {
							if (arr[i]==j) {
								out.print('Q');
							}else {
								out.print('.');
							}
						}
						out.println();
					}
					break;
				}
			}
		} while(Permutation.next(arr));
		out.flush();
	}
	static class Permutation {
        public static boolean next(int[] a) {
            int n = a.length;
 
            int i = n - 1;
            while (i > 0 && a[i - 1] >= a[i]) i--;
            if (i <= 0) return false;
 
            int j = n - 1;
            while (a[j] <= a[i - 1]) j--;
            swap(a, i - 1, j);
 
            int k = n - 1;
            while (i < k) swap(a, i++, k--);
 
            return true;
        }
 
        private static void swap(int[] a, int i, int j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}

