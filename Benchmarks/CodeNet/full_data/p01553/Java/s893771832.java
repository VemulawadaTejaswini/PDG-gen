import java.util.*;
import java.io.*;

public class Main {
	static long mod = 1000000007;
	static int INF = 1000000000;
 	public static void main(String[] args){
		FastScanner scanner = new FastScanner();
		int n = scanner.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = scanner.next();
		}
		long[][] dp = new long[210][210];
		dp[0][0] = 1;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(s[i].equals("-")){
					dp[i+1][j+1] += dp[i][j];
					dp[i+1][j+1] %= mod;
				}else if(s[i].equals("U")){
					dp[i+1][j+1] += dp[i][j]*(i-j);
					dp[i+1][j+1] %= mod;
					dp[i+1][j] += dp[i][j];
					dp[i+1][j] %= mod;
				}else if(s[i].equals("D")){
					dp[i+1][j+2] += dp[i][j]*(i-j)*(i-j);
					dp[i+1][j+1] += dp[i][j]*(i-j);
					dp[i+1][j+2] %= mod;
					dp[i+1][j+1] %= mod;
				}
			}
		}
		System.out.println(dp[n][n]);
	}
	static class BIT{
		int n;
		int[] bit;
		public BIT(int n){
			this.n = n;
			bit = new int[n+1];
		}
		void add(int idx, int val){
			for(int i = idx+1; i <= n; i += i&(-i)) bit[i-1] += val;
		}
		int sum(int idx){
			int res = 0;
			for(int i = idx+1; i > 0; i -= i&(-i)) res += bit[i-1];
			return res;
		}
		int sum(int begin, int end){
			if(begin == 0) return sum(end);
			return sum(end)-sum(begin-1);
		}
	}
	static class Edge{
		int to;
		Edge(int to){
			this.to = to;
		}
	}
	static class Pair implements Comparable<Pair>{
    int first, second;
    Pair(int a, int b){
        first = a;
        second = b;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair p = (Pair) o;
        return first == p.first && second == p.second;
    }
    @Override
    public int compareTo(Pair p){
        return first == p.first ? second - p.second : first - p.first; //firstで昇順にソート
        //return (first == p.first ? second - p.second : first - p.first) * -1; //firstで降順にソート
        //return second == p.second ? first - p.first : second - p.second;//secondで昇順にソート
        //return (second == p.second ? first - p.first : second - p.second)*-1;//secondで降順にソート
		    //return first * 1.0 / second > p.first * 1.0 / p.second ? 1 : -1; // first/secondの昇順にソート
		    //return first * 1.0 / second < p.first * 1.0 / p.second ? 1 : -1; // first/secondの降順にソート
				//return second * 1.0 / first > p.second * 1.0 / p.first ? 1 : -1; // second/firstの昇順にソート
		    //return second * 1.0 / first < p.second * 1.0 / p.first ? 1 : -1; // second/firstの降順にソート
				//return Math.atan2(second, first) > Math.atan2(p.second, p.first) ? 1 : -1; // second/firstの昇順にソート
				//return first + second > p.first + p.second ? 1 : -1; //first+secondの昇順にソート
				//return first + second < p.first + p.second ? 1 : -1; //first+secondの降順にソート
				//return first - second < p.first - p.second ? 1 : -1; //first-secondの降順にソート
		}
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

