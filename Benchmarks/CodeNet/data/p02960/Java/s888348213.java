import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	char[] str;
	int n;
	int[][] dp;
	
	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		str = fs.next().toCharArray();
		n = str.length;
		dp = new int[13][n];
		for(int[] d : dp) Arrays.fill(d, -1);
		out.println(solve(0, 0));
		
		out.close();
	}
	
	int MOD = (int)1e9+7;
	int solve(int rem, int idx) {
		if(idx >= n) {
			return rem == 5 ? 1 : 0;
		}
		if(dp[rem][idx] != -1) return dp[rem][idx];
		if(str[idx] != '?') {
			int nrem = (10*rem+(str[idx]-'0'))%13;
			return dp[rem][idx] = solve(nrem, idx+1);
		}
		int res = 0;
		for(int k = 0; k < 10; k++) {
			int nrem = (10*rem+k)%13;
			int ret = solve(nrem, idx+1);
			res += ret;
			if(res >= MOD) res -= MOD;
		}
		return dp[rem][idx] = res;
	}

	class FastScanner {
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public FastScanner() {
			in = new BufferedInputStream(System.in, BS);
		}

		public FastScanner(String s) {
			try {
				in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
			}
			catch (Exception e) {
				in = new BufferedInputStream(System.in, BS);
			}
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}                
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}
		
		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for(int i = 0; i < n; i++) res[i] = nextInt();
			return res;
		}
		
	}

}