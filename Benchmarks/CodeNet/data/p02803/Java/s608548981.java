import java.io.*;
import java.util.*;
public class Main {
	static int[] dx= {0,0,-1,1},dy= {1,-1,0,0};
	static char[][]in;
	static boolean isValid(int i,int j) {
		return i>=0 && j>=0 && i<in.length && j<in[0].length && in[i][j]!='#';
	}
	static int ans;
	static void bfs(int i,int j) {
		LinkedList<int[]>q=new LinkedList<int[]>();
		q.add(new int[]{i,j,0});
		boolean[][]vis=new boolean[in.length][in[0].length];
		vis[i][j]=true;
		while(!q.isEmpty()) {
			int[]cur=q.poll();
			ans=Math.max(ans, cur[2]);
			for(int o=0;o<4;o++) {
				int ii=cur[0]+dx[o],jj=cur[1]+dy[o];
				if(isValid(ii, jj) && !vis[ii][jj]) {
					vis[ii][jj]=true;
					q.add(new int[] {ii,jj,cur[2]+1});
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		in=new char[n][m];
		for(int i=0;i<n;i++)in[i]=sc.nextLine().toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(in[i][j]!='#') {
					bfs(i, j);
				}
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
