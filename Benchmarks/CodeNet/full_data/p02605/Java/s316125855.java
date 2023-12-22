import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int[] X=new int[N];
		int[] Y=new int[N];
		String[] Z=new String[N];
		for (int i = 0; i < Z.length; i++) {
			X[i]=sc.nextInt();
			Y[i]=sc.nextInt();
			Z[i]=sc.next();
		}
		HashSet<Integer>[] hashSets=new HashSet[200001];
		TreeSet<Integer>[] treeSets=new TreeSet[200001];
		for (int i = 0; i < hashSets.length; i++) {
			hashSets[i]=new HashSet<>();
			treeSets[i]=new TreeSet<>();
		}
		for (int i = 0; i < N; i++) {
			if (Z[i].equals("D")) {
				hashSets[X[i]].add(Y[i]);
			}
			else if (Z[i].equals("U")) {
				treeSets[X[i]].add(Y[i]);
			}
		}
		long min=Long.MAX_VALUE;
		for (int i = 0; i < treeSets.length; i++) {
			for (Integer integer: hashSets[i]) {
				Integer x=treeSets[i].lower(integer);
				if (x!=null) {
					min=Math.min(min, (integer-x)*5);
				}
			}
		}
		for (int i = 0; i < hashSets.length; i++) {
			hashSets[i].clear();
			treeSets[i].clear();
		}
		for (int i = 0; i < N; i++) {
			if (Z[i].equals("L")) {
				hashSets[Y[i]].add(X[i]);
			}
			else if (Z[i].equals("R")) {
				treeSets[Y[i]].add(X[i]);
			}
		}
		for (int i = 0; i < treeSets.length; i++) {
			for (Integer integer: hashSets[i]) {
				Integer x=treeSets[i].lower(integer);
				if (x!=null) {
					min=Math.min(min, (integer-x)*5);
				}
			}
		}
		HashSet<Integer>[] large=new HashSet[400001];
		TreeSet<Integer>[] mini=new TreeSet[400001];
		for (int i = 0; i < mini.length; i++) {
			large[i]=new HashSet<>();
			mini[i]=new TreeSet<>();
		}
		for (int i = 0; i < N; i++) {
			if (Z[i].equals("R")) {
				mini[Y[i]+X[i]].add(X[i]);
			}
			else if (Z[i].equals("U")) {
				large[X[i]+Y[i]].add(X[i]);
			}
		}
		for (int i = 0; i < mini.length; i++) {
			for (Integer integer: large[i]) {
				Integer x=mini[i].lower(integer);
				if (x!=null) {
					min=Math.min(min, (integer-x)*10);
				}
			}
		}
		for (int i = 0; i < mini.length; i++) {
			mini[i].clear();
			large[i].clear();
		}
		for (int i = 0; i < N; i++) {
			if (Z[i].equals("D")) {
				mini[Y[i]+X[i]].add(X[i]);
			}
			else if (Z[i].equals("L")) {
				large[X[i]+Y[i]].add(X[i]);
			}
		}
		for (int i = 0; i < mini.length; i++) {
			for (Integer integer: large[i]) {
				Integer x=mini[i].lower(integer);
				if (x!=null) {
					min=Math.min(min, (integer-x)*10);
				}
			}
		}
		for (int i = 0; i < mini.length; i++) {
			mini[i].clear();
			large[i].clear();
		}
		for (int i = 0; i < N; i++) {
			if (Z[i].equals("R")) {
				mini[Y[i]-X[i]+200000].add(X[i]);
			}
			else if (Z[i].equals("D")) {
				large[-X[i]+Y[i]+200000].add(X[i]);
			}
		}
		for (int i = 0; i < mini.length; i++) {
			for (Integer integer: large[i]) {
				Integer x=mini[i].lower(integer);
				if (x!=null) {
					min=Math.min(min, (integer-x)*10);
				}
			}
		}
		for (int i = 0; i < mini.length; i++) {
			mini[i].clear();
			large[i].clear();
		}
		for (int i = 0; i < N; i++) {
			if (Z[i].equals("U")) {
				mini[Y[i]-X[i]+200000].add(X[i]);
			}
			else if (Z[i].equals("L")) {
				large[-X[i]+Y[i]+200000].add(X[i]);
			}
		}
		for (int i = 0; i < mini.length; i++) {
			for (Integer integer: large[i]) {
				Integer x=mini[i].lower(integer);
				if (x!=null) {
					min=Math.min(min, (integer-x)*10);
				}
			}
		}
		if (min==Long.MAX_VALUE) {
			System.out.println("SAFE");
			return;
		}
		System.out.println(min);
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
