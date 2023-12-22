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
		char[][] cs=new char[N][];
		for (int i = 0; i < cs.length; i++) {
			cs[i]=sc.next().toCharArray();
		}
		int[] kakkocount=new int[N];
		for (int i = 0; i < kakkocount.length; i++) {
			for (int j = 0; j < cs[i].length; j++) {
				if (cs[i][j]=='(') {
					kakkocount[i]++;
				}else {
					kakkocount[i]--;
				}
			}
		}
		int[] maxdepth=new int[N];
		for (int i = 0; i < maxdepth.length; i++) {
			int min=Integer.MAX_VALUE;
			int sum=0;
			for (int j = 0; j < cs[i].length; j++) {
				if (cs[i][j]=='(') {
					sum++;
				}else {
					sum--;
				}
				min=Math.min(min, sum);
			}
			maxdepth[i]=min;
		}
		ArrayList<Integer> OK=new ArrayList<>();
		ArrayList<Pair> subOK=new ArrayList<>();
		ArrayList<Pair> NG=new ArrayList<>();
		//maxdepth<=kakkocount
		for (int i = 0; i < maxdepth.length; i++) {
			if (maxdepth[i]>=0&&kakkocount[i]>=0) {
				OK.add(i);
			}else if (maxdepth[i]<0&&kakkocount[i]>=0) {
				subOK.add(new Pair(i, maxdepth[i]));
			}else {
				NG.add(new Pair(i, kakkocount[i]+maxdepth[i]));
			}
		}
		int T=0;
		Collections.sort(subOK);
		Collections.sort(NG);
		for (Integer integer: OK) {
			T+=kakkocount[integer];
		}
		for (Pair pair : subOK) {
			int i=pair.x;
			if (T+maxdepth[i]<0){
				System.out.println("No");
				return;
			}
			T+=kakkocount[i];
		}
		for (Pair pair : NG) {
			int i=pair.x;
			if (T+maxdepth[i]<0){
				System.out.println("No");
				return;
			}
			T+=kakkocount[i];
		}
		if (T==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
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
    	public int compareTo( Pair p2 ){
    		Pair p1=this;
    		if (this.y<p2.y) {
    			return 1;
    		}
    		else if (this.y>p2.y) {
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
