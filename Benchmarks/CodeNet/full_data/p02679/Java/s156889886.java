import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.Delayed;
import java.util.logging.Logger;


public class Main {
	static final long MOD=1000000007;
	static int[] par;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		long[] B=new long[N];
		HashMap<Pair, Long> hashMap=new HashMap<>();
		long gomi=0;
		for (int i = 0; i < B.length; i++) {
			A[i]=sc.nextLong();
			B[i]=sc.nextLong();
			if (A[i]==0&&B[i]==0) {
				gomi++;
				continue;
			}
			if (A[i]==0||B[i]==0) {
				if (hashMap.containsKey(new Pair(0, 0))) {
					hashMap.put(new Pair(0, 0), hashMap.get(new Pair(0, 0))+1);
				}else {
					hashMap.put(new Pair(0, 0), 1L);
				}
			}else {
				long g=gcd(A[i], B[i]);
				A[i]/=g;
				B[i]/=g;
				if (hashMap.containsKey(new Pair(A[i], B[i]))) {
					hashMap.put(new Pair(A[i], B[i]), hashMap.get(new Pair(A[i], B[i]))+1);
				}else {
					hashMap.put(new Pair(A[i], B[i]), 1L);
				}
			}
		}
		long ans=1;
		HashMap<Pair, Integer> hashMap2=new HashMap<>();
		for (Pair pair : hashMap.keySet()) {
			hashMap2.put(pair, 0);
		}
		for (Pair pair : hashMap.keySet()) {
			if (!hashMap2.containsKey(pair)) {
				continue;
			}
			if (hashMap.containsKey(new Pair(-pair.y, pair.x))) {
				long a=hashMap.get(pair);
				long b=hashMap .get(new Pair(-pair.y, pair.x));
				ans*=(modPow(2, a)+modPow(2, b)-1);
				hashMap2.remove(new Pair(-pair.y, pair.x));
			}else if (hashMap.containsKey(new Pair(pair.y, -pair.x))) {
				long a=hashMap.get(pair);
				long b=hashMap .get(new Pair(pair.y, -pair.x));
				ans*=(modPow(2, a)+modPow(2, b)-1);
				hashMap2.remove(new Pair(pair.y, -pair.x));
			}else {
				long a=hashMap.get(pair);
				ans*=(modPow(2, a));
			}
			ans%=MOD;
			if (ans<0) {
				ans+=MOD;
			}
		}
		ans+=gomi;
		ans%=MOD;
		ans--;
		if (ans<0) {
			ans+=MOD;
		}
		System.out.println(ans);
	}
	static long gcd(long a,long b) {
		if (b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	static long modPow(long x, long y) {
        long z = 1;
        while (y > 0) {
            if (y % 2 == 0) {
                x = (x * x) % MOD;
                y /= 2;
            } else {
                z = (z * x) % MOD;
                y--;
            }
        }
        return z;
    }
	static class Pair implements Comparable<Pair>{
    	public long x;
    	public long y;
    	public Pair(long x,long y) {
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
