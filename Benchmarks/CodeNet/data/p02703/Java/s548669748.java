import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		PrintWriter pw=new PrintWriter(System.out);
		MScanner sc = new MScanner(System.in);
		int inf=5000;
		int n=sc.nextInt(),m=sc.nextInt(),s=Math.min(sc.nextInt(), inf);
		LinkedList<int[]>[]adj=new LinkedList[n];
		for(int i=0;i<n;i++)adj[i]=new LinkedList<>();
		
		for(int i=0;i<m;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1,a=sc.nextInt(),b=sc.nextInt();
			adj[x].add(new int[] {y,a,b});
			adj[y].add(new int[] {x,a,b});
		}
		int[]c=new int[n],d=new int[n];
		for(int i=0;i<n;i++) {
			c[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
		long[][]dist=new long[n][inf+1];
		for(int i=0;i<n;i++)Arrays.fill(dist[i], (long)1e15);
		PriorityQueue<long[]>pq=new PriorityQueue<>((x,y)->Long.compare(x[2],y[2]));
		dist[0][s]=0;
		pq.add(new long[] {0,s,0});
		while(!pq.isEmpty()) {
			long[]cur=pq.poll();
			long node=cur[0],money=cur[1],time=cur[2];
			if(dist[(int)node][(int)money]<time)continue;
			//make transaction
			long nxtMoney=Math.min(money+c[(int)node], inf);long nxtTime=time+d[(int)node];
			if(nxtTime<dist[(int)node][(int)nxtMoney]) {
				dist[(int)node][(int)nxtMoney]=nxtTime;
				pq.add(new long[] {node,nxtMoney,nxtTime});
			}
			
			for(int[]edge:adj[(int)node]) {
				int nxtNode=edge[0],cost=edge[1],t=edge[2];
				if(money<cost)continue;
				nxtMoney=money-cost;nxtTime=time+t;
				
				if(nxtTime<dist[nxtNode][(int)nxtMoney]) {
					dist[nxtNode][(int)nxtMoney]=nxtTime;
					pq.add(new long[] {nxtNode,nxtMoney,nxtTime});
				}
			}
		}
		for(int i=1;i<n;i++) {
			long ans=(long)1e15;
			for(int mon=0;mon<=inf;mon++) {
				ans=Math.min(ans, dist[i][mon]);
			}
			pw.println(ans);
		}
		pw.flush();
	}
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static String arrToString(int[]x) {
		return Arrays.toString(x);
	}
	static String arrToString(long[]x) {
		return Arrays.toString(x);
	}
	static String arrToString(Integer[]x) {
		return Arrays.toString(x);
	}
	static String arrToString(Long[]x) {
		return Arrays.toString(x);
	}
}