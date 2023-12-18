import java.io.*;
import java.util.*;
public class Main{
	static LinkedList<Integer>[]adj;
	static int[]sub;
	static long[]sumD,originD;
	static boolean[]v;
	static boolean yes;
	static void dfs(int i,int par) {
		v[i]=true;
		for(int j:adj[i]) {
			if(j==par)continue;
			dfs(j, i);
			sumD[i]+=(sumD[j]+sub[j]);
		}
	}
	static void dfs2(int i,int par) {
		for(int j:adj[i]) {
			if(j==par)continue;
			rerooting(i, j);
			yes&=(originD[j]==sumD[j]);
			dfs2(j, i);
			rerooting(j, i);
		}
	}
	static void rerooting(int from,int to) {
		int oldSubFrom=sub[from];
		int oldSubTo=sub[to];
		int newSubFrom=oldSubFrom-oldSubTo;
		int newSubTo=oldSubTo+newSubFrom;
		long newSumDFrom=sumD[from]-(sumD[to]+oldSubTo);
		long newSumDTo=sumD[to]+newSumDFrom+newSubFrom;
		sub[from]=newSubFrom;
		sub[to]=newSubTo;
		sumD[from]=newSumDFrom;
		sumD[to]=newSumDTo;
	}
	static void main() throws Exception{
		int n=sc.nextInt();
		long[][]in=new long[n][];
		originD=new long[n];
		HashMap<Long, Integer>map=new HashMap<>();
		for(int i=0;i<n;i++) {
			in[i]=new long[] {sc.nextLong(),i};
			originD[i]=in[i][0];
			map.put(in[i][0], i);
		}
		Arrays.sort(in,(x,y)->Long.compare(y[0], x[0]));
		sub=new int[n];
		sumD=new long[n];
		Arrays.fill(sub, 1);
		StringBuilder ans=new StringBuilder();
		adj=new LinkedList[n];
		for(int i=0;i<n;i++)adj[i]=new LinkedList<>();
		for(int i=0;i<n-1;i++) {
			long D=in[i][0];int idx=(int)in[i][1];
			long parD=D-(n-sub[idx]-1)+sub[idx]-1;
			if(parD==D || !map.containsKey(parD)) {
				pw.println(-1);
				return;
			}
			int par=map.get(parD);
			sub[par]+=sub[idx];
			ans.append((idx+1)+" "+(par+1)+'\n');
			adj[idx].add(par);
			adj[par].add(idx);
		}
		v=new boolean[n];
		int root=(int)in[n-1][1];
		dfs(root, -1);
		for(boolean i:v) {
			if(!i) {
				pw.println(-1);
				return;
			}
		}
		yes=sumD[root]==originD[root];
		dfs2(root, -1);
		if(!yes) {
			pw.println(-1);
			return;
		}
		pw.println(ans);
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
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