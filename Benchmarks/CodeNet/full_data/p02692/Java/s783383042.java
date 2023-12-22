import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=998244353;//1000000007;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		ArrayList<String> arrayList=new ArrayList<>();
		for (int i = 0; i < N; i++) {
			arrayList.add(sc.next());
		}
		if (A+B+C!=2) {
			for (String string : arrayList) {
				if (string.equals("AB")) {
					if (A==0&&B==0) {
						System.out.println("No");
						return;
					}
					if (A>=B) {
						A--;
						B++;
						out.println("B");
					}else {
						A++;
						B--;
						out.println("A");
					}
				}else if (string.equals("AC")) {
					if (A==0&&C==0) {
						System.out.println("No");
						return;
					}
					if (A>=C) {
						A--;
						C++;
						out.println("C");
					}else {
						A++;
						C--;
						out.println("A");
					}
				}else {
					if (C==0&&B==0) {
						System.out.println("No");
						return;
					}
					if (C>=B) {
						C--;
						B++;
						out.println("B");
					}else {
						C++;
						B--;
						out.println("C");
					}
				}
			}
		}else {
			for (int i = 0; i < N; i++) {
				String string=arrayList.get(i);
				if (string.equals("AB")) {
					if (A==0&&B==0) {
						System.out.println("No");
						return;
					}
					if (A>B) {
						A--;
						B++;
						out.println("B");
					}else if (A==B) {
						if (i==N-1) {
							A--;
							B++;
							out.println("B");
						}else if (arrayList.get(i+1).equals("AB")||arrayList.get(i+1).equals("AC")) {
							A++;
							B--;
							out.println("A");
						}else {
							A--;
							B++;
							out.println("B");
						}
					}
					else {
						A++;
						B--;
						out.println("A");
					}
				}else if (string.equals("AC")) {
					if (A==0&&C==0) {
						System.out.println("No");
						return;
					}
					if (A>C) {
						A--;
						C++;
						out.println("C");
					}else if (A==C) {
						if (i==N-1) {
							A--;
							C++;
							out.println("C");
						}else if (arrayList.get(i+1).equals("AB")||arrayList.get(i+1).equals("AC")) {
							A++;
							C--;
							out.println("A");
						}else {
							A--;
							C++;
							out.println("C");
						}
					}
					else {
						A++;
						C--;
						out.println("A");
					}
				}else {
					if (C==0&&B==0) {
						System.out.println("No");
						return;
					}
					if (C>B) {
						C--;
						B++;
						out.println("B");
					}else if (C==B) {
						if (i==N-1) {
							C--;
							B++;
							out.println("B");
						}else if (arrayList.get(i+1).equals("BC")||arrayList.get(i+1).equals("AC")) {
							C++;
							B--;
							out.println("C");
						}else {
							C--;
							B++;
							out.println("B");
						}
					}
					else {
						C++;
						B--;
						out.println("C");
					}
				}
			}
		}
		System.out.println("Yes");
		out.flush();
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
