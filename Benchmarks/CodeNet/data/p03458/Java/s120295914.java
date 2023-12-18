import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	final int MOD = (int)1e9+7;
	void printlnYN(boolean b){out.println((b ? "Yes" : "No"));}
	
	

	//System.out.println();はつかわない！！
	void solve() throws Exception{
		int N = in.nextInt(), K = in.nextInt();
		Imos2D imos = new Imos2D(4*K, 4*K);
		for(int i = 0; i < N; i++){
			int x = in.nextInt(), y = in.nextInt();
			x %= 2*K; y %= 2*K;
			x += K; y += K;
			
			boolean isW = (in.nextChar() == 'W');
			imos.add(y-K+1, y+1, x-K+1, x+1, 1);
			imos.add(y+1, y+K+1, x+1, x+K+1, 1);
		}
		imos.build();
		
		long max = 0;
		for(int i = 0; i < 4*K; i++){
			for(int j = 0; j < 4*K; j++){
				max = Math.max(max, imos.get(i, j));
			}
		}
		out.println(max);
	}
	
	class Imos2D{
		//0-indexed
		int h = 0, w = 0;
		long[][] s;
		boolean isBuilt = true;
		
		public Imos2D(int h, int w){
			this.h = h;
			this.w = w;
			this.s = new long[h+1][w+1];
		}
		
		/*横に[l,r)縦に[u,d)の範囲の加算*/
		public void add(int d, int u, int l, int r, long a){
			s[l][d] += a;
			s[r][d] -= a;
			s[l][u] -= a;
			s[r][u] += a;
			isBuilt = false;
		}
		
		public void build(){
			for(int i = 0; i < h; i++){
				for(int j = 1; j < w; j++){
					s[i][j] += s[i][j-1];
				}
			}
			for(int i = 1; i < h; i++){
				for(int j = 0; j < w; j++){
					s[i][j] += s[i-1][j];
				}
			}
			isBuilt = true;
		}
		
		public long get(int y, int x){
			if(!isBuilt) System.err.println("Error : vector is not built .");
			return s[y][x];
		}
	}
	
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		solve();
		out.flush();
	}
	
	class FastScanner {
		Reader input;

		FastScanner() {this(System.in);}
		FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
		
		int nextInt() {return (int) nextLong();}

		long nextLong() {
			try {
				int sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				long ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) return ret * sign;
					ret *= 10;
					ret += b - '0';
				}
			} catch (IOException e) {
				e.printStackTrace();
				return -1;
			}
		}

		double nextDouble() {
			try {
				double sign = 1;
				int b = input.read();
				while ((b < '0' || '9' < b) && b != '-' && b != '+') {
					b = input.read();
				}
				if (b == '-') {
					sign = -1;
					b = input.read();
				} else if (b == '+') {
					b = input.read();
				}
				double ret = b - '0';
				while (true) {
					b = input.read();
					if (b < '0' || '9' < b) break;
					ret *= 10;
					ret += b - '0';
				}
				if (b != '.') return sign * ret;
				double div = 1;
				b = input.read();
				while ('0' <= b && b <= '9') {
					ret *= 10;
					ret += b - '0';
					div *= 10;
					b = input.read();
				}
				return sign * ret / div;
			} catch (IOException e) {
				e.printStackTrace();
				return Double.NaN;
			}
		}

		char nextChar() {
			try {
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				return (char) b;
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
		}

		String nextStr() {
			try {
				StringBuilder sb = new StringBuilder();
				int b = input.read();
				while (Character.isWhitespace(b)) {
					b = input.read();
				}
				while (b != -1 && !Character.isWhitespace(b)) {
					sb.append((char) b);
					b = input.read();
				}
				return sb.toString();
			} catch (IOException e) {
				e.printStackTrace();
				return "";
			}
		}
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}
 
		public int[] nextIntArrayDec(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt() - 1;
			}
			return res;
		}
 
		public int[] nextIntArray1Index(int n) {
			int[] res = new int[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextInt();
			}
			return res;
		}
 
		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}
 
		public long[] nextLongArrayDec(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong() - 1;
			}
			return res;
		}
 
		public long[] nextLongArray1Index(int n) {
			long[] res = new long[n + 1];
			for (int i = 0; i < n; i++) {
				res[i + 1] = nextLong();
			}
			return res;
		}
 
		public double[] nextDoubleArray(int n) {
			double[] res = new double[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextDouble();
			}
			return res;
		}
	}
}
/* end Main */