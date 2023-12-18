import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

 
public class Main {
	static final long MOD1=1000000007;
	static final long MOD2=998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int D=sc.nextInt();
		ArrayList<Integer>[] arrayLists=new ArrayList[D];
		for (int i = 0; i < arrayLists.length; i++) {
			arrayLists[i]=new ArrayList<>();
		}
		arrayLists[0].add(0);
		HashMap<Integer, Pair> hashMap=new HashMap<>();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				hashMap.put(sc.nextInt(), new Pair(i+1, j+1));
			}
		}
		for (int i = 1; i <=D; i++) {
			arrayLists[i%D].add(0);
			int cur=i;
			while (true) {
				if (!hashMap.containsKey(cur+D)) {
					break;
				}
				Pair bef=hashMap.get(cur);
				Pair aft=hashMap.get(cur+D);
				arrayLists[i%D].add(Math.abs(bef.x-aft.x)+Math.abs(bef.y-aft.y));
				cur=cur+D;
			}
		}
		int[][] d=new int[D][];
		for (int i = 0; i < d.length; i++) {
			d[i]=new int[arrayLists[i].size()];
			for (int j = 1; j < d[i].length; j++) {
				d[i][j]+=arrayLists[i].get(j)+d[i][j-1];
			}
		}
		int Q=sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int L=sc.nextInt();
			int R=sc.nextInt();
			out.println(d[L%D][R/D]-d[L%D][L/D]);
		}
		out.flush();
	}
	static class Pair implements Comparable<Pair>{
    	public int x;
    	public int y;
    	public Pair(int x,int y) {
    		this.x=x;
    		this.y=y;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair) {
    			Pair other = (Pair) obj;
    			return other.x==this.x && other.y==this.y;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair p){
    		if (this.x<p.x) {
    			return 1;
    		}
    		else if (this.x>p.x) {
    			return -1;
    		}
    		else {
    			return 0;
    		}
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
