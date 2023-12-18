import java.io.*;
import java.util.*;

public class Main{
	static boolean[][]adj;//if adj[x][y]=true , then x and y can't be at the same set
	static int[]col,cnt;
	static ArrayList<int[]>components;
	static boolean bipartite=true;
	static void dfs(int i) {
		cnt[col[i]]++;
		for(int j=0;j<adj.length;j++) {
			if(adj[i][j]) {
				if(col[j]==-1) {
					col[j]=1-col[i];
					dfs(j);
				}
				else {
					if(col[i]==col[j]) {
						bipartite=false;
					}
				}
			}
		}
	}
	static int[][]memo;
	static int dp(int i,int inFirstState) {
		if(i==components.size()) {
			int inSecondState=col.length-inFirstState;
			return inFirstState*(inFirstState-1)/2+inSecondState*(inSecondState-1)/2;
		}
		if(memo[i][inFirstState]!=-1)return memo[i][inFirstState];
		return memo[i][inFirstState]=Math.min(dp(i+1, inFirstState+components.get(i)[0]), dp(i+1, inFirstState+components.get(i)[1]));
	}
	static void main() throws Exception{
		int n=sc.nextInt(),m=sc.nextInt();
		adj=new boolean[n][n];
		for(int i=0;i<n;i++) {
			Arrays.fill(adj[i], true);
			adj[i][i]=false;
		}
		for(int i=0;i<m;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adj[x][y]=adj[y][x]=false;
		}
		col=new int[n];
		cnt=new int[2];
		Arrays.fill(col, -1);
		components=new ArrayList<int[]>();
		for(int i=0;i<n && bipartite;i++) {
			if(col[i]==-1) {
				col[i]=0;
				Arrays.fill(cnt, 0);
				dfs(i);
				components.add(new int[] {cnt[0],cnt[1]});
			}
		}
		if(!bipartite) {
			pw.println(-1);
			return;
		}
		memo=new int[components.size()][n];
		for(int[]i:memo)Arrays.fill(i, -1);
		pw.println(dp(0, 0));
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
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
}
