import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");
		
		int Q = fs.nextInt();
		long B = 0;
		int[][] qs = new int[Q][];
		TreeSet<Integer> set = new TreeSet<>();
		for(int i = 0; i < Q; i++) {
			int x = fs.nextInt();
			if(x == 1) {
				qs[i] = new int[3];
				for(int j = 1; j < 3; j++) qs[i][j] = fs.nextInt();
				qs[i][0] = x;
				set.add(qs[i][1]);
			}
			else {
				qs[i] = new int[] {x};
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> rap = new HashMap<>();
		while(!set.isEmpty()) {
			int x = set.pollFirst();
			map.put(x, map.size());
			rap.put(map.size()-1, x);
		}
		int m = map.size();
		BIT sum = new BIT(m);
		BIT cnt = new BIT(m);

		int sz = 0;
		for(int i = 0; i < Q; i++) {
			if(qs[i][0] == 1) {
				
				B += qs[i][2];
				int idx = map.get(qs[i][1]);
				cnt.upd(idx+1, 1);
				sum.upd(idx+1, qs[i][1]);
				sz++;
				
			}
			else {
				
				int great;
				if(sz % 2 == 1) great = sz/2+1;
				else great = sz/2;
				int where = cnt.walk(great)-1;
				long xVal = rap.get(where);
				
				long res = 0;
				if(where-1 >= 0) {
					res += xVal*cnt.sum(where);
					res -= sum.sum(where);
				}
				if(where+1<m) {
					res += sum.sum(m)-sum.sum(where+1);
					res -= xVal*(cnt.sum(m)-cnt.sum(where+1));
				}
				
				out.println(xVal + " " + (res+B));
			}
		}
		
		out.close();
	}

	class BIT {
		int n, log;
		long[] tree;
		BIT(int a) {
			n = a;
			log = Integer.numberOfTrailingZeros(Integer.highestOneBit(n))+1;
			tree = new long[n+1];
		}
		long sum(int i) {
			long res = 0;
			while(i > 0) {
				res += tree[i];
				i -= i &-i;
			}
			return res;
		}
		void upd(int i, long v) {
			while(i <= n) {
				tree[i] += v;
				i += i & -i;
			}
		}
		int walk(long sum) {
			long cur = 0;
			int idx = 0;
			for(int i = log; i >= 0; i--) {
				if(idx+(1<<i) > n) continue;
				int nxt = idx+(1<<i);
				if(cur+tree[nxt] < sum) {
					cur += tree[nxt];
					idx = nxt;
				}
			}
			return idx+1;
		}
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