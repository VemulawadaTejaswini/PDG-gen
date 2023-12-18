import java.util.*;
import java.io.*;

public class Main {
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };
	static final int[] DX8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, DY8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int INF = Integer.MAX_VALUE / 3;
	static final long LINF = Long.MAX_VALUE / 3;
	static final String nextLine = "\n";

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int h = fs.nextInt(), w = fs.nextInt(), k = fs.nextInt();
		int field[][] = new int[h][w];
		for(int i=0;i<h;i++) {
			String s = fs.next();
			for(int j=0;j<s.length();j++) {
				field[i][j] = s.charAt(j)-'0';
			}
		}
		int ans = INF;
		int sum[][] = new int[h][w+1];
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				sum[i][j+1] = sum[i][j] + field[i][j];				
			}
		}
		
		//縦の割り方は、割れ目h-1個をbit全探索
		for(int i=0;i<1<<h-1;i++) {
			int cnt = 0;
			for(int j=0;j<h;j++) {
				if((i>>j&1)==1)cnt++;
			}
			//左から右に見ていく
			boolean never = false;
			int mbefore = 0;
			for(int m=0;m<w;m++) {
				boolean ok = true;
				int before = 0;
				for(int j=0;j<h-1;j++) {
					if((i>>j&1)==1) {
						int num = 0;
						for(int t=before;t<j+1;t++) {
							num += sum[t][m+1] - sum[t][mbefore]; 
						}
						if(num>k) {
							cnt++;
							ok = false;
							break;
						}
						before = j+1;
					}
				}
				//最後の断片
				if(ok) {
					int num = 0;
					for(int t=before;t<h;t++) {
						num += sum[t][m+1] - sum[t][mbefore]; 
					}
					if(num>k) {
						cnt++;
						ok = false;
					}
				}
				
				
				if(!ok) {
					mbefore = m;
					m--;
					if(never) {
						break;
					}
					never = true;
					continue;
				}
				never = false;
			}
			if(never)continue;
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}

	//MOD culculations
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}

	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}

	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
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
}