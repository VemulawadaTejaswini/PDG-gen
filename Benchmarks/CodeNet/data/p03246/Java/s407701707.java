import java.io.*;
import java.util.*;

public class Main implements Runnable {
	public static void main (String[] args) {new Thread(null, new Main(), "_cf", 1 << 28).start();}

	public void run() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int N = fs.nextInt();
		int[] a = fs.nextIntArray(N);
		int max = 0;
		int[] freq = new int[100100];
		for(int i = 0; i < N; i += 2) {
			freq[a[i]]++;
			max = Math.max(max, freq[a[i]]);
		}
		int[] freq2 = new int[100100];
		for(int i = 1; i < N; i += 2) {
			freq2[a[i]]++;
		}
		int big1 = -1, big2 = -1;
		for(int i = 0; i < 100100; i++) {
			if(freq2[i] == 0) continue;
			if(big1 == -1) big1 = i;
			else {
				if(freq2[i] > freq2[big1]) {
					big2 = big1;
					big1 = i;
				}
				else if(big2 == -1) big2 = i;
				else if(freq2[i] > freq2[big2]) {
					big2 = i;
				}
			}
		}
		
		int res = Integer.MAX_VALUE;
		for(int who = 0; who < N; who += 2) {
			int add = N/2 - freq[a[who]];
			if(a[who] == big1) {
				if(big2 == -1) add += N/2;
				else add += N/2 - freq2[big2];
			}
			else {
				add += N/2 - freq2[big1];
			}
			res = Math.min(res, add);
		}
		
		out.println(res);
		out.close();
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