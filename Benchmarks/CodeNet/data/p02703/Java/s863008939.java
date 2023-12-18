import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) { new Main(); }

	public Main() {
		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		System.err.println("");

		int n = fs.nextInt(), m = fs.nextInt(), init = fs.nextInt();
		ArrayList<Edge>[] adj = new ArrayList[n];
		for(int i = 0; i < n; i++) adj[i] = new ArrayList<>();
		
		for(int i = 0; i < m; i++) {
			int u = fs.nextInt()-1, v = fs.nextInt()-1;
			int w1 = fs.nextInt(), w2 = fs.nextInt();
			adj[u].add(new Edge(v, w1, w2));
			adj[v].add(new Edge(u, w1, w2));
		}

		int[] per = new int[n];
		long[] time = new long[n];
		for(int i = 0; i < n; i++) {
			per[i] = fs.nextInt();
			time[i] = fs.nextLong();
		}
		
		if(init > 5000) init = 5000;
		
		long oo = (long)1e18;
		long[][] dist = new long[n][5050];
		for(long[] d : dist) Arrays.fill(d, oo);
		
		dist[0][init] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0, init, 0));
		
		while(!pq.isEmpty()) {
			
			Node now = pq.poll();
			if(now.dist != dist[now.idx][now.coin]) continue;
			
			//buy coins?
			{
				int nCoin = now.coin+per[now.idx];
				if(nCoin > 5000) nCoin = 5000;
				long nTime = now.dist+time[now.idx];
				if(nTime < dist[now.idx][nCoin]) {
					dist[now.idx][nCoin] = nTime;
					pq.add(new Node(now.idx, nCoin, nTime));
				}
			}
			
			for(Edge e : adj[now.idx]) { 
				if(now.coin < e.w1) continue;
				long nTime = now.dist+e.w2;
				int nCoin = now.coin - e.w1;
				
				if(dist[e.to][nCoin] > nTime) {
					dist[e.to][nCoin] = nTime;
					pq.add(new Node(e.to, nCoin, nTime));
				}
			}
		}
		
		for(int i = 1; i < n; i++) {
			long min = oo;
			for(int j = 0; j <= 5000; j++) {
				min = Math.min(min, dist[i][j]);
			}
			out.println(min);
		}
		
		out.close();
	}
	
	class Node implements Comparable<Node> {
		int idx, coin;
		long dist;
		Node(int i, int c, long d) {
			idx = i; coin = c; dist = d;
		}
		public int compareTo(Node n) {
			return Long.compare(dist, n.dist);
		}
	}

	class Edge {
		int to, w1, w2;
		Edge(int a, int b, int c) {
			to = a; w1 = b; w2 = c;
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