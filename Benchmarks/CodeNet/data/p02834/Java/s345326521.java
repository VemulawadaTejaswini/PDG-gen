import java.io.*;
import java.util.*;
 
public class  Main{
	static int[]disttou;
	static int[]disttov;
	static LinkedList<Integer>[]adj;
	static int u,v;
	static void bfs(int root) {
		if(root==u) {
			disttou[root]=0;
		}
		else {
			disttov[root]=0;
		}
		LinkedList<Integer>q=new LinkedList<Integer>();
		q.add(root);
		boolean[]v=new boolean[adj.length];
		v[root]=true;
		while(!q.isEmpty()) {
			int cur=q.removeFirst();
			for(int j:adj[cur]) {
				if(!v[j]) {
					v[j]=true;
					q.add(j);
					if(root==u) {
						disttou[j]=disttou[cur]+1;
					}
					else {
						disttov[j]=disttov[cur]+1;
					}
				}
			}
		}
	}
	public static void main(String[] args) throws Exception{
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();u=sc.nextInt()-1;v=sc.nextInt()-1;
		disttou=new int[n];
		disttov=new int[n];
		adj=new LinkedList[n];
		for(int i=0;i<n;i++)adj[i]=new LinkedList<Integer>();
		for(int i=0;i<n-1;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adj[x].add(y);
			adj[y].add(x);
		}
		bfs(u);
		bfs(v);
		int ans=0;
		for(int i=0;i<n;i++) {
			if(disttou[i]<disttov[i]) {
				ans=Math.max(ans, disttov[i]-1);
			}
		}
		pw.println(ans);
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
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
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
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}