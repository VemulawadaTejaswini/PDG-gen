import java.io.*;
import java.util.*;
public class gym{
	/*
	 * 0 0 0 0
	 * 0 0 0 0
	 * 0 0 0 0
	 * 0 0 0 0
	 */
	static void main() throws Exception{
		int n=sc.nextInt();
		int[]in=sc.intArr(n*n);
		int[][]curAns=new int[n+1][n+1];
		for(int ans=0;ans<n;ans++) {
			for(int i=1+ans;i<=n-ans;i++) {
				curAns[1+ans][i]=ans;
				curAns[i][1+ans]=ans;
				curAns[n-ans][i]=ans;
				curAns[i][n-ans]=ans;
			}
		}
		boolean[][]removed=new boolean[n+1][n+1];
		
		int ans=0;
		int[]dx= {1,0,-1,0},dy= {0,1,0,-1};
		for(int i:in) {
			int x=i-1;
			int curi=(x/n)+1,curj=(x%n)+1;
			LinkedList<int[]>q=new LinkedList<>();
//			System.out.println(i+" "+curi+" "+curj+" "+curAns[curi][curj]);
			removed[curi][curj]=true;
			ans+=curAns[curi][curj];
			q.add(new int[] {curi,curj});
			while(!q.isEmpty()) {
				int [] cur=q.poll();
				for(int k=0;k<4;k++) {
					int nxti=cur[0]+dx[k],nxtj=cur[1]+dy[k];
					if(nxti<=0 || nxtj<=0 || nxti>n || nxtj>n)continue;
					int newval=curAns[cur[0]][cur[1]]+(removed[cur[0]][cur[1]]?0:1);
					if(curAns[nxti][nxtj]<=newval)continue;
					curAns[nxti][nxtj]=newval;
					q.add(new int[] {nxti,nxtj});
				}
			}
		}
		pw.println(ans);
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=1;
		while(tc-->0)main();
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
