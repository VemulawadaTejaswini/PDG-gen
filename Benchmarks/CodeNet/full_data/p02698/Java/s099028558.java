import java.io.*;
import java.util.*;

public class Main{
	static PrintWriter pw;
	static MScanner  sc;
	
	static int INF=(int)2e9;
	static public class SegmentTree {		// 1-based DS, OOP
		
		int N; 			//the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree, lazy;
		
		SegmentTree(int[] in)		
		{
			array = in; N = in.length - 1;
			sTree = new int[N<<1];		//no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new int[N<<1];
//			build(1,1,N);
		}
		
		
		
		void update_point(int index, int val)			// O(log n)
		{
			index += N - 1;				
			sTree[index] = val;			
			while(index>1)				
			{
				index >>= 1;
				sTree[index] = Math.max(sTree[index<<1] , sTree[index<<1|1]);		
			}
		}
		
		
		
		int query(int i, int j)
		{
			return query(1,1,N,i,j);
		}
		
		int query(int node, int b, int e, int i, int j)	// O(log n)
		{
			if(i>e || j <b)
				return 0;		
			if(b>= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			int q1 = query(node<<1,b,mid,i,j);
			int q2 = query(node<<1|1,mid+1,e,i,j);
			return Math.max(q1 , q2);	
					
		}
		
		int query_point(int i, int j)
		{
			return query_point(1,1,N,i,j);
		}
		
		int query_point(int node, int b, int e, int i, int j)	// O(log n)
		{
			if(i>e || j <b)
				return 0;		
			if(b>= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			if(i<=mid) {
				return query_point(node<<1,b,mid,i,j);
			}
			return query_point(node<<1|1,mid+1,e,i,j);
					
		}
	}
	static SegmentTree st;
	static HashMap<Integer, Integer>map;
	static int[]in;
	static int[]ans;
	static void dfs(int i,int par) {
		int val=map.get(in[i])+1;
		int before=st.query_point(val, val);
		
		int left=1,right=val-1;
		int maxSeq;
		if(right<left) {
			maxSeq=0;
		}
		else {
			maxSeq=st.query(left, right);
		}
//		System.out.println(i+" "+maxSeq+" "+val);
		ans[i]=Math.max(before, maxSeq)+1;
		st.update_point(val, ans[i]);
		
		for(int j:adj[i]) {
			if(j==par)continue;
			dfs(j, i);
		}
		
		st.update_point(val, before);
	}
	static LinkedList<Integer>[]adj;
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int n=sc.nextInt();
		in=sc.intArr(n);
		
		int[]tmp=in.clone();
		shuffle(tmp);
		Arrays.sort(tmp);
		map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(tmp[i]))continue;
			map.put(tmp[i], map.size());
		}
		int N = 1; while(N < map.size()) N <<= 1; //padding
		st=new SegmentTree(new int[N+1]);
		
		ans=new int[n];
		adj=new LinkedList[n];
		for(int i=0;i<n;i++)adj[i]=new LinkedList<>();
		
		for(int i=0;i<n-1;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adj[x].add(y);
			adj[y].add(x);
			
		}
		dfs(0, -1);
		for(int i:ans)pw.println(i);
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
}